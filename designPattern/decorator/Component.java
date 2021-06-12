package equipJava.designPattern.decorator;

/**
 * 当具体的component实例化时可选择Size实例 @see ConcreteComponent
 */
public abstract class Component {
    String description = "unkonwn beverage";
    Size size;  

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}