import java.util.Arrays;
import java.util.Scanner;

class EvenAdder {
    public static void main(String[] args) {
        int[] array = createEvenArray(5);
        int[] reverse = reverseArray(array);
        System.out.println(Arrays.toString(reverse));
    }

    /**
     * @param size - number of elements to read
     * @return array containing even numbers
     */
    private static int[] createEvenArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];
        int i = 0;
        while (i < result.length) {
            System.out.println("Podaj kolejną liczbę:");
            int next = scanner.nextInt();
            if (isEven(next)){
                result[i] = next;
                i++;
            }}
            scanner.close();
            return result;

    }

    /**
     *
     * @param number - number to be checked
     * @return true if number is even, or false otherwise
     */
    private static boolean isEven(int number) {
        return (number % 2) == 0;
    }

    /**
     * @param array - array to be reversed
     * @return - reversed array
     */
    private static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        int x = reversed.length - 1;
        for (int i = 0; i < reversed.length; i++) {
            reversed[x] = array[i];
            x--;
        }
        return reversed;
    }
}