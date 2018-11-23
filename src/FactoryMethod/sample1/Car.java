package FactoryMethod.sample1;

public class Car implements IVehicle {
    @Override
    public void design() {
        System.out.println("Desing car");
    }

    @Override
    public void manufacture() {
        System.out.println("manufacture car");
    }
}
