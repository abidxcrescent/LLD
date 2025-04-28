package Vehicle;
import Vehicle.Capability.NormalDrivingCapability;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new NormalDrivingCapability());
    }

}
