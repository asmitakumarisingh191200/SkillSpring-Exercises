interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting");
    }
}

class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("car")) {
            return new Car();
        }

        else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }

        return null;
    }
}

public class FactoryMethod {

    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("car");
        v1.start();

        Vehicle v2 = VehicleFactory.getVehicle("bike");
        v2.start();
    }
}
