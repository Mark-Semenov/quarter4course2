import builder.Person;
import polymorphism.AnyShape;
import polymorphism.Circle;
import polymorphism.Square;
import polymorphism.Triangle;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .name("Jhon")
                .lastname("Deer")
                .age(28)
                .country("USA")
                .build();

        System.out.println(person.toString());

        AnyShape square = new AnyShape(new Square(5));
        System.out.println(square.square());

        AnyShape circle = new AnyShape(new Circle(8));
        System.out.println(circle.square());

        AnyShape triangle = new AnyShape(new Triangle(4, 8));
        System.out.println(triangle.square());

    }


}
