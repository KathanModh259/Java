interface Shape {
    String getColor();

    default void displayDetails() {
        System.out.println("Shape color: " + getColor());
    }
}

class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void displayDetails() {
        Shape.super.displayDetails();
        System.out.println("Circle radius: " + radius);
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void displayDetails() {
        Shape.super.displayDetails();
        System.out.println("Rectangle length: " + length + ", width: " + width);
    }
}

class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void displaySignDetails() {
        shape.displayDetails();
        System.out.println("Sign text: " + text);
    }
}

public class prac4_7 {

    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 3.0, "Blue");

        Sign circleSign = new Sign(circle, "Welcome to the Campus Center!");
        Sign rectangleSign = new Sign(rectangle, "Event at 5 PM");

        System.out.println("Circle Sign Details:");
        circleSign.displaySignDetails();

        System.out.println("\nRectangle Sign Details:");
        rectangleSign.displaySignDetails();

        System.out.println("This practical is made by 23CS046-Kathan Modh");
    }
}
