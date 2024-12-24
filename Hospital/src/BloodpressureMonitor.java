public class BloodpressureMonitor extends Device
{
    public BloodpressureMonitor(String serialNumber, int energyConsumptionInKwh, Patient patient) {
        super(serialNumber, energyConsumptionInKwh, patient);
    }

    @Override
    public String getStatus() {
        return "";
    }
}
