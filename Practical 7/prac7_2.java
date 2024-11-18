
// public class prac7_2 {

//     static class SummationThread extends Thread {
//         int start, end;
//         int[] array;
//         int result;

//         SummationThread(int start, int end, int[] array) {
//             this.start = start;
//             this.end = end;
//             this.array = array;
//         }

//         @Override
//         public void run() {
//             result = 0;
//             for (int i = start; i < end; i++) {
//                 result += array[i];
//             }
//         }

//         int getResult() {
//             return result;
//         }
//     }

//     public static void main(String[] args) throws InterruptedException {
//         int N = Integer.parseInt(args[0]);
//         int numThreads = Integer.parseInt(args[1]);

//         int[] array = new int[N];
//         for (int i = 0; i < N; i++) {
//             array[i] = i + 1; 
//         }

//         int chunkSize = N / numThreads;
//         SummationThread[] threads = new SummationThread[numThreads];

//         for (int i = 0; i < numThreads; i++) {
//             int start = i * chunkSize;
//             int end = (i == numThreads - 1) ? N : (i + 1) * chunkSize;
//             threads[i] = new SummationThread(start, end, array);
//             threads[i].start();
//         }

//         int totalSum = 0;
//         for (SummationThread thread : threads) {
//             thread.join();
//             totalSum += thread.getResult();
//         }

//         System.out.println("Final result: " + totalSum);
//     }
// }


import java.util.*;

class myThread1 implements Runnable {
    int n, t;
    int th[] = new int[100];

    myThread1(int a, int b, int c[]) {
        n = a;
        t = b;
        th = c;
    }

    public void run() {
        for (int i = 1; i <= t; i++) {
            System.out.println("The consecutive Thread is:");
            System.out.println(th[i]);
        }
        System.out.println(" This Practical is made by 23CS046-Kathan Modh ");
    }
}

public class prac7_2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number :");
            int n = sc.nextInt();
            System.out.println("Enter number of threads : ");
            int t = sc.nextInt();
            int a[] = new int[100];
            a[1] = n / t;
            int sum = 0;
            for (int i = 0; i < t; i++) {
                a[i] = a[1];
                sum += a[i];
            }
            a[t] = n - sum;
            myThread1 m = new myThread1(n, t, a);
            Thread b = new Thread(m);
            b.start();
        } catch (Exception e) {
        }
    }

}