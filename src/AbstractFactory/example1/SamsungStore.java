package AbstractFactory.example1;

public class SamsungStore implements IAbstractFactory {
    @Override
    public IComputer createComputer() {
        return new QVSW12();
    }

    @Override
    public ITablet createTablet() {
        return new SamsunS3();
    }
}
