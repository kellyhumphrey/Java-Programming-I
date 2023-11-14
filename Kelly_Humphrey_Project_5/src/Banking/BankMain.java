/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

/**
 *
 * @author kelly
 */
public class BankMain {
    public static void main(String[] args) {       
                
        CheckingAccount acct1 = new CheckingAccount(1000.0f);

        SavingAccount acct2 = new SavingAccount(500.0f);

        acct1.deposit(22000.0f);

        acct2.deposit(12000.0f);

        acct1.withdraw(2000.0f);

        acct2.withdraw(500.0f);

        acct1.applyInterest();

        acct2.applyInterest();

        acct1.withdraw(30000.0f);

    }
}
