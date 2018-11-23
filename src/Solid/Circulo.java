package Solid;

public class Circulo implements IFigura {

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public String toString(){
        return "Radio " + this.getRadio();
    }

    public float area(){
        return 3.14f * 2 * this.getRadio();
    }
}
