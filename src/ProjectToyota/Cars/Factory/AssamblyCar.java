package ProjectToyota.Cars.Factory;

import ProjectToyota.Cars.Camry;
import ProjectToyota.Cars.Dyna;
import ProjectToyota.Cars.Hiance;
import ProjectToyota.Cars.Solara;
import ProjectToyota.Cars.SpareParts.*;

public class AssamblyCar {
    private Country country;
    private SparePartsFactory sparePartsFactory;

    public AssamblyCar(Country country, SparePartsFactory sparePartsFactory) throws CountyFactoryNotEqualException {
        if (country != sparePartsFactory.getCountry()) {
            throw new CountyFactoryNotEqualException("Фабрика в стране " + sparePartsFactory.getCountry() +
                    ", а сборочный конеер в " + country);

        }
        this.country = country;
        this.sparePartsFactory = sparePartsFactory;
    }

    public Camry createCamry(String color, double price) {
        Electrik electrik = sparePartsFactory.createElectric();
        Engin engin = sparePartsFactory.cteateEngine();
        GasTank gasTank = sparePartsFactory.createGasTank();
        Lights lights = sparePartsFactory.createLights();
        Wheel[] wheels = sparePartsFactory.createWeels(WheelRadius.R17);

        Usb usb = sparePartsFactory.createUsb();

        return new Camry(250, color, TransmissionType.AUTOMATIC, false, price, gasTank, engin,
                electrik, lights, wheels,false, usb );
    }

    public Solara createSolara(String color, double price) {
        Electrik electrik = sparePartsFactory.createElectric();
        Engin engin = sparePartsFactory.cteateEngine();
        GasTank gasTank = sparePartsFactory.createGasTank();
        Lights lights = sparePartsFactory.createLights();
        Wheel[] wheels = sparePartsFactory.createWeels(WheelRadius.R16);

        MiniFrige miniFrige = sparePartsFactory.createMiniFrige();

        return new Solara (300, color, TransmissionType.ROBOT, false, price, gasTank, engin,
                electrik, lights, wheels,false,miniFrige );
    }

    public Dyna createDyna(String color, double price) {
        Electrik electrik = sparePartsFactory.createElectric();
        Engin engin = sparePartsFactory.cteateEngine();
        GasTank gasTank = sparePartsFactory.createGasTank();
        Lights lights = sparePartsFactory.createLights();
        Wheel[] wheels = sparePartsFactory.createWeels(WheelRadius.R20);

        Soket soket = sparePartsFactory.createSoket();

        return new Dyna (200, color, TransmissionType.MECHANIC, false, price, gasTank, engin,
                electrik, lights, wheels,1000,soket );
    }

    public Hiance createHiance(String color, double price) {
        Electrik electrik = sparePartsFactory.createElectric();
        Engin engin = sparePartsFactory.cteateEngine();
        GasTank gasTank = sparePartsFactory.createGasTank();
        Lights lights = sparePartsFactory.createLights();
        Wheel[] wheels = sparePartsFactory.createWeels(WheelRadius.R20);

        Wheel safeWeel = sparePartsFactory.createSafeWheel(WheelRadius.R20);

        return new Hiance (200, color, TransmissionType.MECHANIC, false, price, gasTank, engin,
                electrik, lights, wheels,1500, safeWeel );
    }
}
//Hiance(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
//                  GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels, int maxWeight,
//                  Wheel safeWeel)