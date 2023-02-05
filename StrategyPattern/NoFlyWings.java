package StrategyPattern;

import StrategyPattern.Interface.FlyingBehavior;

public class NoFlyWings implements FlyingBehavior{
    
    @Override
    public void fly() {
        System.out.println("I can't fly...");
    }
}
