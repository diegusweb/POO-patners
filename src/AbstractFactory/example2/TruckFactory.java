package AbstractFactory.example2;

public class TruckFactory extends Factory {
    @Override
    public IEngine getEngine() {
        return new TruckEngine();
    }

    @Override
    public ITyre getTyre() {
        return new TruckTyre();
    }
}
