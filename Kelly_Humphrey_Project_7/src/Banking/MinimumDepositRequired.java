/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banking;

/**
 *
 * @author kelly
 */
public class MinimumDepositRequired extends Exception {
    
    float MinimumDeposit;
    
    MinimumDepositRequired (float MinimumDeposit)
    {
        super();
        this.MinimumDeposit = MinimumDeposit;
    }
    
    @Override
    public String getMessage()
    {
        return "Unable to create account. Minimum deposit is $" + MinimumDeposit;
    }
}
