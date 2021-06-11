package equipJava.designPattern.strategy;

/**
 * 将变化的部分抽离出来，并用接口代表潜在的一系列行为实现(即利用组合而非继承)
 * set方法可以在运行时切换具体的行为实现
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public abstract void display();
}
