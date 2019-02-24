package Pizza.PizzaComponents;

public class PizzaStuff {
    private boolean panPizza; //пицца на пышном тесте
    private PizzaType pizzaType; //тип пиццы вегитарианская, маринара, мясная, кальцоне для детей
    private Enum pizzaForm; //обычная, кальцоне
    private Enum pizzaName; //наименования пиццы
    private int pizzaSize; //размеры пиццы
    private boolean pizzaCut; //нарезанная пицца
    private int pizzaPiece;
    private int pizzaWeight;
    private String pizzaSet; //набор для пиццы основа, сыр, специи, соусы
    private boolean pizzaFreeze;//замороженная пицца
    private float price;
    private PizzaIngredients pizzaIngredients;


    public PizzaStuff(PizzaIngredients pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    public PizzaIngredients getPizzaIngredients() {
        return pizzaIngredients;
    }

    public void setPizzaIngredients(PizzaIngredients pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    public PizzaStuff() {
    }

    public PizzaStuff(float price) {
        this.price = price;
    }

    public PizzaStuff(PizzaType pizzaType, Enum pizzaForm, int pizzaSize, int pizzaWeight, float price) {
        this.pizzaType = pizzaType;
        this.pizzaForm = pizzaForm;
        this.pizzaSize = pizzaSize;
        this.pizzaWeight = pizzaWeight;
        this.price = price;
    }

    public PizzaStuff(PizzaType pizzaType, Enum pizzaName, int pizzaSize) {
        this.pizzaType = pizzaType;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
    }

    public PizzaStuff(PizzaType pizzaType, Enum pizzaName, int pizzaSize, boolean pizzaCut, int pizzaPiece) {
        this.pizzaType = pizzaType;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.pizzaCut = pizzaCut;
        this.pizzaPiece = pizzaPiece;
    }

    public PizzaStuff(boolean panPizza, Enum pizzaName, int pizzaSize, boolean pizzaCut, int pizzaWeight) {
        this.panPizza = panPizza;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.pizzaCut = pizzaCut;
        this.pizzaWeight = pizzaWeight;

    }

    public PizzaStuff(Enum pizzaName, String pizzaSet, boolean pizzaFreeze) {
        this.pizzaName = pizzaName;
        this.pizzaSet = pizzaSet;
        this.pizzaFreeze = pizzaFreeze;
    }

    public PizzaStuff(boolean panPizza, PizzaType pizzaType, Enum pizzaForm, Enum pizzaName, int pizzaSize, boolean pizzaCut, int pizzaPiece, int pizzaWeight, String pizzaSet, boolean pizzaFreeze, float price) {
        this.panPizza = panPizza;
        this.pizzaType = pizzaType;
        this.pizzaForm = pizzaForm;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.pizzaCut = pizzaCut;
        this.pizzaPiece = pizzaPiece;
        this.pizzaWeight = pizzaWeight;
        this.pizzaSet = pizzaSet;
        this.pizzaFreeze = pizzaFreeze;
        this.price = price;
    }



    public boolean isPanPizza() {
        return panPizza;
    }

    public void setPanPizza(boolean panPizza) {
        this.panPizza = panPizza;
    }

    public Enum getPizzaName() {
                return pizzaName;
    }
    enum pizzaName {
        Margherita, Marinara, Quatroformaggi, Salami, FruttiDiMare, AlTonno, AlPollo, Tropichana
    };

    public void setPizzaName(Enum pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public boolean isPizzaCut() {
        int piece = 0;
        if(pizzaCut) {
            getPizzaPiece();
        }
        return pizzaCut;
    }

    public void setPizzaCut(boolean pizzaCut) {
        this.pizzaCut = pizzaCut;
    }

    public int getPizzaPiece() {
        return pizzaPiece;
    }

    public void setPizzaPiece(int pizzaPiece) {
        this.pizzaPiece = pizzaPiece;
    }

    public int getPizzaWeight() {
        return pizzaWeight;
    }


    public void setPizzaWeight(int pizzaWeight) {
        this.pizzaWeight = pizzaWeight;
    }

    public String getPizzaSet() {
        return pizzaSet;
    }

    public void setPizzaSet(String pizzaSet) {
        this.pizzaSet = pizzaSet;
    }

    public boolean isPizzaFreeze() {
        return pizzaFreeze;
    }

    public void setPizzaFreeze(boolean pizzaFreeze) {
        this.pizzaFreeze = pizzaFreeze;
    }

    @Override
    public String toString() {
        return "PizzaStuff{" +
                "pizzaName ='" + pizzaName + '\'' +
                "pizzaType ='" + pizzaType + '\'' +
                "pizzaSize ='" + pizzaSize +
                "pizzaWeight ='" + pizzaWeight +
                "pizzaPiece ='" + pizzaPiece +
                "price ='" + price +
                '}';
    }
    public enum PizzaType {
        QUATROFORMAGGI("четыре сыра"), NAPOLETANA("пицца по неапольски");
        private String type; //

        private PizzaType(String type) {
            this.type = type;
        }
    }
}
