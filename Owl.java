public class Owl extends Animal implements Flyable {
    void sound() {
        System.out.println("hoot hoot ");
    }

    @Override
    public void fly() {
        System.out.println("hoot fly ");
    }

    @Override
    public void gliide() {
        System.out.println("hoot glide");
    }

}
