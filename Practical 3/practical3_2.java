import java.util.Scanner;;

public class practical3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        double n = sc.nextDouble();
        TriangleArea r1 = new TriangleArea();
        TriangleArea r2 = new TriangleArea(n);
        System.out.println("Enter the Base and Height of the Triangle respectively: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        TriangleArea a1 = new TriangleArea(h, b);
        System.out.println("\n\nThis Practical is made by 23CS046-Kathan Modh");

        sc.close();

    }

}

class TriangleArea {

    TriangleArea() {
        int i = 5;
    }

    TriangleArea(double n) {
        double ans;
        ans = 3.14 * n * n;
        System.out.println("The Area of Circle is: " + ans);
    }

    TriangleArea(double h, double b) {
        double ans;
        ans = 0.5 * h * b;
        System.out.println("The Area of Triangle is: " + ans);
    }

}
