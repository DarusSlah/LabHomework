package lab2;

public class Triangle {
    public String name;
    public String sides;

    public  String calculateArea(double base, double height) {

        double areaOfTriangle = base * height / 2;

        return "Shape: " + this.name + "\n" + this.sides +"\n" +"The Area:" + areaOfTriangle;

    }
}
