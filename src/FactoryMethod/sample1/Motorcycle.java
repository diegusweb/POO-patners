package FactoryMethod.sample1;

public class Motorcycle implements IVehicle {
    @Override
    public void design() {
        System.out.println("Desing Motorcycle");
    }

    @Override
    public void manufacture() {
        System.out.println("manufacture motorci=ycle");
    }
}
