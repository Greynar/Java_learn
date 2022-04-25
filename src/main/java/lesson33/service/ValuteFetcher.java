package lesson33.service;

import java.math.BigDecimal;
import java.util.Optional;

public interface ValuteFetcher {

    Optional<BigDecimal> getValuteByCode(String code);
}
