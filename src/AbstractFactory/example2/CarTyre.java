package AbstractFactory.example2;

public class CarTyre implements ITyre {
    @Override
    public void desing() {
        System.out.println("Desing car tyre");
    }

    @Override
    public void manufacture() {
        System.out.println("manufacture car tyre");
    }
}
