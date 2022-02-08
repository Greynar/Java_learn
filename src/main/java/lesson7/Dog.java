package lesson7;

public class Dog {
    String name;
    int age;
    int staminaRun = 500;
    int staminaSwim = 10;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(int distance){
        if (distance <= this.staminaRun) {
            System.out.println("Собака по имени " + this.name + " пробежала " + distance + " метров");
        } else {
            System.out.println("Собачка по имени " + this.name + " устала и не смогла преодолеть такое большое расстояние :(");
        }
    }

    public void swim(int distance){
        if (distance <= this.staminaSwim) {
            System.out.println("Собака по имени " + this.name + " проплыла " + distance + " метров");
        } else {
            System.out.println("Собачка по имени " + this.name + " устала и чуть не утонула, поэтому не смогла преодолеть такое большое расстояние :(");
        }
    }

    public void fly(int distance) {
        System.out.println("Собаки не умеют летать");
    }
}
