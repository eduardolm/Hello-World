import java.util.ArrayList;
import java.util.Scanner;

public class TestHealthProfile {

    public static void main(String[] args) {

        /* Creates a Scanner to read user input */
        Scanner input = new Scanner(System.in);

        System.out.printf("%n%n *****  Health Profile  *****%n%n");

        System.out.printf("Please enter name (name + last name): ");
        String fullName = input.nextLine();
        System.out.printf("Please enter birth date (dd/mm/yyyy): ");
        String birthDate = input.nextLine();
        System.out.printf("Please enter your gender: ");
        String gender = input.nextLine();
        System.out.printf("Please enter your weight (Kg): ");
        Double weight = input.nextDouble();
        System.out.printf("Please enter your height (m): ");
        Double height = input.nextDouble();

        /* Splits fullName and date strings and stores each separate part of the them in lists for later retrieval */
        ArrayList birthName = HealthProfile.completeName(fullName);
        ArrayList birthday = HealthProfile.birthDate(birthDate);

        /* Creates a HeartRates object with input data from user */
        HealthProfile healthProfile = new HealthProfile(((String) birthName.get(0)), ((String) birthName.get(1)), gender,
                ((Integer) birthday.get(0)), ((Integer) birthday.get(1)), ((Integer) birthday.get(2)), height, weight);

        /* Calculates age, maxRate and targetRate based on entered data */
        Integer age = HealthProfile.ageCalculation(((Integer) birthday.get(2)));
        Integer maxRate = HealthProfile.maxHeartRate(age);
        Double targetRate = HealthProfile.targetHeartRate(maxRate);
        Double imc = HealthProfile.imc(height, weight);

        /* Prints the target heart rate analysis based on user data */
        System.out.printf("%s %s, birthday: %d/%d/%d, age: %d, height: %.2f, weight: %.2f, IMC: %.2f, Maximum heart rate: %d, Target heart rate: %.2f",
                healthProfile.getName(), healthProfile.getLastName(), healthProfile.getBirthDay(),
                healthProfile.getBirthMonth(), healthProfile.getBirthYear(), age, height, weight, imc,
                HeartRates.maxHeartRate(age), targetRate);

    }
}
