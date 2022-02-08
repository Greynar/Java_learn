package lesson10;

import lesson10.enumerations.Constants;
import lesson10.inter.Convertible;

import java.util.Scanner;

public class Converter implements Convertible {
    private double temp_initial;
    private String conv_result;
    private int scale_type_initial;
    private int scale_type_conv;
    private static final String celsius = "Выберите единицы измерения в которые хотите перевести Градусы Цельсия:\n1. Градусы Фаренгейта\n2. Кельвины";
    private static final String fahrenheit = "Выберите единицы измерения в которые хотите перевести Градусы Фаренгейта:\n1. Градусы Цельсия\n2. Кельвины";
    private static final String kelvin = "Выберите единицы измерения в которые хотите перевести Кельвины:\n1. Градусы Цельсия\n2. Градусы Фаренгейта";

    public Converter(int scale_type_initial) {
        this.scale_type_initial = scale_type_initial;
    }

    public double getTempInitial() {
        return temp_initial;
    }

    public void setTempInitial(double temp_initial) {
        this.temp_initial = temp_initial;
    }

    public String getConv_result() {
        return conv_result;
    }

    public void setConv_result(String conv_result) {
        this.conv_result = conv_result;
    }

    public int getScaleTypeInitial() {
        return scale_type_initial;
    }

    public int getScaleTypeConv() {
        return scale_type_conv;
    }

    public void setScaleTypeConv(int scale_type_conv) {
        this.scale_type_conv = scale_type_conv;
    }

    public void temperatureConverter(){
        Scanner scanner = new Scanner(System.in);
        switch (this.scale_type_initial) {
            case 1 -> System.out.println(celsius);
            case 2 -> System.out.println(fahrenheit);
            case 3 -> System.out.println(kelvin);
        }
        this.setScaleTypeConv(scanner.nextInt());
        if (this.scale_type_conv != 1 && this.scale_type_conv != 2) {
            System.out.println("Вы ввели неверное значение!");
            return;
        }
        System.out.println("Введите значение температуры: ");
        this.setTempInitial(scanner.nextInt());
        switch (this.scale_type_initial) {
            case 1 -> this.conv_result = celsiusCalculation(this.scale_type_conv, this.temp_initial);
            case 2 -> this.conv_result = fahrenheitCalculation(this.scale_type_conv, this.temp_initial);
            case 3 -> this.conv_result = kelvinCalculation(this.scale_type_conv, this.temp_initial);
        }
        System.out.println(this.conv_result);
    }

    private String celsiusCalculation(int scale_type_conv, double temp_initial){
        double result;
        String str;
        if (scale_type_conv == 1){
            result = temp_initial * Constants.FAHRENHEIT_COEFF.getValue() + Constants.FAHRENHEIT_CONST.getValue();
            str = (temp_initial + "°C = " + result + "°F");
        } else {
            result = temp_initial + Constants.KELVIN_CONST.getValue();
            str = (temp_initial + "°C = " + result + "K");
        }
        return str;
    }

    public String fahrenheitCalculation(int scale_type_conv, double temp_initial){
        double result;
        String str;
        if (scale_type_conv == 1){
            result = (temp_initial - Constants.FAHRENHEIT_CONST.getValue()) / Constants.FAHRENHEIT_COEFF.getValue();
            str = (temp_initial + "°F = " + result + "°C");
        } else {
            result = (temp_initial - Constants.FAHRENHEIT_CONST.getValue()) / Constants.FAHRENHEIT_COEFF.getValue() + Constants.KELVIN_CONST.getValue();
            str = (temp_initial + "°F = " + result + "K");
        }
        return str;
    }

    public String kelvinCalculation(int scale_type_conv, double temp_initial){
        double result;
        String str;
        if (scale_type_conv == 1){
            result = temp_initial - Constants.KELVIN_CONST.getValue();
            str = (temp_initial + "K = " + result + "°C");
        } else {
            result = (temp_initial - Constants.KELVIN_CONST.getValue()) * Constants.FAHRENHEIT_COEFF.getValue() + Constants.FAHRENHEIT_CONST.getValue();
            str = (temp_initial + "K = " + result + "°F");
        }
        return str;
    }
}
