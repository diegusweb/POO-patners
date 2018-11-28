package Singleton;

public class Main {

    public static void main(String[] args){

        ConexionDB conexionDB = ConexionDB.obteberConexion();
        ConexionDB conexionDB2 = ConexionDB.obteberConexion();

        conexionDB.Host = "localhost";

        System.out.println(conexionDB.Host);
        System.out.println(conexionDB2.Host);
    }
}
