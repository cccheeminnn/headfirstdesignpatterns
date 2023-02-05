package StrategyPattern;

import StrategyPattern.Interface.QuackingBehavior;

public class LoudQuack implements QuackingBehavior{

    @Override
    public void quack() {
        System.out.println("QUACKS!");
    }

    
    
}
