public class Multiples {
    public static void main(String[] args) {

        int count = 0;
        int i = 1;
        while (i < 1000) {  // Only condition should be inside the parentheses

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
            i++;
    }
        System.out.println("Count of multiples of 3 or 5: " + count);
}}
