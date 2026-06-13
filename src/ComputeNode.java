public class ComputeNode extends CloudResource {
    private int cpuCores;

    public ComputeNode(String resourceId, int cpuCores) {
        super(resourceId);
        this.cpuCores = cpuCores;
    }

    public void allocateMemory(int gigabytes) {
        System.out.println("Allocating " + gigabytes + " GB RAM for compute inference tasks.");
    }

    public String generateHealthReport() {
        if (isActive) {
            return "Healthy";
        } else {
            return "Unhealthy";
        }
    }

    public int getUptime() {
        return 24;
    }
}