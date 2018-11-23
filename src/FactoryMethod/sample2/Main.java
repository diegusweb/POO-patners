package FactoryMethod.sample2;

public class Main {

    public static void main(String[] args){
        PizzeriaCF cf = new PizzeriaCF();
        Pizza peperoni = cf.crearPizza("Peperoni");
        Pizza albaca = cf.crearPizza("Albaca");
        Pizza orillaRellena = cf.crearPizza("Peperoni orilla rellena");

        System.out.println(peperoni);
        System.out.println(albaca);
        System.out.println(orillaRellena);
    }
}
