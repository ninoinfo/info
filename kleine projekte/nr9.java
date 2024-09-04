import java.util.Scanner;

public class nr9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zahl eingeben: ");

        for(int i = sc.nextInt(); i!=1 ;i--){
            System.out.println(i + " bottle of rum, pass one around, until it‘s gone,");
        }
        System.out.println("last bottle of rum, pass it around, and now I‘m done.");
    }
}
