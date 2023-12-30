public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.display();
        ((Flyable) mallard).fly();

        Duck redHead = new RedheadDuck();
        redHead.quack();
        redHead.display();
    }
}