package weather;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    @SuppressWarnings("unused")
	private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

	public Integer getTemperature() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getHumidity() {
		// TODO Auto-generated method stub
		return null;
	}
}
