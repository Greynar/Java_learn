package lesson8;

public class Murloc extends Animal{
    int staminaSwim = 3000;
    private String  voice= "Мрлргрлхргл!";

    public Murloc(String name) {
        super(name);
    }

    public Murloc(String name, int age) {
        super(name,age);
    }

    public void voice(){
        System.out.println(voice);
    }
}
