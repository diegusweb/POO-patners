package AbstractFactory.example1;

public class Main {
    public static void main(String[] args){
        SamsungStore samsungStore = new SamsungStore();
        AppleStore appleStore = new AppleStore();

        IComputer mas = appleStore.createComputer();
        ITablet ipad = appleStore.createTablet();

        IComputer qx = samsungStore.createComputer();
        ITablet s3 = samsungStore.createTablet();
    }
}
