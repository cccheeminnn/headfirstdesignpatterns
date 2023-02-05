package StrategyPattern;

import StrategyPattern.Interface.FlyingBehavior;
import StrategyPattern.Interface.QuackingBehavior;

public class Duck {

    private FlyingBehavior flyingBehavior;
    private QuackingBehavior quackingBehavior;

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void performFly() {
        flyingBehavior.fly();
    }

    public void setQuackingBehavior(QuackingBehavior quackingBehavior) {
        this.quackingBehavior = quackingBehavior;
    }

    public void performQuack() {
        quackingBehavior.quack();
    }
}
