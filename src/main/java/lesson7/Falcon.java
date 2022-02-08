package lesson7;

public class Falcon {
    String name;
    int age;
    int staminaFly = 5000;

    public Falcon(String name) {
        this.name = name;
    }

    public Falcon(String name, int age) {
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
        System.out.println("Орлы не умеют бегать");
    }

    public void swim(int distance) {
        System.out.println("Орлы не умеют плавать");
    }

    public void fly(int distance) {
        if (distance <= this.staminaFly) {
            System.out.println("Орел по имени " + this.name + " пролетел " + distance + " метров");
        } else {
            System.out.println("Орел по имени " + this.name + " не смог пролететь такое большое расстояние");
        }
    }
}
