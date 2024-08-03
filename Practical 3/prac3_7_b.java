class MyObj {
    int value;
}

public class prac3_7_b {
    public static void main(String[] args) {
        // pass by reference example
        MyObj obj = new MyObj();
        obj.value = 10;
        callbyrefernce(obj);
        System.out.println(obj.value);
        System.out.println("This Practical is made by 23CS046-Kathan Modh");

    }

    public static void callbyrefernce(MyObj o) {
        o.value = 11;
    }
}
