/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

/**
 * For this project, we are going to add a new feature to the simple bank application we completed for Project 5. 
 * The new feature is introducing a new class "Customer".   
 * A Customer has a first name, last name, social security number, and s/he can have up to 10 bank accounts.   
 * The Customer class should implement the following methods: 
 * @author kelly
 */
public class Customer {
    
    String FirstName; 
    String LastName;
    String SSN;
    BankDatabase CustomerAccounts; 
    int MaxCustomerAccounts = 10;
    static int AccountIndex;  
    float MinimumDeposit = 100.0f;
            
            
    Customer (String FirstName, String LastName, String SSN)
    {
        AccountIndex = 0;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.SSN = SSN;
        CustomerAccounts = new BankDatabase(MaxCustomerAccounts);
        System.out.println("Account created for " + FirstName + " " + LastName);

    }
    
     public void addNewCheckingAccount(float initialDeposit) throws CustomerAccountsLimit, MinimumDepositRequired
     {
        /**
         *
         * This method creates and adds a new checking account for the customer.
         * If the initial deposit is less than $100, an exception should be thrown and the account should not be created. 
         * Use an instance of Exception class to throw an exception. 
         * 
        */
        if (AccountIndex == MaxCustomerAccounts)
        {
            CustomerAccountsLimit CAL = new CustomerAccountsLimit(FirstName, LastName, MaxCustomerAccounts);
            throw CAL;
        }
        if (initialDeposit < MinimumDeposit)
        {
            MinimumDepositRequired MDR = new MinimumDepositRequired(MinimumDeposit);
            throw MDR;
        }
        CustomerAccounts.addNewCheckkingAccount(initialDeposit);
        AccountIndex = AccountIndex +1;
         
     }
    
      public void addNewSavingAccount(float initialDeposit) throws CustomerAccountsLimit, MinimumDepositRequired
      {
        /**
        * This method creates and adds a new saving account for the customer. 
        * If the initial deposit is less than $100, an exception should be thrown and the account should not be created. 
        * Use an instance of Exception class to throw an exception.
        */
        
        if (AccountIndex == MaxCustomerAccounts)
        {
            CustomerAccountsLimit CAL = new CustomerAccountsLimit(FirstName, LastName, MaxCustomerAccounts);
            throw CAL;
        }
        if (initialDeposit < MinimumDeposit)
        {
            MinimumDepositRequired MDR = new MinimumDepositRequired(MinimumDeposit);
            throw MDR;
        }
        
        CustomerAccounts.addNewSavingAccount(initialDeposit);
        AccountIndex = AccountIndex +1;
      }
      
      public void printAccounts()
      {
          System.out.println("Account Info for " + LastName + ", " + FirstName + ":");
          
          CustomerAccounts.printAllAccounts();
          /**
           * This methods prints the customer account information in the following format:

                Account Info for <Last name>, <First name>:

                Account 1: <Account Type> , <Account Number>, <Balance>

                Account 2: <Account Type> , <Account Number>, <Balance>
           */
      }
}
