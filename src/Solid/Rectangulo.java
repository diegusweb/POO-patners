package Solid;

/**
 * Created by DIego on 11/18/2018.
 */
public class Rectangulo {

    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String toString(){
        return "Base " + this.getBase() +" Altura "+this.getAltura();
    }

    public float area(){
        return this.getBase() * this.getAltura();
    }

    public void imprimir(){
        System.out.println(this);
    }
}
