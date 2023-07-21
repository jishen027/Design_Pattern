package DecoratingObjects.ConcreteComponents;

import DecoratingObjects.Beverage;

public class Espresso extends Beverage {
  
  public Espresso() {
    description = "Expresso";
  }

  public double cost() {
    return 1.99;
  }
}
