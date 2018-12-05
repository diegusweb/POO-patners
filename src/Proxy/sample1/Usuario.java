package Proxy.sample1;

public class Usuario {

    private int nivelPermiso;  //1 - 5  l 5 es el admin

    public Usuario(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }

    public int getNivelPermiso() {
        return nivelPermiso;
    }

    public void setNivelPermiso(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }
}
