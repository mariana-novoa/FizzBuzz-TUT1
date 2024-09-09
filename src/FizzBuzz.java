/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        //for (int i = 1; i < 100; i++) { // int i = 1 creates the value of i and sets it up to 1
            // i < 100 condition that controls the loop
            // i++ this increments the value of i by 1 for each lop

            // Find out which numbers divide i.
            //boolean divisibleBy3 = i % 3 == 0;
            //boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            //if (divisibleBy3 && divisibleBy5) { // python equivalent for and is &&

                //System.out.println("Fizz Buzz");

            //} else if (divisibleBy3) {

                //System.out.println("Fizz");

            //} else if (divisibleBy5) {

                //System.out.println("Buzz");

            //} else {

                //System.out.println(i);

        int i = 1;
        while (i < 100) {  // Only condition should be inside the parentheses

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                System.out.println("Fizz Buzz");
            } else if (divisibleBy3) {
                System.out.println("Fizz");
            } else if (divisibleBy5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

            i++;  // Increment the value of i inside the loop body. AT THE END
        }

            }

    public static void doFizzBuzz(int i) {
    }
}


