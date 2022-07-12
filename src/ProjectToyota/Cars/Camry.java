package ProjectToyota.Cars;

import ProjectToyota.Cars.SpareParts.*;

public class Camry extends Sedan{
    private Usb usb;

    public Camry(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
                 GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels,
                 boolean isCruiseControlOn, Usb usb) {
        super(speedMax, color, transmission, isMoving, price, gasTank, engin, electrik, lights, wheels, isCruiseControlOn);
        this.usb = usb;
    }

    public Usb getUsb() {
        return usb;
    }
}
