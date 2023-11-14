/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

/**
 *
 * @author kelly
 */
public class CustomerAccountsLimit extends Exception {
    String FirstName;
    String LastName;
    int MaxCustomerAccounts;
    
    CustomerAccountsLimit(String FirstName, String LastName, int MaxCustomerAccounts)
    {
        super();
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.MaxCustomerAccounts = MaxCustomerAccounts;
    }
    
    @Override
    public String getMessage()
    {
        return "Customer " + FirstName + " " + LastName + " has reached the maixmum allowable limit of Accounts (" + MaxCustomerAccounts + ")";
    }
}
