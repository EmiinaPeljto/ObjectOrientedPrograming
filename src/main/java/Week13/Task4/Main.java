package Week13.Task4;

public class Main {
    public static void main(String[] args) {
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice newDevice = new NewDeviceImpl();

        System.out.println("New device: ");
        newDevice.operateNewFunction();

        System.out.println("\nOld device through the adapter:");
        DeviceAdapter adapter = new DeviceAdapter(oldDevice);
        adapter.operateNewFunction();
    }
}
