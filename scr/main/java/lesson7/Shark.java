package lesson7;

public class Shark {
    String name;
    int age;
    int staminaSwim = 3000;

    public Shark(String name) {
        this.name = name;
    }

    public Shark(String name, int age) {
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
        System.out.println("Акулы не умеют бегать (какое счастье!)");
    }

    public void swim(int distance){
        if (distance <= this.staminaSwim) {
            System.out.println("Акула по имени " + this.name + " проплыла " + distance + " метров");
        } else {
            System.out.println("Акула по имени " + this.name + " не смогла преодолеть такое большое расстояние");
        }
    }

    public void fly(int distance) {
        System.out.println("Акулы не умеют летать");
    }
}
