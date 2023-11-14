/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

/**
 *
 * @author kelly
 */
public class SavingAccount {
    // Initial variables
    long accountNumber;
    float accountBalance;
    int[] accountNumberList = new int[]{1111111111,1111111112,1111111113,1111111114,1111111115,1111111116,1111111117,1111111118,1111111119,1111111120};  //Capping this program to 10 possible accounts
    int availAccntNum = 0;  // Indicates the index of the next available account number in the "AccountNumberList" array.
    float minimumAmountChecking = 10000; // Minimum balance amount for interest to be accrued in a Checking Account
    float interestRateSavings = (float) 0.05;  // Interest rate for Savings Account
    float interestRateChecking = (float) 0.02; // Interest rate for Checking Account
    
    //Populating accountNumberList
    
    SavingAccount(float accountBalance)
    {
        if (availAccntNum < 100)
        {
            accountNumber = accountNumberList[availAccntNum];
            availAccntNum = availAccntNum + 1;
            this.accountBalance = accountBalance;
        }
        else
        {
            System.out.println("Error: We have reached the maximum number of allowable accounts.");
        }
    }
    
    void deposit(float amount)
    {
        accountBalance = accountBalance + amount;
        System.out.println(amount+" was deposited to account "+accountNumber+" and  the balance is "+accountBalance);
    }
    
    void withdraw(float amount)
    {
        
        if (amount < accountBalance)
        {
            accountBalance = accountBalance - amount;        
            System.out.println(amount+" withdrew from account "+accountNumber+" and the balance is now "+accountBalance);
        }
        
        else
        {
            System.out.println("You are attempting to withdraw "+amount+" but your account balance is: "+accountBalance);
        }
        
    }
    
    void applyInterest()
    {
        float interest = accountBalance*interestRateSavings;
        accountBalance = accountBalance + interest;
        System.out.println("Interest applied to account "+accountNumber+" and the balance is "+accountBalance);
    }
}
