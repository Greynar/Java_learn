package lesson7;

public class Tiger {
    String name;
    int age;
    int staminaRun = 1250;
    int staminaSwim = 200;

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(String name, int age) {
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
            System.out.println("Тигр по имени " + this.name + " пробежал " + distance + " метров");
        } else {
            System.out.println("Тигр по имени " + this.name + " устал и не смог преодолеть такое большое расстояние");
        }
    }

    public void swim(int distance){
        if (distance <= this.staminaSwim) {
            System.out.println("Тигр по имени " + this.name + " проплыл " + distance + " метров");
        } else {
            System.out.println("Тигр по имени " + this.name + " устал и не смог преодолеть такое большое расстояние");
        }
    }

    public void fly(int distance) {
        System.out.println("Тигры не умеют летать");
    }
}
