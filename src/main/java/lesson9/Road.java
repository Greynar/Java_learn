package lesson9;

public class Road {

    public static void main(String[] args) {
        Automobile mazda = new Car("Mazda CX 5");
        Automobile kamaz = new Truck("KamAZ");
        Automobile actros = new Truck("Mercedes-Benz Actros");
        Automobile volvo = new Truck("Volvo FH");
        Automobile maz = new Truck("MAZ 6317");
        Automobile hyundai = new Truck("Hyundai Gold");
        Automobile camaro = new Car("Chevrolet Camaro");
        Automobile bmw = new Car("BMW iX");
        Automobile toyota = new Car("Toyota Caldina");
        Automobile honda = new Car("Honda Fit");

        Automobile[] cars = new Automobile[]{mazda, kamaz, actros, camaro, bmw, volvo, maz, hyundai,  toyota, honda};
        for (Automobile car: cars) {
            car.move((int) (Math.random() * 1001));
        }
    }
}
