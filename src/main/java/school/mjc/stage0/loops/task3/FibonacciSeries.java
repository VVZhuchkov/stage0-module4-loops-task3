package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int sum = 0;
        int first= 1;
        System.out.println(sum);
        System.out.println(first);
        for (int i = 2; i < lastFibonacci; i++) {
            sum = sum(i-1) + (i-2);
            System.out.println(sum);
        }
    }
}
