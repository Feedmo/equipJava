package equipJava.designPattern.decorator;

public class ConcreteComponent extends Component {
    public ConcreteComponent(Size size) {
        this.size = size;
        this.description = "component_1";
    }    

    @Override
    public double cost() {
        return 1.0;
    }
    
}
