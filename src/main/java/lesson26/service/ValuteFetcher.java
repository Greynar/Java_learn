package lesson26.service;

import java.math.BigDecimal;
import java.util.List;

public interface ValuteFetcher {

    List<BigDecimal> getValuteByCode(String code);
}