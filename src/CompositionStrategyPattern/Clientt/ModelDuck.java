package CompositionStrategyPattern.Clientt;

import CompositionStrategyPattern.EncapsulatedFlyBehaviour.FlyNoWay;
import CompositionStrategyPattern.EncapsulatedQuackBehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
