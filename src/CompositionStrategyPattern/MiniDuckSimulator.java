package CompositionStrategyPattern;

import CompositionStrategyPattern.Clientt.Duck;
import CompositionStrategyPattern.Clientt.MallardDuck;
import CompositionStrategyPattern.Clientt.ModelDuck;
import CompositionStrategyPattern.EncapsulatedFlyBehaviour.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
