package Solid;

/**
 * Created by DIego on 11/18/2018.
 */
public class Main {

    public static void main(String[] args){
        Rectangulo rectangulo = new Rectangulo(10, 20);

        Triangulo triangulo = new Triangulo(10,5);

        Circulo circulo = new Circulo(5);

        Presentacion presentacion = new Presentacion();

        presentacion.area(rectangulo);
        presentacion.area(triangulo);
        presentacion.area(circulo);
    }
}
