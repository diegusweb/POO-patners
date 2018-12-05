package Proxy.sample2;

public class Main {

    public static void main(String[] args){

        Usuario usuario = new Usuario(2);

        IService servicio = new ProxyService( usuario);

        servicio.leer();
        servicio.escribir();
        servicio.modificar();
        servicio.eliminar();
    }
}
