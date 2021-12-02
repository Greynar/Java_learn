package lesson8;

public class HomeCat extends Animal{
    private String  voice= "Мяуу!";

    public HomeCat(String name) {
        super(name);
    }

    public HomeCat(String name, int age) {
        super(name,age);
    }

    public void voice(){
        System.out.println(voice);
    }
}
