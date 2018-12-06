package Flyweight;

public class Main {

    public static void main(String[] args){

        NubeFactory factory = new NubeFactory();

        for (int x=0; x <= 100; x++){
            Nube nube = factory.getNube(TipoNube.Chica);
        }

        for (int x=0; x <= 200; x++){
            Nube nube = factory.getNube(TipoNube.Mediana);
        }

        for (int x=0; x <= 300; x++){
            Nube nube = factory.getNube(TipoNube.Grande);
        }

        //el resultado nos mostrada solo 3 instancias
        System.out.println(factory.countNubesMap());
    }
}
