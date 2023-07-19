package StrategyPattern.Duck;

import StrategyPattern.FlyBehavior.FlyWithWings;
import StrategyPattern.QuackBehavior.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
