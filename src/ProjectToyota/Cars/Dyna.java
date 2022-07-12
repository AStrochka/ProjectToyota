package ProjectToyota.Cars;

import ProjectToyota.Cars.SpareParts.*;

public class Dyna extends CarVagan{
    private Soket soket;

    public Dyna(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
                GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels, int maxWeight,
                Soket soket) {
        super(speedMax, color, transmission, isMoving, price, gasTank, engin, electrik, lights, wheels, maxWeight);
        this.soket = soket;
    }

    public Soket getSoket() {
        return soket;
    }

}
