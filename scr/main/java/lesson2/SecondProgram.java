package lesson2;

public class SecondProgram {

    public static void main(String[] args) {
        long result = calculate(4, 7);
        System.out.println(result);
        result = minus(1988,2021);
        System.out.println(result);
        System.out.println(multiply(11,22));
        System.out.println(division(484,4));
        System.out.println(modulo(115,25));

        System.out.println(pointsDistance(11, -7, 6, 5));
    }

    /**
     * Метод будет складывать 2 аргумента и возвращать результат этой операции
     * @param arg1  первый аргумент
     * @param arg2  второй аргумент
     * @return  результат сложения чисел
     */
    public static long calculate(int arg1, int arg2){
        return arg1 + arg2;
    }
    // Вычитание
    public static long minus(int arg1, int arg2){
        return arg1 - arg2;
    }
    // Умножение
    public static long multiply(int arg1, int arg2){
        return arg1 * arg2;
    }
    // Деление
    public static double division(int arg1, int arg2){
        return arg1 / arg2;
    }
    // Остаток от деления
    public static double modulo(int arg1, int arg2){
        return arg1 % arg2;
    }
    // Расстояние между точками на плоскости
    public static double pointsDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
    }
}
