interface p1 {
    int x = 10;

    public void display();

}

interface p2 {
    int y = 20;

    public void print();
}

interface p12 extends p1, p2 {

}

class Q implements p12 {

    @Override
    public void display() {
        System.out.println("The value of number is: " + x);

    }

    @Override
    public void print() {
        System.out.println("The value of number is: " + y);

    }

}

public class prac4_6 {

    public static void main(String[] args) {
        Q ob1 = new Q();
        ob1.display();
        ob1.print();
        System.out.println("This practical is made by 23CS046-Kathan Modh");
    }

}
