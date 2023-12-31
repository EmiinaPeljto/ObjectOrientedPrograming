package Week13.Task4;

public class DeviceAdapter implements NewDevice{
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void operateNewFunction() {
        oldDevice.operateOldFunction();
        System.out.println("Translating old function to a new device.");
    }
}
