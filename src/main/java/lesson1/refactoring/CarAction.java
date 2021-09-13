package lesson1.refactoring;

/*
Т.к. методы интерфейсов Movable & Stoppable подходят ко всем машинам,
их можно объединить в один интерфес напр. CarAction.
В этот же интерфес можно перенести методы start & open из класса Car.
И если какая-либо из машин вдруг должна летать всегда можно создать интерфес Flyable с методом fly
и существующие классы не придется изменять.
 */

public interface CarAction {

    void start();

    void stop();

    void move();

    void open();

}
