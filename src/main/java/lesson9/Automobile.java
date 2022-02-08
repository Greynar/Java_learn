package lesson9;

public abstract class Automobile {
    protected String model;
    private int distance;

    public Automobile(){}

    public Automobile(String model) {
        this.model = model;
    }

    public abstract void move(int i);
}
