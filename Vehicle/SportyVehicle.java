package Vehicle;

import Vehicle.Capability.SpecialDrivingCapability;

public class SportyVehicle extends Vehicle {
    public SportyVehicle() {
        super(new SpecialDrivingCapability());
    }
}
