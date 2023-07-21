package DecoratingObjects.Condiments;

import DecoratingObjects.Beverage;

public abstract class CondimentDecorator extends Beverage{
  Beverage beverage;

  public abstract String getDescription();
  
}
  
