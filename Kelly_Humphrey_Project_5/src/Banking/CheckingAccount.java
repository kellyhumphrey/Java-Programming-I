/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

/**
 *
 * @author kelly
 */
public class CheckingAccount extends SavingAccount{
    
    CheckingAccount(float accountBalance)
    {
        super(accountBalance);
    }
    
    @Override
    void applyInterest()
    {
        
        if (accountBalance > minimumAmountChecking)
        {
            float interest = (accountBalance-minimumAmountChecking)*interestRateChecking;
            accountBalance = accountBalance + interest;
        }
    }
    
}
