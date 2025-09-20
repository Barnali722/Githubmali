import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static int calculateAge(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        return Period.between(birthDate, today).getYears();
    }

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2006, 7, 7); // March 10, 2000
        int currentAge = calculateAge(birthDate);
        System.out.println("Age: " + currentAge);
    }
}