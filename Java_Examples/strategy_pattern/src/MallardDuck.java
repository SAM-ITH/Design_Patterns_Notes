public class MallardDuck extends Duck {
    // constructor of the mallarduck class
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am a mallard duck!");
    }
}
