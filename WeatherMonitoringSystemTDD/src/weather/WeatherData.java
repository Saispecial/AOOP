package weather;
import java.util.ArrayList;

public class WeatherData {
    private ArrayList<Observer> observers; // List of observers
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    // Register an observer
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // Remove an observer
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // Notify all observers about changes in weather data
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // This method is called when the weather data is updated
    public void measurementsChanged() {
        notifyObservers();
    }

    // Method to set new weather data
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged1() {
        notifyObservers();
    }


    // Getters for temperature, humidity, and pressure
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}



