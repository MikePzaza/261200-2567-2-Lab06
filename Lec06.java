
public class Lec06 {
    public static void main(String[] args) {
//    Animal animal = new Animal(); cannot Use
    Cow wagyu = new Cow();
    Duck donald = new Duck("โดนัลด์");
    Pig burin = new Pig();
    Owl hedwig = new Owl();
    Duck daisy = new Duck("เดซี่");
    PekingDuck fourseasons = new PekingDuck("4ss");
    wagyu.sound();
    donald.sound();
    burin.sound();
    hedwig.sound();
    daisy.sound();
    fourseasons.sound();
    donald.clean(wagyu);
    daisy.clean(donald);
    donald.gliide();
    donald.fly();
    fourseasons.clean(daisy);
    fourseasons.fly();
    donald.clean(new Cow());


    }
}