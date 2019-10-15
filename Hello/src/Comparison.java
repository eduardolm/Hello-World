import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {
        /** Criação do método que recebe o input do usuário */
        Scanner input = new Scanner(System.in);

        int firstNumber, secondNumber;

        System.out.print("Entre com o primeiro número: ");
        firstNumber = input.nextInt();

        System.out.print("Entre com o segundo número: ");
        secondNumber = input.nextInt();

        if (firstNumber == secondNumber) //Verifica se os números são iguais
            System.out.printf("%d == %d%n", firstNumber, secondNumber);

        if (firstNumber != secondNumber)
            System.out.printf("%d != %d%n", firstNumber, secondNumber);

        if (firstNumber < secondNumber)
            System.out.printf("%d < %d%n", firstNumber, secondNumber);

        if (firstNumber > secondNumber)
            System.out.printf("%d > %d%n", firstNumber, secondNumber);

        if (firstNumber <= secondNumber)
            System.out.printf("%d <= %d%n", firstNumber, secondNumber);

        if (firstNumber >= secondNumber)
            System.out.printf("%d >= %d%n", firstNumber, secondNumber);
    }
}
