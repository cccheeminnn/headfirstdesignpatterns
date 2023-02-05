package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        
        Duck rubberDuck = new Duck();
        //dynamically change behavior during compile time
        //by delegating behavior to an interface in which 
        //concrete classes implements them
        rubberDuck.setFlyingBehavior(new NoFlyWings());
        System.out.println("I'm a rubber duck!");
        rubberDuck.performFly();
        System.out.println("But I'm loud!");
        //also allows for easier to maintain code
        //in which you just have to go to a single class
        //and make changes as required
        rubberDuck.setQuackingBehavior(new LoudQuack());
        rubberDuck.performQuack();

        System.out.println("There are predators nearby...");
        rubberDuck.setQuackingBehavior(new SoftQuack());
        rubberDuck.performQuack();
    }
}
