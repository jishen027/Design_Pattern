## Observer Pattern
 

- current conditions.
- weather statistics.
- weather forecast.

non functional requirements:  
- low coupling between the weather station and the display elements.

### Design
- WeatherData: Subject
- CurrentConditionsDisplay, StatisticsDisplay, ForecastDisplay: Observer

publisher + subscriber = observer pattern

- save the reference of the observer in the subject.
- save the List of observers in the subject.
- notify the observers when the state changes.

### Java built-in observer pattern
- java.util.Observable: Subject
- java.util.Observer: Observer



