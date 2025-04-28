package Vehicle.Capability;

public class NormalDrivingCapability implements DriveCapability {

    @Override
    public void drive() {
        System.out.println("Normal driving capability");
    }
}
