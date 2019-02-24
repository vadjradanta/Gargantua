package Pizza.PizzaComponents;

import Pizza.PizzaComponents.PizzaStuff;

public class PizzaBase extends PizzaStuff {
    private boolean emptyBase;
    private Enum rowBase;

    public PizzaBase(float price, boolean emptyBase, Enum rowBase) {

        this.emptyBase = emptyBase;
        this.rowBase = rowBase;
    }

    public PizzaBase(Enum pizzaType, Enum pizzaName, int pizzaSize, boolean pizzaCut, int pizzaPiece, boolean emptyBase, Enum rowBase) {
        super(pizzaType, pizzaName, pizzaSize, pizzaCut, pizzaPiece);
        this.emptyBase = emptyBase;
        this.rowBase = rowBase;
    }

    public PizzaBase(boolean emptyBase, Enum rowBase) {
        this.emptyBase = emptyBase;
        this.rowBase = rowBase;
    }

    public PizzaBase(boolean panPizza, Enum pizzaType, Enum pizzaForm, Enum pizzaName, int pizzaSize, boolean pizzaCut, int pizzaPiece, int pizzaWeight, String pizzaSet, boolean pizzaFreeze, float price, boolean emptyBase, Enum rowBase) {
        super(panPizza, pizzaType, pizzaForm, pizzaName, pizzaSize, pizzaCut, pizzaPiece, pizzaWeight, pizzaSet, pizzaFreeze, price);
        this.emptyBase = emptyBase;
        this.rowBase = rowBase;
    }

    public boolean isEmptyBase() {
        return emptyBase;
    }

    public void setEmptyBase(boolean emptyBase) {
        this.emptyBase = emptyBase;
    }

    public Enum getRowBase() {
        return rowBase;
    }

    public void setRowBase(Enum rowBase) {
        this.rowBase = rowBase;
    }
}
