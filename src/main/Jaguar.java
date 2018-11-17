package main;

/**
 * Created by DIego on 11/17/2018.
 */
public class Jaguar extends Animal implements IFelino {
    private int edad;
    private float peso;

    public Jaguar(int edad, float peso){
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

    public String toString(){
        return "Mi edad es "+this.getEdad()+" mpeso es "+this.getPeso();
    }


    @Override
    public void rugir() {
        System.out.println("El jaguar ruge");
    }

    @Override
    public void maullar() {
        throw new UnsupportedOperationException("El jaguar no maulla");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza");
    }
}
