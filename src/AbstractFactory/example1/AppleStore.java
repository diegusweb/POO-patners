package AbstractFactory.example1;

public class AppleStore implements IAbstractFactory {
    @Override
    public IComputer createComputer() {
        return new MacbookPro();
    }

    @Override
    public ITablet createTablet() {
        return new Ipad();
    }
}
