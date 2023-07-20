package ObserverPattern;

import ObserverPattern.display.CurrentConditionsDisplay;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData wData = new WeatherData();

    new CurrentConditionsDisplay(wData);

    wData.setMeasurements(80.1f, 65f, 30.4f, 80.5f);
    wData.setMeasurements(82.2f, 62f, 30.4f, 80.5f);
    wData.setMeasurements(84.3f, 60f, 30.4f, 80.6f);
  }
}
