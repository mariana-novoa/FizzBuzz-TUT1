public class Reduce {
    public static void main(String[] args) {

        int count = 0;
        int n = 100;
        while (n != 0){
            if (n % 2 == 0){
                count++;
                n = n / 2;
            } else {
                count++;
                n = n - 1;
            }
        }
        System.out.println(count);
    }
}
