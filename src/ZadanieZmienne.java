import java.util.Random;

public class ZadanieZmienne {
    public static void main(String[] args) {
        int x = new Random().nextInt(100);
        int y = new Random().nextInt(100);

        System.out.println("x= " + x + " ,y= " + y);
        System.out.println("Czy x jest większe od y? ");

        boolean result = x > y;
        System.out.println(result);
        System.out.println(" Czy x pomnożone przez 2 jest większe od y? ");
        result = x * 2 > y;
        System.out.println(result);
        System.out.println(" Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x-2");
        result = (y < (x + 3) && y > (x - 2));
        System.out.println(result);
        System.out.println(" Czy iloczyn x i y jest parzysty? ");
        result =(( x * y) % 2 == 0);
        System.out.println(result);
    }
}
