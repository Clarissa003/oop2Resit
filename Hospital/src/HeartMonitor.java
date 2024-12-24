public class HeartMonitor extends Device
{
    public HeartMonitor(String serialNumber, int energyConsumptionInKwh, Patient patient) {
        super(serialNumber, energyConsumptionInKwh, patient);
    }

    @Override
    public String getStatus() {
        return "";
    }
}
