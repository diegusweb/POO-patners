package FactoryMethod.sample1;

public class Main {

    public static void main(String[] args){
        VehicleFactory factory = new VehicleFactory();

        IVehicle vehicle = factory.getVehicle("car");
        vehicle.design();
        vehicle.manufacture();
    }
}
