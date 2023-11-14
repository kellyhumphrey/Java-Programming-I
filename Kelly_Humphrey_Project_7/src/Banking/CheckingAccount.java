/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

/**
 *
 * @author kelly
 */
public class CheckingAccount extends BankAccount {
    
    CheckingAccount(float initialBalance)
    {
        super(initialBalance);
    }
    
    @Override
    public void applyInterest()
    {
        if (accountBalance >= minimumAmountChecking)
        {
            accountBalance += (accountBalance-minimumAmountChecking)*interestRateChecking;
            System.out.println("Interest applied to "+accountNumber+" and the balance is "+accountBalance);
        }
    }
    
    @Override
    public String GetPrintDetails()
    {
        return "Checking Account "+accountNumber+", $"+accountBalance;
    }
    
    @Override
    public float getBalance()
    {
        return this.accountBalance;
    }
}
