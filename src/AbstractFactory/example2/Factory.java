package AbstractFactory.example2;

public abstract class Factory {

    private static Factory carFactory = null;
    private static Factory truckFactory = null;

    public abstract IEngine getEngine();
    public abstract ITyre getTyre();

    public static Factory getFactory(String vehicleTrpe){
        Factory factory = null;

        switch (vehicleTrpe){
            case "car":
                if (carFactory == null)
                    carFactory = new CarFactory();
                factory = carFactory;
                break;
            case "truck":
                if (truckFactory == null)
                    truckFactory = new TruckFactory();
                factory = truckFactory;
                break;
        }

        return factory;
    }
}
