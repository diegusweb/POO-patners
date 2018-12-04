package Facade.example1;

public class Computer {

    private ITeclado teclado;
    private IMouse mouse;

    public Computer(ITeclado teclado, IMouse mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public void encender(){
        this.teclado.conectar();
        this.mouse.conectar();
    }
}
