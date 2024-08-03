import java.util.Scanner;

public class prac3_5 {
    static class Area {
        double length, breath;

        Area() {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the Length of Rectangle");
                length = sc.nextInt();
                System.out.println("Enter the breath of Rectangle");
                breath = sc.nextInt();
            }

        }

        int returArea() {
            double area;
            area = length * breath;
            System.out.println("Area of rectangle is " + area);
            return 0;
        }

    }

    public static void main(String[] args) {
        Area r1 = new Area();
        r1.returArea();
        System.out.println("\n\nThis Practical is made by 23CS046-Kathan Modh");

    }
}
