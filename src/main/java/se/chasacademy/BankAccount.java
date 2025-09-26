package se.chasacademy;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private ArrayList<Transaction> transactions = new ArrayList<>();


    public void addTransaction(Transaction t) {

        transactions.add(t);

    }


    public void printTransactions() {

        System.out.println("Transaktionslista: ");
        double balance = 0;
        for (Transaction t : transactions) {

            balance += t.getAmount();
            System.out.println(t + " Saldo:" + balance + "k r");

        }

    }

    public double totalDeposit() {

        double total = 0;
        for (Transaction t : transactions) {
            if (t.getAmount() > 0) {

                total += t.getAmount();

            }
        }

        return total;

    }

    public double totalWithdrawal() {

        double total = 0;
        for (Transaction t : transactions) {
            if (t.getAmount() < 0) {

                total += t.getAmount();

            }
        }

        return total;

    }

}
