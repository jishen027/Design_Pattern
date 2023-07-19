package StrategyPattern.Duck;

import StrategyPattern.FlyBehavior.FlyBehavior;
import StrategyPattern.QuackBehavior.QuackBehavior;

public class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {
  }

  

  // methods
  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }

  public void display() {
    System.out.println("I'm a duck!");
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }

}
