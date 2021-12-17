package lesson11;

public class Road {

    public static void main(String[] args) {
        Automobile[] cars = new Automobile[30];
        ArrayInitializer arr  = new ArrayInitializer();
        arr.arrayInitialize(cars);

        for (Automobile car: cars) {
            car.checkPointMove();
        }

        for (Automobile car: cars) {
            car.move((int) (Math.random() * 200) + 1 );
        }
    }
}
