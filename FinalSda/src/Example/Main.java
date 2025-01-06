package Example;

import Example.Controller.AutomationController;
import Example.Model.LightSensor;
import Example.Model.LightingSystem;
import Example.Model.Lights;
import Example.View.AutomationView;

public class Main {
    public static void main(String[] args) {


        LightSensor lightSensor = new LightSensor("Sensor1");
        LightingSystem lightingSystem = new LightingSystem("System1");
        Lights lights = new Lights("Light1");

        // Initialize View
        AutomationView view = new AutomationView();

        // Initialize Controller
        AutomationController controller = new AutomationController(lightSensor, lightingSystem, lights, view);

        // Simulate Lighting Automation
        controller.automateLighting();
    }
}
