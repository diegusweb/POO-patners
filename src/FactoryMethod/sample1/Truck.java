package FactoryMethod.sample1;

public class Truck implements IVehicle {
    @Override
    public void design() {
        System.out.println("Desing truck");
    }

    @Override
    public void manufacture() {
        System.out.println("manufacture truck");
    }
}
