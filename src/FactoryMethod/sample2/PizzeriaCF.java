package FactoryMethod.sample2;

public class PizzeriaCF implements IPizzeria {
    @Override
    public Pizza crearPizza(String tipo) {
        //es la subclase CF que decide que tipo de clase va aretornar

        if(tipo.equals("Peperoni")){
            return new Pizza(8, "peperoni");
        }

        if(tipo.equals("Albaca")){
            return new Pizza(8, "alabaca");
        }

        if(tipo.equals("Peperoni orilla rellena")){
            return new PizzaOrillaRellena(12, "Peperoni");
        }

        return null;
    }
}
