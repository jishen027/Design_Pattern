package StrategyPattern;
import java.util.ArrayList;

import StrategyPattern.Duck.MallardDuck;
import StrategyPattern.FlyBehavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
      MallardDuck mallard = new MallardDuck();

      mallard.performQuack();
      mallard.performFly();

      mallard.setFlyBehavior(new FlyRocketPowered());
      mallard.performFly();
      String s = "Hello World";


      ArrayList<Integer> numbers = new ArrayList<Integer>();

      numbers.add(1);
      numbers.add(2);

      numbers.forEach((e)->{System.out.println(e);});
    }
}