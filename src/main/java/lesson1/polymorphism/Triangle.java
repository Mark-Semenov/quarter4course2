package lesson1.polymorphism;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Triangle implements Shape {
    private double a;
    private double h;

    @Override
    public double square() {
        return 0.5 * a * h;
    }

}
