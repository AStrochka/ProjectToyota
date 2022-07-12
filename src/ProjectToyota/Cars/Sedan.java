package ProjectToyota.Cars;

import ProjectToyota.Cars.SpareParts.*;

public abstract class Sedan extends Cars{
    private boolean isCruiseControlOn;

    public Sedan(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
                 GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels,
                 boolean isCruiseControlOn) {
        super(speedMax, color, transmission, isMoving, price, gasTank, engin, electrik, lights, wheels);
        this.isCruiseControlOn = !isCruiseControlOn;
    }
    public void changeCuiseControl(){
        this.isCruiseControlOn = !this.isCruiseControlOn;
    }

    public boolean isCruiseControlOn() {
        return isCruiseControlOn;
    }
}
