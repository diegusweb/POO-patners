package Iterator;

public class IteratorGuia implements Iterator {

    private GuiaTelefonica guia;
    private int posicion;

    public IteratorGuia(GuiaTelefonica guia) {
        this.guia = guia;
    }

    @Override
    public String siguiente() {
        return this.guia.getNumeros().get(this.posicion++);
    }

    @Override
    public boolean contieneSiguiente() {
        return this.posicion < this.guia.getNumeros().size() &&
                this.guia.getNumeros().get(this.posicion) != null;
    }
}
