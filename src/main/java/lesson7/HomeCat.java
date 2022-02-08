package lesson7;

import org.w3c.dom.ls.LSOutput;

public class HomeCat {
    String name;
    int age;
    int stamina = 200;


    public HomeCat(String name) {
        this.name = name;
    }

    public HomeCat(String name, int age) {
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
        if (distance <= this.stamina) {
            System.out.println("Котик по имени " + this.name + " пробежал " + distance + " метров");
        } else {
            System.out.println("Котик по имени " + this.name + " устал и не смог преодолеть такое большое расстояние :(");
        }
    }

    public void swim(int distance){
        System.out.println("Котик по имени " + this.name + " не умеет плавать :(");
    }

    public void fly(int distance) {
        System.out.println("Коты не умеют летать");
    }
}
