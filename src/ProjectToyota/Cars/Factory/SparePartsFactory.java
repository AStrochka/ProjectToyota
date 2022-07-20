package ProjectToyota.Cars.Factory;

import ProjectToyota.Cars.SpareParts.*;

public class SparePartsFactory {
    private Country country;

    public SparePartsFactory(Country country) {
        this.country = country;
    }

    public Electrik createElectric() {
        return new Electrik(false);
    }

    public Engin cteateEngine() {
        return new Engin(false);
    }

    public GasTank createGasTank() {
        return new GasTank(0);
    }

    public Lights createLights() {
        return new Lights(false);
    }

    public MiniFrige createMiniFrige() {
        return new MiniFrige();
    }

    public Soket createSoket() {
        return new Soket();
    }

    public Usb createUsb() {
        return new Usb();
    }

    public  Wheel createSafeWheel(WheelRadius wheelRadius) {
        return new Wheel(false, wheelRadius);
    }

    public Wheel[] createWeels(WheelRadius weelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, weelRadius);
        }
        return wheels;

    }

    public Country getCountry() {
        return country;
    }
//
//    public void SparePartsProduction(){
//        GasTank gasTank =  new GasTank(40);
//        Engin engin = new Engin(false);
//        Electrik electrik = new Electrik(false);
//        Lights lights = new Lights(false);
//        MiniFrige miniFrige = new MiniFrige();
//        Soket soket = new Soket();
//        Usb usb = new Usb();
//
//            }
//
//    public static Wheel[] createWeelsWithRadius(WheelRadius wheelRadius) {
//        Wheel[] wheels = new Wheel[4];
//        for (int i = 0; i < wheels.length; i++) {
//            wheels[i] = new Wheel(false, wheelRadius);
//        }
//        return wheels;
//    }
}

