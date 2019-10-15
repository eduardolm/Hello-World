
public class Account {

    /** Variáveis de instância */
    private String name;
    private Double balance;

    /** Construtor de Account que recebe dois parâmetros */
    public Account(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }
    /** Setter - armazena o name na instância do objeto */
    public void setName(String name) {
        this.name = name;
    }

    /** Getter - retorna o name armazenado na instância do objeto */
    public String getName() {
        return name;
    }

    /** Método de Account que recebe o valor a ser depositado e o adiciona ao saldo anterior */
    public void deposit(Double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    /** Getter - retorna o valor do saldo da instância do objeto Account */
    public Double getBalance() {
        return balance;
    }

    /**Withdraw - método que retira dinheiro de uma instância de Account */
    public Double withdraw(Double withdrawAmount) {
        if (withdrawAmount <= balance)
            balance = balance - withdrawAmount;
        else
            System.out.printf("Withdrawal amount exceeded account balance%n%n");
        return balance;
    }
}
