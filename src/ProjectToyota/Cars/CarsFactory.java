package ProjectToyota.Cars;

//import ProjectToyota.Cars.SpareParts.GasTank;
//import ProjectToyota.Cars.SpareParts.TransmissionType;
//import ProjectToyota.Cars.SpareParts.Usb;
//import ProjectToyota.Cars.SpareParts.WheelRadius;

import ProjectToyota.Cars.SpareParts.*;

public class CarsFactory extends SparePartsFactory {

    public static void CreateCar() {
        Camry camry = new Camry(100, "black", TransmissionType.AUTOMATIC, false, 10000.00,
                new GasTank(25), new Engin(false), new Electrik(false),
                new Lights(false), createWeelsWithRadius(WheelRadius.R17), false, new Usb());
        try {
            camry.start();
        } catch (StartCarException e) {
            throw new RuntimeException(e);
        }
    }
}
