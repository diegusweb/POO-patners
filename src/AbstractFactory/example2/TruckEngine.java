package AbstractFactory.example2;

public class TruckEngine implements IEngine {
    @Override
    public void desing() {
        System.out.println("Desing truck engine");
    }

    @Override
    public void manufacture() {
        System.out.println("manufacture truck engine");
    }

    @Override
    public void test() {
        System.out.println("test truck engine");
    }
}
