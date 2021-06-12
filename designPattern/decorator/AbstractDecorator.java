package equipJava.designPattern.decorator;

public abstract class AbstractDecorator extends Component {
    Component component;
    
    public abstract String getDescription();
}
