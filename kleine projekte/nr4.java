import java.util.Scanner;
public class nr4 {
    public static void  main(String[] args){
        double x,y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("x eingeben: ");
        x = scanner.nextDouble();

        y = Math.pow(x,2)+3*x+1;

        System.out.println(y);
    }
}
