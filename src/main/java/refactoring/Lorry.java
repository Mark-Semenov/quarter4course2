package refactoring;


/*
Ошибки:
 - отсутствовала реализация метода open() класса Car
 - вместо реализации класс Lorry расширял интерфейсы moveable, stopable

 */

public class Lorry extends Car implements CarAction {


    public void move() {
        System.out.println("Lorry is moving");
    }

    @Override
    public void open() {
        System.out.println("Lorry is open");
    }

    @Override
    public void start() {
        System.out.println("Lorry is start");
    }

    public void stop() {
        System.out.println("Lorry is stop");
    }

}
