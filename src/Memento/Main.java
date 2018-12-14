package Memento;

public class Main {

    public static void main(String[] args){
        Usuario usuario = new Usuario("Diego", 8);

        Usuario memento = usuario.getMemento(); //Nuestra copia

        usuario.setEdad(15);
        usuario.setNombre("Cambio");

        usuario.restarMemento(memento);

        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());

    }
}
