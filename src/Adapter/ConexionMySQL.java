package Adapter;

public class ConexionMySQL implements IConexionSQL {
    @Override
    public void conexion() {
        System.out.println("Conexion con MySql");
    }

    @Override
    public String runQuery() {
        return "Consulta con MySQL";
    }
}
