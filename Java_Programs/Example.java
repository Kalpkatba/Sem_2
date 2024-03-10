public class Example {
    public static void main(String[] args) {
        String input = "3";
        
        try {
            double number = Double.parseDouble(input);
            System.out.println("Parsed Double: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Could not parse as Double.");
        }
    }
}
