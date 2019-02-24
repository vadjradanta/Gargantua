package Pizza;

import Pizza.PizzaComponents.*;

public class PizzaGenerator {
    public static void main(String[] args) {
        PizzaStuff pizzaStuffs = new PizzaStuff(
                new PizzaIngredients(
                        new String[] {"melanzane", "peperone", "tomato"},
                        new String[]{"pesche"},
                        new String[] {"gorgonzola", "maozarella", "granapodano", "buratta" },
                        new String[] {"basilico"},
                        new String[] {"sale"})


        );
    }


}
