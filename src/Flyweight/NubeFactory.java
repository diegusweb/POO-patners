package Flyweight;

import java.util.HashMap;

public class NubeFactory {

    // en java para implementar el patron de sise;o flyweight
    // se utiliza un hashMap

    private HashMap<TipoNube, Nube> nubesMap;

    public NubeFactory(){
        this.nubesMap = new HashMap<TipoNube, Nube>();
    }

    public Nube getNube(TipoNube tipo){
        Nube nube = this.nubesMap.get(tipo);

        //unicaente vmaos a generar objetos que existan dentro el mapa
        if(nube == null){
            nube = new Nube(tipo, "nube.png", 100, 100);
            this.nubesMap.put(tipo, nube);
        }

        return nube;
    }

    public int countNubesMap(){
        return this.nubesMap.size();
    }
}
