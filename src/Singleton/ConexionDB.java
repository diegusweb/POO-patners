package Singleton;

public class ConexionDB {

    private static ConexionDB conexion;
    public String Host = "";

    private ConexionDB() {

    }

    public synchronized static ConexionDB obteberConexion()
    {
        if(conexion == null){ //que no se ha realizado una instancia
            conexion = new ConexionDB();
        }
        return conexion;
    }
}
