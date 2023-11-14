/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boating;

/**
 *
 * @author kelly
 */
public class PowerNotOn extends Exception {
    
    String name;
    
    PowerNotOn(String name)
    {
        this.name = name;
    }
    
    
    @Override
    public String getMessage()
    {
        return "Cannot perform action, " + name + " power is not on.";
    }
}
