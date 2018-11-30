package Decorate;

public class pizzaPeperoni implements Pizza {
    @Override
    public String descripcion() {
        return "Pizza peperoni";
    }

    @Override
    public float precio() {
        return 9;
    }
}
