public class Duck extends Animal implements Flyable{
    String name;
    public Duck(String name){
        this.name = name ;
    }

    public    String toString(){
        return "เป็ด:" + this.name ;
    }

    void sound() {
        System.out.println("quack quack ");
    }

    @Override
    public void fly() {
        System.out.println("quake fly ");
    }

    @Override
    public void gliide() {
        System.out.println("quack glide");
    }

    void clean(Animal animal){
        System.out.println(this +" is cleaning " + animal);
    }




}
