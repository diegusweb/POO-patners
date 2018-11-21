package SimpleFactory;

public class Pizza {

    private int cantidadDeRebanadas;

    public Pizza(int cantidadDeRebanadas) {
        this.cantidadDeRebanadas = cantidadDeRebanadas;
    }

    public String toString(){
        return "Cantidad rebanadas : " + this.cantidadDeRebanadas;
    }
}
