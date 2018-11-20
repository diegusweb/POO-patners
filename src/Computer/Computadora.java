package Computer;

/**
 * Created by DIego on 11/19/2018.
 */
public class Computadora {

    private ITeclado teclado;
    private IMouse mouse;

    public Computadora(Teclado teclado, Mouse mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public void encender()
    {
        this.teclado.conectar();
        this.mouse.conectar();
    }
}
