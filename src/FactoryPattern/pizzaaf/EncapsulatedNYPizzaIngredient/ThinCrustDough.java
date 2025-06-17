package FactoryPattern.pizzaaf.EncapsulatedNYPizzaIngredient;

import FactoryPattern.pizzaaf.EncapsulatedPizzaIngredientFactory.Dough;

public class ThinCrustDough implements Dough {

    @Override
    public String toString() {
        return "ThickCrust style extra thick crust dough";
    }
}
