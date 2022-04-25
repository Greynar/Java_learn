package lesson33.service.impl;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import lesson33.config.ApplicationProperties;
import lesson33.service.ValuteFetcher;
import lombok.SneakyThrows;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ValuteFetcherImpl implements ValuteFetcher {

    private Map<String, BigDecimal> dictionaryValutes;

    @SneakyThrows
    public ValuteFetcherImpl(ApplicationProperties applicationProperties) {
        final DocumentContext context = JsonPath.parse(applicationProperties.getCbr().getLocation());
        final List<Map<String, Object>> valutes = context.read("$.Valute.*", List.class);
        this.dictionaryValutes = valutes.stream()
                .map(it -> Pair.of(it.get("CharCode").toString(), new BigDecimal(it.get("Value").toString())))
                .collect(Collectors.toMap(Pair::getLeft, Pair::getRight));
    }

    @Override
    public Optional<BigDecimal> getValuteByCode(String code) {
        return Optional.ofNullable(this.dictionaryValutes.get(code));
    }
}
