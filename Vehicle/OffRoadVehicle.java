package Vehicle;

import Vehicle.Capability.SpecialDrivingCapability;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SpecialDrivingCapability());
    }
}
