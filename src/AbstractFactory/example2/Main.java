package AbstractFactory.example2;

public class Main {

    public static void main(String[] args){
        Factory factory = Factory.getFactory("truck");

        IEngine engine = factory.getEngine();
        engine.desing();
        engine.manufacture();
        engine.test();

        ITyre tyre = factory.getTyre();
        tyre.desing();
        tyre.manufacture();

    }
}
