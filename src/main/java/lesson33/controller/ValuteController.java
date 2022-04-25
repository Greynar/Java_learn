package lesson33.controller;

import lesson33.service.ValuteFetcher;
import lesson33.dto.ValuteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ValuteController {

    private final ValuteFetcher valuteFetcher;

    @GetMapping("/currency")
    public ValuteDto getValue(@RequestParam String code){
        return new ValuteDto(code, valuteFetcher.getValuteByCode(code)
                .orElseThrow(() -> new IllegalArgumentException("Отсутствует информация о валюте по коду " + code)));
    }
}
