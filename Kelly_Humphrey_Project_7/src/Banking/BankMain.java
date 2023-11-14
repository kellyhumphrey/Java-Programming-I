/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template



 */
package Banking;


public class BankMain {

    public static void main(String[] args) {       

        Customer alin = new Customer("Alin", "Smith", "123-45-9999");
        
        try
        {
        alin.addNewCheckingAccount(1000.0f);
        alin.addNewSavingAccount(500.0f);
        alin.addNewCheckingAccount(50.0f); //This will cause an exception

        }
        catch (CustomerAccountsLimit e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (MinimumDepositRequired e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        
        alin.printAccounts();
        
        /**
            Expected output:

            Successfully created account 1111111111  with initial deposit $1000

            Successfully created account 1111111112  with initial deposit $500

            Exception: Unable to create account. Minimum deposit is $100.

            Account Info for Smith, Alin:

            Account 1: Checking, 1111111111, $1000

            Account 2: Saving, 1111111112, $500
         * 
         * 
         */
    }

}