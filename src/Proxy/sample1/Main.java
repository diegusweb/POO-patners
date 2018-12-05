package Proxy.sample1;

public class Main {

    //el proxy tine como onjetivo limitar funcionalidades de nuestro sistema
    //principalmente por temas de seguridad

    public static void main(String[] args){

        Usuario usuario = new Usuario(2);

        IService servicio = new ProxyService(new Service(), usuario);

        servicio.leer();
        servicio.escribir();
        servicio.modificar();
        servicio.eliminar();
    }
}
