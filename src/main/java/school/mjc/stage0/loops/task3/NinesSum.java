package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0, nine = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            nine = nine * 10 + 9;
            sum += nine;
        }
        System.out.println(sum);
    }
}
