package DecoratingObjects.ConcreteComponents;

import DecoratingObjects.Beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "House Blend Coffee";
  }

  public double cost() {
    return .89;
  }
}
