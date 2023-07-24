package DecoratingObjects;

import DecoratingObjects.ConcreteComponents.DarkRoast;
import DecoratingObjects.ConcreteComponents.Espresso;
import DecoratingObjects.ConcreteComponents.HouseBlend;
import DecoratingObjects.Condiments.Milk;
import DecoratingObjects.Condiments.Mocha;
import DecoratingObjects.Condiments.Soy;
import DecoratingObjects.Condiments.Whip;

public class Main {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
    
    System.out.println();

    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Milk(beverage2);
    System.out.println(beverage2.getDescription()+ " $" + beverage2.cost());
    
    System.out.println();
    
    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Whip(beverage3);
    beverage3 = new Milk(beverage3);
    System.out.println(beverage3.getDescription()+ " $" + beverage3.cost());
    
  }
}
