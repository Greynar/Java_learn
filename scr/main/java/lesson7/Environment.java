package lesson7;

public class Environment {
    public static void main(String[] args) {
        Dog spike = new Dog("Spike", 4);
        Dog greg = new Dog("Greg", 2);
        HomeCat tom = new HomeCat("Tom", 3);
        HomeCat kevin = new HomeCat("Kevin", 8);
        Tiger pushistik = new Tiger("Pushistik", 5);
        Tiger petra = new Tiger("Petra", 7);
        Shark kusaka = new Shark("Kusaka", 20);
        Shark obnimaka = new Shark("Obnimaka", 12);
        Falcon johny = new Falcon("Johny", 3);
        Falcon mikki = new Falcon("Mikki", 5);

        spike.swim(8);
        greg.run(600);
        spike.fly(100);
        tom.swim(50);
        kevin.run(30);
        pushistik.swim(150);
        petra.fly(20);
        kusaka.swim(1000);
        obnimaka.run(400);
        johny.swim(500);
        mikki.fly(3500);
    }
}
