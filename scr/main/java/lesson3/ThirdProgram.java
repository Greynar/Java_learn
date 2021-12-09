package lesson3;

public class ThirdProgram {
    public static void main(String[] args) {
        quadrEquation(1,-9,20);
        quadrEquation(1,-6,9);
        quadrEquation(2,4,7);
        quadrEquation(1.5,8.7,3.4);
        quadrEquation(0,3,2);

        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(5));
        System.out.println(factorial(8));
        System.out.println(factorial(10));
    }

    public static void quadrEquation(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть равен 0");
        } else {
            double D = b * b - 4 * a * c;
            if (D < 0) {
                System.out.println("Нет действительных решений уравнения");
            } else if (D == 0) {
                double x = -b / (2 * a);
                System.out.println("Корень уравнения - " + x);
            } else {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Корни уравнения - " + x1 + " " + x2);
            }
        }
    }

    public static int factorial (int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }
}
