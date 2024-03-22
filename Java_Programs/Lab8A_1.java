public class Lab_8_1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PowerCalculator <x> <y>");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (y < 0) {
                System.out.println("Exponent y must be a non-negative integer.");
                return;
            }

            long result = power(x, y);
            System.out.println(x + "^" + y + " = " + result);
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid integer format for x or y.");
        }
        catch (Exception e) {
             