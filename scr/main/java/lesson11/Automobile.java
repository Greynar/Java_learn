package lesson11;

public abstract class Automobile {
    protected int number;
    protected int speed;
    protected double height;
    protected double width;
    protected double weight;

    public Automobile() {}

    public abstract void move (int speed);

    public  abstract void checkPointMove();
}
