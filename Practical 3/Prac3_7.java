public class Prac3_7 {
    // pass by value example
    public static void main(String[] args) {
        int num = 10;
        System.out.println("before call:" + num);
        incrementvalue(num);
        System.out.println("after call:" + num);
        System.out.println("This Practical is made by 23CS046-Kathan Modh");
    }

    public static void incrementvalue(int value) {
        value++;
        System.out.println("inside method:" + value);
    }
}
