package StrategyPattern;

import StrategyPattern.Interface.FlyingBehavior;

public class FlyWithWings implements FlyingBehavior{
    
    @Override
    public void fly() {
        System.out.println("I'm flying with my wings!");
    }
}
