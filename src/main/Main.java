package main;

/**
 * Created by DIego on 11/17/2018.
 */
public class Main {

    public static void main(String[] args){

        //instancia crear un nuevo objeto con principio de liskov
        IFelino yagua = new Jaguar(20, 120f);

        yagua.cazar();
    }
}


