package equipJava.designPattern.strategy;

public class Client {
    public static void main(String[] args) {
        Duck duck = new RoboticDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyWithJet());
        duck.performFly();
    }
}
