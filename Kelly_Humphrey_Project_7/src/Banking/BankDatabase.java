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
    int maxAccounts;    
    BankAccount[] DatabaseAccounts;
    
    BankDatabase (int maxAccounts)
    {
        this.maxAccounts = maxAccounts;
        DatabaseAccounts = new BankAccount[maxAccounts];
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
        int index = 1;
        // Arrays.sort(DatabaseAccounts, 0, DatabaseIndex);
        for (BankAccount DatabaseAccount : DatabaseAccounts) 
        {
            if (DatabaseAccount != null)
            {
                System.out.println("Account " + index + ": " + DatabaseAccount.GetPrintDetails());
                index = index + 1;
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
