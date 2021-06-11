package equipJava.designPattern.strategy;

public class QuackWithMusic implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack with music");
    }

}
