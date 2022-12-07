package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a[] = new int[lastFibonacci];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(a[i]);
        }
    }
}



