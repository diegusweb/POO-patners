package Decorate;

public class pizzaHawaiana implements Pizza {
    @Override
    public String descripcion() {
        return "Pizza hawaiana";
    }

    @Override
    public float precio() {
        return 8;
    }
}
