package Adapter;

public class Main {

    //que dos clases que no puedan trabajar en conjunto lo logren
    public static void main(String[] args){

        IConexionSQL conexion = new AdaptadorDB(new ConexionMongoDB());

        conexion.conexion();

        String resultado = conexion.runQuery();
        System.out.println(resultado);
    }
}
