package SimpleFactory;

public class Main {

    public static void main(String[] args){

        Pizzeria donJuan = new Pizzeria();

        Pizza pizzaPeperoni = donJuan.crearPizzaMediana();
        System.out.println(pizzaPeperoni);
    }
}
