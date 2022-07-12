package ProjectToyota.Cars;

import ProjectToyota.Cars.SpareParts.*;

public class Hiance extends CarVagan{
    private Wheel safeWeel;

    public Hiance(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
                  GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels, int maxWeight,
                  Wheel safeWeel) {
        super(speedMax, color, transmission, isMoving, price, gasTank, engin, electrik, lights, wheels, maxWeight);
        this.safeWeel = safeWeel;
    }

    public Wheel getSafeWeel() {
        return safeWeel;
    }

}
