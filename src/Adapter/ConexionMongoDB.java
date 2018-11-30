package Adapter;

public class ConexionMongoDB implements IconexionNoSQL {
    @Override
    public void conexion() {
        System.out.println("Conexion con MongoDB");
    }

    @Override
    public String excecuteSentence() {
        return "Consulta mongoDB";
    }
}
