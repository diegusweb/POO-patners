package main;

/**
 * Created by DIego on 11/17/2018.
 */
public class Main {

    public static void main(String[] args){

        //instancia crear un nuevo objeto
        Jaguar yagua = new Jaguar(20, 120f);
        //yagua.setEdad(10);
        //yagua.setPeso(110f);

        System.out.println(yagua);
        yagua.comer();
        yagua.dormir();

        yagua.cazar();

        yagua.rugir();

        //yagua.maullar();

        Jaguar yagua2 = new Jaguar();
        System.out.println(yagua2);

        Jaguar yagua3 = new Jaguar(11);
        System.out.println(yagua3);
    }
}


