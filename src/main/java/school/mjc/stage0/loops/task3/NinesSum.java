package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        String nine = "9";
        String line="";
        for (int i = 0; i < lengthOfLastNumber; i++){
        line = line + nine;
        sum = sum+Integer.parseInt(line);
        }
        System.out.println(sum);
    }
}
