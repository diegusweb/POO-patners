package Computer;

/**
 * Created by DIego on 11/19/2018.
 */
public class Computadora {

    private Teclado teclado;
    private Mouse mouse;

    public Computadora() {
        this.teclado = new Teclado();
        this.mouse = new Mouse();
    }

    public void encender()
    {
        this.teclado.conectar();
        this.mouse.conectar();
    }
}
