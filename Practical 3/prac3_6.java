import java.util.Scanner;

public class prac3_6 {
    static class Complex {
        int real1, imagi1, real2, imagi2;

        Complex() {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the Real Part of Complex Number 1");
                real1 = sc.nextInt();
                System.out.println("Enter the Imaginary Part of Complex Number 1");
                imagi1 = sc.nextInt();
                System.out.println("Enter the Real Part of Complex Number 2");
                real2 = sc.nextInt();
                System.out.println("Enter the Imaginary Part of Complex Number 2");
                imagi2 = sc.nextInt();

            }
        }

        void add() {
            int add_r, add_i;
            add_r = real1 + real2;
            add_i = imagi1 + imagi2;
            System.out.println("The addition of two Complex numbers is " + add_r + " + " + add_i + "i");

        }

        void sub() {
            int sub_r, sub_i;
            sub_r = real1 - real2;
            sub_i = imagi1 + imagi2;
            System.out.println("The subtraction of two Complex numbers is " + sub_r + " + " + sub_i + "i");

        }

        void mult() {
            int realM1, img_to_real, imagM1, imagM2, f1, f2;
            realM1 = real1 * real2;
            img_to_real = -(imagi1 * imagi2);
            imagM1 = real1 * imagi2;
            imagM2 = imagi1 * real2;
            f1 = realM1 + img_to_real;
            f2 = imagM1 + imagM2;
            System.out.println("The Multiplication of two Complex numbers is " + f1 + " + " + f2 + "i");

        }
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.add();
        c1.sub();
        c1.mult();

        System.out.println("\n\n This Practical is made by 23CS046-Kathan Modh");
    }
}
