package lesson1.polymorphism;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnyShape {

    private final Shape shape;

    public double square() {
        return shape.square();
    }
}
