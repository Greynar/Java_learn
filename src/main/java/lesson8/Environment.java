package lesson8;

public class Environment {
    public static void main(String[] args) {
        Dog spike = new Dog("Spike", 4);
        HomeCat tom = new HomeCat("Tom", 3);
        Tiger pushistik = new Tiger("Пушистик", 5);
        Murloc murchal = new Murloc("Мурчаль", 20);
        Murloc gurky = new Murloc("Gurky", 12);
        Falcon johny = new Falcon("Johny", 3);

        Animal[] animals = new Animal[]{spike, tom, pushistik, murchal, gurky, johny};
        for (Animal animal: animals) {
            animal.voice();
        }
    }

}
