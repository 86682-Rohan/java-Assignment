import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum number is: " + max);
    }
}
