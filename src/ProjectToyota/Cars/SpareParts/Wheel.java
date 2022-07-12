package ProjectToyota.Cars.SpareParts;

import ProjectToyota.Cars.CarDetailBroken;

public class Wheel extends CarDetailBroken {
    private WheelRadius wheelRadius;

    public Wheel(boolean isBroken, WheelRadius wheelRadius) {
        super(isBroken);
        this.wheelRadius = wheelRadius;
    }

    public WheelRadius getWheelRadius() {
        return wheelRadius;
    }
}
