package Decorate;

public class OrrillaRellena implements Pizza {

    private Pizza pizza;

    public OrrillaRellena(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String descripcion() {
        return  this.pizza.descripcion() + " con orilla rellena";
    }

    @Override
    public float precio() {
        return this.pizza.precio() + 4;
    }
}