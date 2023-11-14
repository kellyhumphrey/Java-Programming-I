/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

        /**
 *
 * @author kelly
 */
public abstract class BankAccount implements Comparable<BankAccount> {
    
    long accountNumber;
    static long nextAccountNumber = 1111111111;
    float accountBalance;
    float minimumAmountChecking = 10000; // Minimum balance amount for interest to be accrued in a Checking Account
    float interestRateSaving = (float) 0.05;  // Interest rate for Savings Account
    float interestRateChecking = (float) 0.02; // Interest rate for Checking Account

    public BankAccount(float initialBalance)
    {
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
        accountBalance = initialBalance;
        System.out.println("Successfully created account "+accountNumber+" with initial deposit "+initialBalance);
    }
    
    public void deposit(float amount)
    {
        accountBalance += amount;
        System.out.println(amount+" deposited to "+accountNumber+" and the balance is "+accountBalance);
    }
    
    public void withdraw(float amount)
    {
        if (accountBalance >= amount)
        {
            accountBalance -= amount;
            System.out.println(amount+" withdrew from "+accountNumber+" and the balance is "+accountBalance);
        }
        
        else
        {
            System.out.println("Unable to withdraw "+amount+"from account "+accountNumber+" due to insufficient funds ("+accountBalance+")");
        }
    }
    
    public abstract void applyInterest();
    public abstract void printDetails();
    public abstract float getBalance();
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(BankAccount o) 
    {
        if (this.getBalance() == o.getBalance()) return 0;
        else if (this.getBalance() > o.getBalance()) return 1;
        else return -1;
    }
    
}
