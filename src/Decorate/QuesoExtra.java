package Decorate;

public class QuesoExtra implements Pizza {

    private Pizza pizza;

    public QuesoExtra(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String descripcion() {
        return  this.pizza.descripcion() + " Queso extra";
    }

    @Override
    public float precio() {
        return this.pizza.precio() + 2;
    }
}
