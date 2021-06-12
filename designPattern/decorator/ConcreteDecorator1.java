package equipJava.designPattern.decorator;

public class ConcreteDecorator1 extends AbstractDecorator {
    public ConcreteDecorator1(Component component) {
        this.component = component;
    }

    @Override
    public String getDescription() {
        return this.component.getDescription() + ", decorator_1 with size";
    }

    @Override
    public double cost() {
        double cost = this.component.cost();
        if (component.getSize() == Size.TALL)
            cost += 0.2;
        else if (component.getSize() == Size.MEDIUM)
            cost += 0.3;
        return cost;
    }
    
}
