package Example.Model;

public class Lights {
    private String lightId;
    private String state;

    public Lights(String lightId) {
        this.lightId = lightId;
        this.state = "OFF"; // Initial state
    }

    public void changeState(String newState) {
        this.state = newState;
        System.out.println("Lights: State changed to " + state);
    }

    public String getState() {
        return state;
    }

    public String getLightId() {
        return lightId;
    }
}

