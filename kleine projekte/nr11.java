import java.util.Scanner;

public class nr11 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        boolean guessed = false;
        int guesses = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Versuche die Nummer von 1-100 zu erraten!");

        while(guessed == false) {
            System.out.println("Gib eine Zahl ein: ");
            int num = sc.nextInt();
            guesses++;

            if(num > rand){
                System.out.println("Dein Guess war zu hoch!");
            }
            else if(num < rand){
                System.out.println("Dein Guess war zu niedrig!");
            }
            else {
                guessed = true;
            }
        }
        System.out.println("Herzlichen Glueckwunsch, du hast " + guesses + " Versuche gebraucht um die Zahl " + rand + " zu erraten!");
    }
}
