package lesson8;

public class Falcon extends Animal{
    private String  voice= "Кар-кар!";

    public Falcon(String name) {
        super(name);
    }

    public Falcon(String name, int age) {
        super(name,age);
    }

    public void voice(){
        System.out.println(voice);
    }
}
