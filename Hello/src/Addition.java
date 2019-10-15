import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber,secondNumber;

        System.out.print("Entre com o primeiro número: ");
        firstNumber = input.nextInt();

        System.out.print("Entre com o segundo número: ");
        secondNumber = input.nextInt();

        System.out.printf("A soma é: %d%n", firstNumber + secondNumber);


    }
}
