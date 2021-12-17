package lesson11;

public class ArrayInitializer {

    public Automobile[] arrayInitialize(Automobile[] cars) {
        int random_number;
        double random_height;
        double random_width;
        double random_weight;
        for (int i = 0; i < 30; i++) {
            random_number = (int) (Math.random() * 899) + 100;
            random_height = Math.round(((Math.random() * 3.8) + 1.2) * 10) / 10.0d;
            random_width = Math.round(((Math.random() * 3) + 1) * 10) / 10.0d;
            random_weight = Math.round(((Math.random() * 19) + 1) * 10) / 10.0d;
            if ((int) (Math.random() * 2) == 1) {
                cars[i] = new Car(random_number, random_height, random_width, random_weight);
            } else {
                cars[i] = new Truck(random_number, random_height, random_width, random_weight);
            }
        }
        return cars;
    }
}
