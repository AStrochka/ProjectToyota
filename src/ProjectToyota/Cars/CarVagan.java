package ProjectToyota.Cars;

import ProjectToyota.Cars.SpareParts.*;

public abstract class CarVagan extends Cars{
    private static final Country country = Country.JAPAN;
    private int maxWeight;

    public CarVagan(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
                    GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels, int maxWeight) {
        super(speedMax, color, transmission, isMoving, price, gasTank, engin, electrik, lights, wheels, country);
        this.maxWeight = maxWeight;
    }

    public CarVagan(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
                    GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels) {
        super(speedMax, color, transmission, isMoving, price, gasTank, engin, electrik, lights, wheels, country);
    }

    public int getMaxWeight() {
        return maxWeight;
    }

}
