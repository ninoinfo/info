import java.util.Scanner; // Importiert Scanner Modul fuer spaeter

public class nr5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Startet Scanner mit Eingabe"berechtigung"
        System.out.print("Bitte eine Zahl eingeben: "); // Printet Aufforderung eine Zahl einzugeben
        int t = Integer.parseInt(sc.nextLine()); // Erstellt int t und fragt sie vom Benutzer ab

        if (t < 1 || t > 7) { // Falls t kleiner als 1 oder groesser als 7 ist = ungueltige eingabe
            System.out.println("ungueltige Eingabe");
        } else {
            if (t < 6) { // Falls t kleiner als 6 ist:
                System.out.println("noch " + (6 - t) + " Tag(e)."); //Rechnet es die Dauer bis zum Wochenende aus
            } else {
                System.out.println("Wochenende!");
            }
        }
    }
}