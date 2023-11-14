/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

import java.util.Arrays;

/**
 *
 * @author kelly
 */


public class BankDatabase {
    
    static int DatabaseIndex = 0;
    BankAccount[] DatabaseAccounts = new BankAccount[100];     
    
    BankDatabase ()
    {
        
         System.out.println(DatabaseIndex);
    }
    
    void addNewCheckkingAccount(float deposit)
    {
        DatabaseAccounts[DatabaseIndex] = new CheckingAccount(deposit);
        DatabaseIndex++;
    }
    
    void addNewSavingAccount(float deposit)
    {
        DatabaseAccounts[DatabaseIndex] = new SavingAccount(deposit);
        DatabaseIndex++;
    }
    
    void printAllAccounts()
    {
        
        Arrays.sort(DatabaseAccounts, 0, 3);
        for (BankAccount DatabaseAccount : DatabaseAccounts) 
        {
            if (DatabaseAccount != null)
            {
                DatabaseAccount.printDetails();
            }
        }
    }
    
    void applyInterest()
    {
        for (BankAccount DatabaseAccount : DatabaseAccounts) {
            if (DatabaseAccount != null)
            {
                DatabaseAccount.applyInterest();
            }
        }
    }
    
}
