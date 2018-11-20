package main;

/**
 * Created by DIego on 11/17/2018.
 */
public class Main {

    public static void main(String[] args){

        //instancia crear un nuevo objeto con principio de liskov
        IFelinoSalvaje yagua = new Jaguar(20, 120f);

        yagua.rugir();

        IFelinoCasero gato = new Gato(5, 40f);
        gato.maullar();
    }
}


