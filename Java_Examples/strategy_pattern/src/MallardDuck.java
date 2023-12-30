public class MallardDuck extends Duck implements Flyable {
    @Override
    public void display() {
        System.out.println("I am a mallard duck!");
    }
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
