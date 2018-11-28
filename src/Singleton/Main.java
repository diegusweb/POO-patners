package Singleton;

public class Main {

    public static void main(String[] args){

       Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexion = ConexionDB.obteberConexion();
                System.out.println(conexion.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexion = ConexionDB.obteberConexion();
                System.out.println(conexion.hashCode());
            }
        });

        t1.start();
        t2.start();
    }
}
