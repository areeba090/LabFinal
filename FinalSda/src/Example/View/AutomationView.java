package Example.View;

public class AutomationView {
    public void displayLightLevel(int lightLevel) {
        System.out.println("View: Detected light level -> " + lightLevel);
    }

    public void displayCommand(String command) {
        System.out.println("View: Command generated -> " + command);
    }

    public void displayFinalLightState(String state) {
        System.out.println("View: Final light state -> " + state);
    }
}

