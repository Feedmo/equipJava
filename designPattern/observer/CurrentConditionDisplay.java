package equipJava.designPattern.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Subject subject;
    private double temperature;
    private double humidity;
    
    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject; 
        this.subject.registerObserver(this);
    }

    public void unsubscribe() {
        this.subject.removeObserver(this);
    }

    @Override
    public void dispaly() {
        System.out.println("CurrentConditionDisplay (temperature: " + this.temperature 
            + ", humidity: " + humidity + ")");
    }
    
    /**
     * 由于该display只需要其中的两个数据另一个则被忽略了，而且当增加或减少传递的数据种类时
     * 所有观察者中的update方法都可能要修改，因此也可以选择让观察者自己去获取数据，比如：
     * 此时update就不再传参了，而具体的天气数据则通过weatherData的getXX方法获取
     */
    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        dispaly();
    }
    
}
