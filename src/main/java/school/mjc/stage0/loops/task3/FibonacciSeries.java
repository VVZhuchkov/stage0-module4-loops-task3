package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        int sum;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i < lastFibonacci; i++) {
          sum = first+second;
          first = second;
          second = sum;
            System.out.println(sum);
        }
    }
}
