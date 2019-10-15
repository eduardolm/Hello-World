/** Classe que cria e manipula o objeto Account. Insere nome, saldo e valor depositado e retorna o nome, e o saldo
 * após o depoósito */

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        /** Cria 2 instâncias de Account e as inicializa com nome e saldo inicial */
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        /** Imprime o nome e saldo de cada conta */
        displayAccount(account1);
        displayAccount(account2);

        /** Cria um input que recebrá o valor a ser depositado */
        Scanner input = new Scanner(System.in);

        /** Solicita o valor a ser depositado na Account1 e atualiza o saldo */
        System.out.print("Enter deposit amount for account1: ");
        Double depositAmount = input.nextDouble();
        System.out.printf("%nadding $ %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        /** Imprime o saldo atualizado para cada uma das instâncias de Account */
        displayAccount(account1);
        displayAccount(account2);

        /** Solicita o valor a ser depositado na Account2 e atualiza o saldo */
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding $ %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        /** Imprime os valores atualizados de saldo das instâncias de Account */
        displayAccount(account1);
        displayAccount(account2);

        /** Solicita o valor a ser retirado da Account1 e atualiza o saldo */
        System.out.print("Enter withdrwawal value for account1: ");
        Double withdrawAmount = input.nextDouble();
        System.out.printf("Withdrawing $%.2f from account1...%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        /** Imprime os valores atualizados de saldo das instâncias de Account */
        displayAccount(account1);
        displayAccount(account2);

        /** Solicita o valor a ser retirado da Account1 e atualiza o saldo */
        System.out.print("Enter withdrwawal value for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("Withdrawing $%.2f from account2...%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        /** Imprime os valores atualizados de saldo das instâancias de Account */
        displayAccount(account1);
        displayAccount(account2);

    }

    private static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $ %.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
