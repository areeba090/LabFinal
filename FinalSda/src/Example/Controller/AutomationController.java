package Example.Controller;

import Example.Model.LightSensor;
import Example.Model.LightingSystem;
import Example.Model.Lights;
import Example.View.AutomationView;

public class AutomationController {
    private LightSensor lightSensor;
    private LightingSystem lightingSystem;
    private Lights lights;
    private AutomationView view;

    public AutomationController(LightSensor lightSensor, LightingSystem lightingSystem, Lights lights, AutomationView view) {
        this.lightSensor = lightSensor;
        this.lightingSystem = lightingSystem;
        this.lights = lights;
        this.view = view;
    }

    public void automateLighting() {
        // Step 1: Detect light level
        int lightLevel = lightSensor.detectLightLevel();
        view.displayLightLevel(lightLevel);

        // Step 2: Process light level and decide command
        String command = lightLevel < 50 ? "TURN_ON" : "TURN_OFF";
        view.displayCommand(command);

        // Step 3: Execute command on the lighting system
        if (command.equals("TURN_ON")) {
            lightingSystem.turnOnLights();
            lights.changeState("ON");
        } else {
            lightingSystem.turnOffLights();
            lights.changeState("OFF");
        }

        // Step 4: Display final state
        view.displayFinalLightState(lights.getState());
    }
}

