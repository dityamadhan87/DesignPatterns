package FactoryPattern.pizzaaf.EncapsulatedNYPizzaIngredient;

import FactoryPattern.pizzaaf.EncapsulatedPizzaIngredientFactory.Clams;

public class FreshClams implements Clams {

    @Override
    public String toString() {
        return "Fresh Clams from Long Island Sound";
    }
}
