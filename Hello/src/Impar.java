import java.util.Scanner;

public class Impar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        Integer number = input.nextInt();

        if (number % 2 == 0)
            System.out.printf("O número %d é par! %n", number);
        else
            System.out.printf("O número %d é ímpar! %n", number);
    }
}
