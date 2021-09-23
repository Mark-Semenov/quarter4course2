package lesson1.polymorphism;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle implements Shape {

    private double radius;

    @Override
    public double square() {
        return 3.14 * (this.radius * this.radius);
    }

}
