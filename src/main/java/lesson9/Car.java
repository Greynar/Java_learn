package lesson9;

public final class Car extends Automobile {
    private String model;
    private static final int MAX_DISTANCE = 500;

    public Car(String model) {
        this.model = model;
    }

    public void move(int distance) {
        String text = distance <= MAX_DISTANCE ? " проехал " : " не смог проехать ";
        System.out.println("Автомобиль " + this.model + text + distance + " км");
    }
}
