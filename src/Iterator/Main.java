package Iterator;

public class Main {

    public static void main(String[] args){
        GuiaTelefonica guia = new GuiaTelefonica();

        guia.add("1283");
        guia.add("1463");
        guia.add("1215");
        guia.add("1232");
        guia.add("1233");

        Iterator iterador = new IteratorGuia(guia);

        while (iterador.contieneSiguiente()){
            System.out.println(iterador.siguiente());
        }
    }
}
