package lesson1.refactoring;

/*
Ошибки: Отсутвовал класс Engine на которую ссылается переменная engine
 */

import lombok.Data;

@Data
abstract class Car {

    public Engine engine;
    private String color;
    private String name;


}
