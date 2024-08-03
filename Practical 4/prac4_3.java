
class Rectangle {
    double length;
    double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public void area() {
        double area;
        area = length * breath;
        if (length == breath) {
            System.out.println("Area of Square" + area);

        } else {
            System.out.println("Area of Rectangle" + area);
        }

    }

    public void perimeter() {
        double perimeter;
        perimeter = 2 * (length + breath);
        if (length == breath) {
            System.out.println("Perimeter of Square" + perimeter);

        } else {
            System.out.println("Perimeter of Rectangle:" + perimeter);

        }
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

}

public class prac4_3 {
    public static void main(String[] args) {
        Rectangle[] r1 = new Rectangle[2];

        r1[0] = new Rectangle(15, 25);
        r1[0].area();
        r1[0].perimeter();

        r1[1] = new Square(5);
        r1[1].area();
        r1[1].perimeter();

        System.out.println("\nThis Practical is made by 23CS046-Kathan Modh");
    }

}
