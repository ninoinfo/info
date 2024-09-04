import java.util.Scanner;

//FEHLER
//scanner nicht importiert
//integers deklariert, scanner fragt nach strings
//semikolon vergessen

public class nr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("x eingeben: ");

        x = sc.nextInt();
        System.out.println("y eingeben: ");
        y = sc.nextInt();

        int z = x + y;

        System.out.println(x + " + " + y + " = " + z);
    }
}
