package equipJava.designPattern.strategy;

public class FlyWithRocket implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly with rocket");        
    }
    
}
