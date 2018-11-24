package AbstractFactory.example2;

public class CarEngine implements IEngine {
    @Override
    public void desing() {
        System.out.println("Desing car engine");
    }

    @Override
    public void manufacture() {
        System.out.println("manufacture car engine");
    }

    @Override
    public void test() {
        System.out.println("test car engine");
    }
}
