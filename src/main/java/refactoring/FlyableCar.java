package refactoring;

import lombok.Data;

@Data
public class FlyableCar extends Car implements CarAction, Flyable{

    @Override
    public void start() {
        System.out.println("FlyableCar is start");
    }

    @Override
    public void stop() {
        System.out.println("FlyableCar is stop");
    }

    @Override
    public void move() {
        System.out.println("FlyableCar is moving");
    }

    @Override
    public void open() {
        System.out.println("FlyableCar is open");
    }

    @Override
    public void fly() {
        System.out.println("FlyableCar is flying");
    }
}
