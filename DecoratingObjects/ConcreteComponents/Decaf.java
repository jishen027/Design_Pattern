package DecoratingObjects.ConcreteComponents;

import DecoratingObjects.Beverage;

public class Decaf extends Beverage {
  public Decaf() {
    description = "Decaf";
  }

  public double cost(){
    return 1.99;
  }
}
