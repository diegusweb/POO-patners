package AbstractFactory.example2;

public class TruckTyre implements ITyre {
    @Override
    public void desing() {
        System.out.println("Desing truck tyre");
    }

    @Override
    public void manufacture() {
        System.out.println("manufacture truck tyre");
    }
}
