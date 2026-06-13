public class DatabaseNode extends CloudResource {
    private int storageCapacityGb;

    public DatabaseNode(String resourceId, int storageCapacityGb) {
        super(resourceId);
        this.storageCapacityGb = storageCapacityGb;
    }

    public void allocateMemory(int gigabytes) {
        System.out.println("Reserving " + gigabytes + " GB RAM for database indexing.");
    }

    public String generateHealthReport() {
        if (isActive) {
            return "DB Status: Online";
        } else {
            return "DB Status: Offline";
        }
    }

    public int getUptime() {
        return 48;
    }
}