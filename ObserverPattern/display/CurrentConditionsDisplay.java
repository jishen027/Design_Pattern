package ObserverPattern.display;

import ObserverPattern.Observer;
import ObserverPattern.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temp;
  private float humidity;
  private WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData wData) {
    this.weatherData = wData;
    weatherData.registerObserver(this);
  }

  public void update() {
    this.temp = weatherData.getTemp();
    this.humidity = weatherData.getHumidity();
    display();
  }

  public void display() {
    System.out.println("Current conditions:" + temp + "F degrees and " + humidity + "% humidity");
  }
}
