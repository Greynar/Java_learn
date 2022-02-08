package lesson8;

public class Dog extends Animal{
    private String  voice= "Гав-гав!";

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age) {
        super(name,age);
    }

    public void voice(){
        System.out.println(voice);
    }
}
