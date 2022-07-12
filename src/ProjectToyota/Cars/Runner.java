package ProjectToyota.Cars;

import ProjectToyota.Cars.SpareParts.*;

public class Runner {
    public static void main(String[] args) {
        GasTank gasTank =  new GasTank(40);
        Engin engin = new Engin(false);
        Electrik electrik = new Electrik(false);
        Lights lights = new Lights(false);

        Camry camry = new Camry (100, "black", TransmissionType.AUTOMATIC, false, 10000.00,
                gasTank, engin, electrik, lights, createWeelsWithRadius(WheelRadius.R17), false, new Usb());
        try {
            camry.start();
        } catch (StartCarException e) {
            throw new RuntimeException(e);
        }

    }

    public static Wheel[] createWeelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }
}
