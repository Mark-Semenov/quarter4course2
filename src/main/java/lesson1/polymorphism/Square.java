package lesson1.polymorphism;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Square implements Shape {

    private int a;

    @Override
    public double square() {
        return a * a;
    }

}
