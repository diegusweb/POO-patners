package Facade.example1;

public class Mouse implements IMouse {
    @Override
    public void conectar() {
        System.out.println("Conexion Mouse por USB");
    }
}
