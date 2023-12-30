public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void swim(){
        System.out.println("Swimming");
    }
    public abstract void display();
    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
}
