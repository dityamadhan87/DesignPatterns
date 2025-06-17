package FactoryPattern.pizzaaf;

import FactoryPattern.pizzaaf.EncapsulatedNYPizzaIngredient.NYPizzaIngredientFactory;
import FactoryPattern.pizzaaf.EncapsulatedPizzaIngredientFactory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } 
        return pizza;
    }
    
}
