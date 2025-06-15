package DecoratorPattern;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case TALL:
                cost += 0.10;
                break;
            case GRANDE:
                cost += 0.15;
                break;
            case VENTI:
                cost += 0.20;
                break;
        }
        return cost;
    }
}
