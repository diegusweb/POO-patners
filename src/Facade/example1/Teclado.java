package Facade.example1;

public class Teclado implements ITeclado {
    @Override
    public void conectar() {
        System.out.println("Conexion Teclado por USB");
    }
}
