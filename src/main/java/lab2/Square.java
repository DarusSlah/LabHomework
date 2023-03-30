package lab2;

public class Square {
    public String name;
    public String sides;

    public String calculateArea(double side) {
        double areaOfSquare = side * 4;

        return "Shape: " + this.name + "\n" + this.sides +"\n" +"The Area:" + areaOfSquare;


    }

}
