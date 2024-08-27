public class Q7 {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java MultiplicationTable <number>");
            return;
        }

        int num;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + args[0]);
            return;
        }

        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
