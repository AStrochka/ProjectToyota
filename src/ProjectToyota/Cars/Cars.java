package ProjectToyota.Cars;

import ProjectToyota.Cars.SpareParts.*;

public abstract class Cars {
    private int speedMax;
    private String color;
    private TransmissionType transmission;
    private boolean isMoving;
    private double price;

    private GasTank gasTank;
    private Engin engin;
    private Electrik electrik;
    private Lights lights;
    private Wheel[] wheels;
    private Country country;

    public Cars(int speedMax, String color, TransmissionType transmission, boolean isMoving, double price,
                GasTank gasTank, Engin engin, Electrik electrik, Lights lights, Wheel[] wheels, Country country) {
        this.speedMax = speedMax;
        this.color = color;
        this.transmission = transmission;
        this.isMoving = isMoving;
        this.price = price;
        this.gasTank = gasTank;
        this.engin = engin;
        this.electrik = electrik;
        this.lights = lights;
        this.wheels = wheels;
        this.country = country;
    }

    public void start() throws StartCarException {
        if (!checkWhees()){
            throw new StartCarException("С колёсами проблема");
        }else if(gasTank.getCurrentVolume() <= 0){
            throw new StartCarException("Бензобак пуст");
        }else if (engin.isBroken()){
            throw new StartCarException("Двигатель сломан");
        }else if (electrik.isBroken()){
            throw new StartCarException("Электрика не работает");
        }else if (lights.isBroken()){
            throw new StartCarException("Фары не включаются");
        }
        this.isMoving = true;
    }

    public void onLights(){
        if (!lights.isBroken()){
            System.out.println("включили фары");
        }
    }

    public void stop(){
        isMoving = false;
    }
    public boolean checkWhees(){
        if (wheels == null){
            return false;
        } else if (wheels.length != 4){
            return false;
        }
        for (Wheel wheel : wheels){
            if (wheel.isBroken()){
                return false;
            }
        }
        return true;
    }


}
