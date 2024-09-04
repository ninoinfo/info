import java.util.Scanner;

public class nr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gebe den Betrag des Warenkorbs ein: ");
        float b = sc.nextFloat();
        float rb = 0;
        if(b > 500){
            rb = b-b*10/100;
        }
        else if(b > 100){
            rb = b-b*5/100;
        }
        else{
            rb = b;
        }

        System.out.println("Originalbetrag: " + b);
        System.out.println("Rabattierter Betrag: " + rb);
    }
}
