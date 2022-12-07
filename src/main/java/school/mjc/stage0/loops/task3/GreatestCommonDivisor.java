package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
    while (second!=0){
        int r = first % second;
        first = second;
        second = r;
    }
        System.out.println(first);


        }
    }

