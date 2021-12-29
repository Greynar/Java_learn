package lesson9;

public final class Truck extends Automobile {
    private String model;
    private static final int MAX_DISTANCE = 1200;

    public Truck(String model) {
        this.model = model;
    }

    public void move(int distance) {
        String text = distance <= MAX_DISTANCE ? " проехал " : " не смог проехать ";
        System.out.println("Грузовой автомобиль " +this.model + text + distance + " км");
    }
}
