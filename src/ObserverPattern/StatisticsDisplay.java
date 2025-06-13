package ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement {
    
    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float averageTemperature;
    private float averageHumidity;
    private float maxTemperature;
    private float maxHumidity;
    private float minTemperature;
    private float minHumidity;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.printf("Avg/Max/Min Temperature: %.2f/%.2f/%.2f\n", averageTemperature, maxTemperature, minTemperature);
    }
    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}
