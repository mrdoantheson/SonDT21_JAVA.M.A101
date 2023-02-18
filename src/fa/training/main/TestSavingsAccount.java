package fa.training.main;
/**
 * @author SonDT21
 */

import fa.training.entities.SavingsAccount;

/**
 * Instantiate two savingsAccount objects, saver1 and saver2, with balances
 * of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the monthly interest
 * and print the new balances for both savers.
 */

public class TestSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(0.04, 2000);
        SavingsAccount saver2 = new SavingsAccount(0.04, 3000);

        System.out.printf("Initial balances:\nSaver 1: $%.2f\nSaver 2: $%.2f\n",
                saver1.getSavingsBalance(), saver2.getSavingsBalance());


        //Set the annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both savers
        SavingsAccount.setAnnualInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("\nBalances after one month of 5%% interest:\nSaver 1: $%.2f\nSaver 2: $%.2f\n",
                saver1.getSavingsBalance(), saver2.getSavingsBalance());
    }
}
