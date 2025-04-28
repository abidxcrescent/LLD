package Vehicle;

import Vehicle.Capability.DriveCapability;

public class Vehicle {

    public DriveCapability driveCapability;

    public Vehicle(DriveCapability driveCapability) {
        this.driveCapability = driveCapability;
    }

    public void drive() {
        driveCapability.drive();
    }

}
