package lesson1.refactoring;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class LightWeightCar extends Car implements CarAction {

    @Override
    public void start() {
        System.out.println("LightWeightCar is start");
    }

    @Override
    public void stop() {
        System.out.println("LightWeightCar is stop");
    }

    @Override
    public void move() {
        System.out.println("LightWeightCar is moving");
    }

    @Override
    public void open() {
        System.out.println("LightWeightCar is open");
    }
}
