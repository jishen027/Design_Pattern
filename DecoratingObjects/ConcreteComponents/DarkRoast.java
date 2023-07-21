package DecoratingObjects.ConcreteComponents;

import DecoratingObjects.Beverage;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark Roast";
  }

  public double cost() {
    return 2.99;
  }
}
