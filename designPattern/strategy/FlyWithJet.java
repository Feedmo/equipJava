package equipJava.designPattern.strategy;

public class FlyWithJet implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly with jet");
    }
    
}
