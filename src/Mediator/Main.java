package Mediator;

public class Main {

    public static void main(String[] args){
        Usuario eduardo = new Usuario("Eduardo");
        Usuario raf = new Usuario("Raf");

        SalaChat sala = new SalaChat();

        sala.addParticipante(eduardo);
        sala.addParticipante(raf);

        sala.enviarMensaje(eduardo, raf, "Hola desde el curso nuevo");
    }
}
