package AbstractFactory.example2;

public class CarFactory extends Factory {
    @Override
    public IEngine getEngine() {
        return new CarEngine();
    }

    @Override
    public ITyre getTyre() {
        return new CarTyre();
    }
}
