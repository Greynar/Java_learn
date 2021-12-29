package lesson14;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhoneNumbers {

    public static String generatePhoneNumber(){
        String number = IntStream.range(0, 10).boxed().map(value -> new Random().nextInt(10) + "").collect(Collectors.joining());
        return "7" + number;
    }
}
