import java.util.Scanner;


public class nr3 {
    public static void  main(String[] args){
        int x,y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("x eingeben: ");
        x = scanner.nextInt();

        y = (2 * x + 84)/2-x;


        System.out.println(y);
    }
}
