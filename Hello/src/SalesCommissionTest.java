import java.util.Scanner;

public class SalesCommissionTest {

    public static void main(String[] args){

        // Creates a Scanner to get user input data
        Scanner input = new Scanner(System.in);

        System.out.printf("%n%n *****  Sales Commission Calculator  *****%n%n");
        double commission = 0.0;
        double sumCommission = 0.0;

        while (commission != -1){
            System.out.print("Enter commission amount or -1 to quit: ");
            commission = input.nextDouble();
            sumCommission += commission;
        }

        double commissionTotal = SalesCommission.commissionAmount(sumCommission) + 200.0;
        System.out.printf("%nTotal seller's income: %.2f%n", commissionTotal);

    }
}
