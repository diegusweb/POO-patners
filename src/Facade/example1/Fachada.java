package Facade.example1;

public class Fachada {
    private Computer computer;

    public Fachada() {

        ITeclado teclado = new Teclado();
        IMouse mouse = new Mouse();

        this.computer = new Computer(teclado, mouse);
    }

    public void encender(){
        this.computer.encender();
    }
}
