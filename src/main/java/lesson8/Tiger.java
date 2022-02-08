package lesson8;

public class Tiger extends Animal{
    private String  voice= "Рррр!";

    public Tiger(String name) {
        super(name);
    }

    public Tiger(String name, int age) {
        super(name,age);
    }

    public void voice(){
        System.out.println(voice);
    }
}
