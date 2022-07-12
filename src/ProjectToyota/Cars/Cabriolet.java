package ProjectToyota.Cars;

import ProjectToyota.Cars.SpareParts.*;

public abstract class Cabriolet extends Cars{
    private boolean isRoofUp;

    public Cabriolet(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
                     GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels, boolean isRoof) {
        super(speedMax, color, transmission, isMoving, price, gasTank, engin, electrik, lights, wheels);
        this.isRoofUp = isRoof;
    }

    public boolean isRoof() {
        return isRoofUp;
    }
    public void changeRoofStatus(){
        this.isRoofUp = !isRoofUp;
    }

    public Cabriolet(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
                     GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels) {
        super(speedMax, color, transmission, isMoving, price, gasTank, engin, electrik, lights, wheels);
    }
}
