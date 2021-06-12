package equipJava.designPattern.decorator;

public class ConcreteDecorator2 extends AbstractDecorator {
    public ConcreteDecorator2(Component component) {
        this.component = component;
    }

    @Override
    public String getDescription() {
        return this.component.getDescription() + ", decorator_2";
    }

    @Override
    public double cost() {
        return this.component.cost() + 0.2;
    }
    
}
