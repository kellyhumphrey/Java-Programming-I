/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

/**
 *
 * @author kelly
 */
public class SavingAccount extends BankAccount {
    
    SavingAccount(float initialBalance)
    {
        super(initialBalance);
    }
    
    @Override
    public void applyInterest()
    {
        accountBalance += (accountBalance*interestRateSaving);
        System.out.println("Interest applied to "+accountNumber+" and the balance is "+accountBalance);
    }
    
    @Override
    public String GetPrintDetails()
    {
        return "Saving Account " + accountNumber + ", $" + accountBalance;
    }
    
    @Override
    public float getBalance()
    {
        return this.accountBalance;
    }
}