package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import weather.CurrentConditionsDisplay;
import weather.WeatherData;

public class WeatherDataTest {

    private WeatherData weatherData;

    @BeforeEach
    public void setUp() {
        weatherData = new WeatherData();
    }

    @Test
    public void testWeatherDataInitialization() {
        assertNotNull(weatherData); // Check if WeatherData object is initialized
        assertEquals(0, weatherData.getTemperature());
        assertEquals(0, weatherData.getHumidity());
        assertEquals(0, weatherData.getPressure());
    }
    @Test
    public void testObserverNotification() {
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.registerObserver(currentDisplay);

        weatherData.setMeasurements(80, 65, 30.4f);

        assertEquals(80, currentDisplay.getTemperature());
        assertEquals(65, currentDisplay.getHumidity());
    }



}
