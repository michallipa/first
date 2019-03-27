public class Konwersje {
    public static void main(String[] args) {
        double numer1 = 10.987;
        int numer2 = 5;

        int narrowing = (int) numer1;
        double widening = (double) numer2;

        System.out.println("Narrowing: " + narrowing);
        System.out.println("Widening: " + widening);
    }
}
