package CompositionStrategyPattern.Clientt;

import CompositionStrategyPattern.EncapsulatedFlyBehaviour.FlyWithWings;
import CompositionStrategyPattern.EncapsulatedQuackBehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
