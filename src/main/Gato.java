package main;

/**
 * Created by DIego on 11/19/2018.
 */
public class Gato extends Animal implements IFelinoCasero{

    private int edad;
    private float peso;

    public Gato(int edad, float peso) {
        this.edad = edad;
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public void cazar() {
        System.out.println("El gato caza");
    }

    @Override
    public void maullar() {
        System.out.println("El gato maulla");
    }
}
