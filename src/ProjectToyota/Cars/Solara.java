package ProjectToyota.Cars;

import ProjectToyota.Cars.SpareParts.*;

public class Solara extends Cabriolet{
    private MiniFrige miniFrige;

    public Solara(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
                  GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels, boolean isRoof,
                  MiniFrige miniFrige) {
        super(speedMax, color, transmission, isMoving, price, gasTank, engin, electrik, lights, wheels, isRoof);
        this.miniFrige = miniFrige;
    }

    public MiniFrige getMiniFrige() {
        return miniFrige;
    }
}
