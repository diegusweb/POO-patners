package Decorate;

public class Main {

    // a un objeto ya creado en tiempo de ejecucion podemos agregarle mas funcionalidades,
    // dejando la herencia a un lado
    public static void main(String[] args){
        Pizza pizzaPeperoni = new QuesoExtra(new pizzaPeperoni());

        System.out.println(pizzaPeperoni.descripcion());
        System.out.println(pizzaPeperoni.precio());

        Pizza pizzaHawaiana = new OrrillaRellena(new QuesoExtra(new pizzaHawaiana()));

        System.out.println(pizzaHawaiana.descripcion());
        System.out.println(pizzaHawaiana.precio());
    }
}
