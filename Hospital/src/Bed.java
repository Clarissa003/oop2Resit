import java.util.ArrayList;

public class Bed
{
    private ArrayList<Device> devices;
    private Patient patient;

    public Bed(ArrayList<Device> devices) {
        this.devices = devices;
        this.patient = null;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void addDevice (Device device)
    {
        this.devices.add(device);
    }
}
