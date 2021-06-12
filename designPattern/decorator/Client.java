package equipJava.designPattern.decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteDecorator2(
            new ConcreteDecorator1(new ConcreteComponent(Size.TALL)));
        System.out.println(component.cost());
        System.out.println(component.getDescription());

    }
}
