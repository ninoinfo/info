import java.util.Scanner;

public class nr6 {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geb Zahl 1 ein:");
        x = scanner.nextInt();
        System.out.println("Geb Zahl 2 ein:");
        y = scanner.nextInt();

        if(x>y){
            System.out.println("Die groessere Zahl ist " + x);
        }
        else{
            System.out.println("Die groessere Zahl ist " + y);
        }
    }
}
