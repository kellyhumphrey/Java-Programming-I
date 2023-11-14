/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template



 */
package Banking;


public class BankMain {

    public static void main(String[] args) {       

        BankDatabase Database = new BankDatabase();
        Database.addNewCheckkingAccount(10500.0f); 
        Database.addNewCheckkingAccount(2000000.0f);
        Database.addNewSavingAccount(1000.0f);
        Database.addNewSavingAccount(30000.0f);
        Database.applyInterest();
        
        Database.printAllAccounts();
        
        
        
       
    }

}