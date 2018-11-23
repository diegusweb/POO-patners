package FactoryMethod.sample1;

public class VehicleFactory {
    public IVehicle getVehicle(String type){
        IVehicle vehicle = null;

        switch (type){
            case "car":
               vehicle = new Car();
               break;
            case "truck":
                vehicle = new Truck();
                break;
            case "Motorcycle":
                vehicle = new Motorcycle();
                break;
                default:
                    vehicle = null;
        }

        return vehicle;
    }
}
