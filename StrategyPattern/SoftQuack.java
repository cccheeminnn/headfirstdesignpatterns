package StrategyPattern;

import StrategyPattern.Interface.QuackingBehavior;

public class SoftQuack implements QuackingBehavior{

    @Override
    public void quack() {
        System.out.println("quack.");
    }

    
    
}
