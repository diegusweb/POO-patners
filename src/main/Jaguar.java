package main;

/**
 * Created by DIego on 11/17/2018.
 */
public class Jaguar {
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



}
