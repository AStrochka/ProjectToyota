package ProjectToyota.Cars;

import ProjectToyota.Cars.SpareParts.*;

public class SparePartsFactory {
    public void SparePartsProduction(){
        GasTank gasTank =  new GasTank(40);
        Engin engin = new Engin(false);
        Electrik electrik = new Electrik(false);
        Lights lights = new Lights(false);
        MiniFrige miniFrige = new MiniFrige();
        Soket soket = new Soket();
        Usb usb = new Usb();

            }

    public static Wheel[] createWeelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }
}

