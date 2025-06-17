package FactoryPattern.pizzaaf.EncapsulatedPizzaIngredientFactory;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClam();
}
