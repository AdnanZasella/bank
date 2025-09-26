package se.chasacademy;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saldo = 0;






        while (true) {

            System.out.println("Välkommen till Swedbank, välj en av alternativen");
            System.out.println("1. Insättning");
            System.out.println("2. Uttag ");
            System.out.println("3. Se saldo ");
            System.out.println("4. Avsluta ");

            int val = sc.nextInt();


            if (val == 1) {

                System.out.println("Hur mycket pengar vill du sätta in i ditt konto?");

                double amount = sc.nextDouble();

                Transaction transaction = new Transaction(amount);

                saldo += transaction.getAmount();

                System.out.println(transaction);

            } else if (val == 2) {

                System.out.println("Hur mycket pengar vill du dra ut? ");

                double amount = sc.nextDouble();

                Transaction transaction = new Transaction(- amount);

                saldo += transaction.getAmount();

                System.out.println(transaction);
            }

            else if (val == 3) {

                System.out.println("💰 Ditt saldo är: " + saldo + " kr");

            }


        }

    }
    }
