package Example.Model;

public class LightSensor {
    private String sensorId;
    private int lightLevel;

    public LightSensor(String sensorId) {
        this.sensorId = sensorId;
    }

    public int detectLightLevel() {
        // Simulate detecting light level (e.g., 0 = dark, 100 = bright)
        this.lightLevel = (int) (Math.random() * 100);
        return lightLevel;
    }

    public String getSensorId() {
        return sensorId;
    }

    public int getLightLevel() {
        return lightLevel;
    }
}
