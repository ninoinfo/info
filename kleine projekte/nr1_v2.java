import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class nr1_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie heisst du?");
        String name = sc.nextLine();
        System.out.println("Wann wurdest du geboren? (dd/MM/yyyy)");
        String birthDate = sc.nextLine();

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate nextBirthday = birthday.withYear(LocalDate.now().getYear());
        Period period = Period.between(birthday, today);
        Period untilNextBirthday = Period.between(today, nextBirthday);
        int age = period.getYears();

        System.out.println("Hallo " + name + ", du bist " + period.getYears() + " Jahre, " + period.getMonths() + " Monate und " + period.getDays() + " Tage alt.");
        System.out.println("Es sind noch " + untilNextBirthday.getMonths() + " Monate und " + untilNextBirthday.getDays() + " Tage, bis du " + age + " Jahre alt bist!");

    }
}
