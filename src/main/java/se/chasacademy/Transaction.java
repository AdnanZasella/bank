package se.chasacademy;

public class Transaction {

    private double amount;
    private double saldo;


    public Transaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {

        if (amount >= 0) {
            return "Insättning: " + amount + " kr";
        } else {
            return "Uttag: " + (-amount) + " kr"; // ta bort minustecknet
        }

    }

}
