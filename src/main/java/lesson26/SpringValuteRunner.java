package lesson26;

import lesson26.service.ValuteFetcher;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Configuration
@ComponentScan("lesson26")
public class SpringValuteRunner {
    private static final String EXIT_PHRASE = "выход";

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringValuteRunner.class);
        final ValuteFetcher va = annotationConfigApplicationContext.getBean(ValuteFetcher.class);

        System.out.println("Введите код валюты, информацию по которой хотите получить");
        System.out.printf("или введите %s для завершения работы программы:\n", EXIT_PHRASE);
        final Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final String text = scanner.nextLine();
            if (EXIT_PHRASE.equalsIgnoreCase(text)) {
                return;
            }
            if (StringUtils.isBlank(text)) {
                System.out.println("Введите непустое значение кода валюты");
                continue;
            }

            List<BigDecimal> valuteByCode = va.getValuteByCode(text.toUpperCase());
            Optional.of(valuteByCode.get(0)).ifPresentOrElse(
                    value -> {
                        System.out.printf("Текущий курс валюты %s номиналом %s равен %.4f рублей\n", text, valuteByCode.get(1), value);
                        System.out.println("При необходимости укажите новый код валюты или завершите работу программы");
                    },
                    () -> System.out.println("Введен несуществующий код валюты. Попробуйте еще!")
            );
        }
    }
}
