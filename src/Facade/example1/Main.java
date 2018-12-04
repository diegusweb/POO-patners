package Facade.example1;

public class Main {

    // COn fachada nosotros vamos a proporcionar una interfaz al cliente de tal manera que el cliente
    //pueda utilizar sistemas mas complejos de una forma mucho ma sencila

    //la fachada juagara un papel intermediario entre el cliente y el sistema
    public static void main(String[] args){
        Fachada fachadaComputer = new Fachada();
        fachadaComputer.encender();
    }
}
