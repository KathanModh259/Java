class A {
    static int x = 10;

}

class B extends A {
    int x = 20;

    public void display() {
        System.out.println("Static Variable from class A:" + A.x);
        System.out.println("Instance variable of Class B:" + x);
    }

}

public class prac4_4 {
    public static void main(String[] args) {
        B p1 = new B();
        p1.display();
        System.out.println("This Practical is made by 23CS046-Kathan Modh");
    }

}
