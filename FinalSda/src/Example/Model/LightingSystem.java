package Example.Model;

public class LightingSystem {
    private String systemId;
    private String currentState;

    public LightingSystem(String systemId) {
        this.systemId = systemId;
        this.currentState = "OFF"; // Initial state
    }

    public void turnOnLights() {
        this.currentState = "ON";
        System.out.println("Lighting System: Lights turned ON.");
    }

    public void turnOffLights() {
        this.currentState = "OFF";
        System.out.println("Lighting System: Lights turned OFF.");
    }

    public String getCurrentState() {
        return currentState;
    }

    public String getSystemId() {
        return systemId;
    }
}

