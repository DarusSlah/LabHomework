package lab2;

public class Circle {
    public String name;
    public String sides;

    public String calculateArea(double radius) {

        double areaOfCircle = radius * radius * Math.PI;

        return "Shape: " + this.name + "\n" + this.sides +"\n" +"The Area:" + areaOfCircle;

    }

}
