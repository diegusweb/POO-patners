package Proxy.sample1;

public class Service implements IService {
    @Override
    public void leer() {
        System.out.println("Leer!!");
    }

    @Override
    public void escribir() {
        System.out.println("Escribir!!!");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar!!!");
    }

    @Override
    public void modificar() {
        System.out.println("Modificar");
    }
}
