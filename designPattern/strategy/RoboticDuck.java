package equipJava.designPattern.strategy;

public class RoboticDuck extends Duck {
    public RoboticDuck() {
        this.flyBehavior = new FlyWithRocket();
        this.quackBehavior = new QuackWithMusic();
    }

    @Override
    public void display() {
        System.out.println("I am a robot duck");        
    }
    
}
