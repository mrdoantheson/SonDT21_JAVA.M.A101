package fa.training.entities;

/**
 * @author SonDT21
 */

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    //public SavingsAccount(): A default constructor, it should initialize the attributes to 0, 0)
    public SavingsAccount() {
        this(0, 0);
    }

    //public SavingsAccount(double intRate, double savBal): A constructor with parameters, it creates the SavingsAccount object by setting the two fields to the passed values.
    public SavingsAccount(double intRate, double savBal) {
        annualInterestRate = intRate;
        savingsBalance = savBal;
    }

    //Getter/Setter Methods: are used to get/set the value.
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    /**
     * Provide method calculateMonthlyInterest to calculate the monthly interest
     * by multiplying the savingsBalance by annualInterestRate divided by 12 this interest should be added to savingsBalance.
     */

    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;

    }
}
