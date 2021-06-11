package equipJava.designPattern.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        // update weather data
        weatherData.setMeasurements(12.3, 13.4, 14.5);
        weatherData.setMeasurements(0.1, 5.4, 100.5);
    }
}
