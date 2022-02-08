package lesson11;

public final class Truck extends Automobile {

    private final static String car_type = "Грузовой";

    public Truck(int number) {
        this.number = number;
    }

    public Truck(int number, double height, double width, double weight) {
        this.number = number;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "number=" + number +
                ", car_type=" + car_type +
                ", height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

    public void move (int speed) {
        try {
            if (speed > 80 && speed < 100) throw new IllegalArgumentException("Внимание! Автомобиль с номером " + this.number + " превышает установленный скоростной режим!\nЕго скорость составляет: " + speed);
            if (speed > 100) throw new IllegalArgumentException(">>>Внимание!!!<<< Всем патрульным машинам, автомобиль с номером >>>" + this.number + "<<< превышает установленный скоростной режим более чем в 2 раза!\nЕго скорость составляет: " + speed);
            System.out.println("Вжжжжжух, машина проехала!");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    public void checkPointMove() {
        try {
            if (this.height > 4 && this.width > 2.5) throw new IllegalArgumentException("Внимание! Превышены допустимые габариты автомобиля!");
            if (this.weight > 8) throw new IllegalArgumentException("Внимание! Превышена допустимая ширина автомобиля!");
            System.out.println("Автомобиль с номером " + this.number + " проехал КПП");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("Номер автомобиля: " + this.number + "; тип автомобиля: " + car_type);

        }
    }
}
