package CompositionStrategyPattern.EncapsulatedFlyBehaviour;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}