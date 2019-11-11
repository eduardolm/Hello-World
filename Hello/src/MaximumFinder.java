import java.util.Scanner;

public class MaximumFinder {

    public static void main(String[] args) {

        // Cria Scanner para entrada de dados
        Scanner input = new Scanner(System.in);

        // Solicita três valores reais
        System.out.println("Enter three floating-point values, separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Determina o maior dos números
        double result = maximum(number1, number2, number3);

        System.out.println("Maximum is: " + result);
    }

    public static double maximum(double x, double y, double z) {
        double maximumValue = x;
        if (y > maximumValue){
            maximumValue = y;
        }
        if (z > maximumValue){
            maximumValue = z;
        }
        return maximumValue;
    }
}
