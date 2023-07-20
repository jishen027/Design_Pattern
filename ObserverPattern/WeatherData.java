package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
  private List<Observer> observers;
  private float temp;
  private float humidity;
  private float pressure;
  private float windSpeed;

  public WeatherData(){
    observers = new ArrayList<Observer>();
  }

  public void registerObserver(Observer o){
    observers.add(o);
  }

  public void removeObserver(Observer o){
    observers.remove(o);
  }

  public void notifyObservers(){
    for(Observer observer: observers){
      observer.update();
    }
  }

  public void measurementsChanges(){
    notifyObservers();
  }

  public void setMeasurements(float temp, float humidity, float pressure, float windSpeed){
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    this.windSpeed = windSpeed;
    measurementsChanges();
  }


  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public float getTemp() {
    return temp;
  }

  public float getWindSpeed() {
    return windSpeed;
  }

  public List<Observer> getObservers() {
    return observers;
  }

}
