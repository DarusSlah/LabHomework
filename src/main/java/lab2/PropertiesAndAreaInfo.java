package lab2;

public class PropertiesAndAreaInfo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.name = "Triangle";
        triangle.sides = "A Triangle has 3 sides";

        System.out.println(triangle.calculateArea(3,4));


        Circle circle = new Circle();
        circle.name = "Circle";
        circle.sides = "A Circle has no sides";

        System.out.println(circle.calculateArea(4));


        Square square = new Square();
        square.name = "Triangle";
        square.sides = "A Square has 4 sides";

        System.out.println(square.calculateArea(12));

    }
}
