package Pizza.PizzaComponents;


public class PizzaIngredients{
    private String[] vegetable;
    private String[] fruit;
    private String[] fish;
    private String[] cheese;
    private String[] meat;
    private String[] poultry;
    private String[] shellfish;
    private String[] spice;
    private String[] additive;

    public PizzaIngredients(String[] vegetable, String[] fruit, String[] cheese, String[] spice, String[] additive) {
        this.vegetable = vegetable;
        this.fruit = fruit;
        this.cheese = cheese;
        this.spice = spice;
        this.additive = additive;
    }

    public String[] getVegetable() {
        return vegetable;
    }

    public void setVegetable(String[] vegetable) {
        this.vegetable = vegetable;
    }

    public String[] getFruit() {
        return fruit;
    }

    public void setFruit(String[] fruit) {
        this.fruit = fruit;
    }

    public String[] getFish() {
        return fish;
    }

    public void setFish(String[] fish) {
        this.fish = fish;
    }

    public String[] getCheese() {
        return cheese;
    }

    public void setCheese(String[] cheese) {
        this.cheese = cheese;
    }

    public String[] getMeat() {
        return meat;
    }

    public void setMeat(String[] meat) {
        this.meat = meat;
    }

    public String[] getPoultry() {
        return poultry;
    }

    public void setPoultry(String[] poultry) {
        this.poultry = poultry;
    }

    public String[] getShellfish() {
        return shellfish;
    }

    public void setShellfish(String[] shellfish) {
        this.shellfish = shellfish;
    }

    public String[] getSpice() {
        return spice;
    }

    public void setSpice(String[] spice) {
        this.spice = spice;
    }

    public String[] getAdditive() {
        return additive;
    }

    public void setAdditive(String[] additive) {
        this.additive = additive;
    }
}
