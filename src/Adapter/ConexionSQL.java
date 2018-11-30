package Adapter;

public class ConexionSQL implements IConexionSQL {
    @Override
    public void conexion() {
        System.out.println("Conexion con SQL");
    }

    @Override
    public String runQuery() {
        return "Consulta SQL";
    }
}
