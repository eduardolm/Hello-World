import java.util.ArrayList;
import java.util.Scanner;

public class TestHeartRates {

    public static void main(String[] args) {

        /* Creates a Scanner to read information from keyboard */
        Scanner input = new Scanner(System.in);

        System.out.printf("%n%n *****  Target Heart Rate Calculator  *****%n%n");

        /* Requests for the user to enter the name and reads the name */
        System.out.printf("Enter name (name + last name): ");
        String fullName = input.nextLine();

        /* Asks for the birth date and reads the input */
        System.out.printf("Enter birth date (dd/mm/yyyy): ");
        String birthDate = input.nextLine();

        /* Splits fullName and date strings and stores each separate part of the them in lists for later retrieval */
        ArrayList birthName = HeartRates.completeName(fullName);
        ArrayList birthday = HeartRates.birthDate(birthDate);

        /* Creates a HeartRates object with input data from user */
        HeartRates heartRates = new HeartRates(((String) birthName.get(0)), ((String) birthName.get(1)),
                ((Integer) birthday.get(0)), ((Integer) birthday.get(1)), ((Integer) birthday.get(2)));

        /* Calculates age, maxRate and targetRate based on entered data */
        Integer age = HeartRates.ageCalculation(((Integer) birthday.get(2)));
        Integer maxRate = HeartRates.maxHeartRate(age);
        Double targetRate = HeartRates.targetHeartRate(maxRate);

        /* Prints the target heart rate analysis based on user data */
        System.out.printf("%s %s, birthday: %d/%d/%d, age: %d, Maximum heart rate: %d, Target heart rate: %.2f",
                heartRates.getName(), heartRates.getLastName(), heartRates.getBirthDay(),
                heartRates.getBirthMonth(), heartRates.getBirthYear(), age, HeartRates.maxHeartRate(age), targetRate);
    }
}
