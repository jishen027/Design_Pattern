package StrategyPattern;
import StrategyPattern.Duck.MallardDuck;
import StrategyPattern.FlyBehavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
      MallardDuck mallard = new MallardDuck();

      mallard.performQuack();
      mallard.performFly();

      mallard.setFlyBehavior(new FlyRocketPowered());
      mallard.performFly();
    }
}