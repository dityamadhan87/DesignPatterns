package FactoryPattern.pizzaaf.EncapsulatedNYPizzaIngredient;

import FactoryPattern.pizzaaf.EncapsulatedPizzaIngredientFactory.Cheese;
import FactoryPattern.pizzaaf.EncapsulatedPizzaIngredientFactory.Clams;
import FactoryPattern.pizzaaf.EncapsulatedPizzaIngredientFactory.Dough;
import FactoryPattern.pizzaaf.EncapsulatedPizzaIngredientFactory.PizzaIngredientFactory;
import FactoryPattern.pizzaaf.EncapsulatedPizzaIngredientFactory.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }   
}
