/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boating;

/**
 *
 * @author kelly
 */
public class CommandFormatInvalid extends Exception {
    
    CommandFormatInvalid()
    {
        
    }
    
    
    @Override
    public String getMessage()
    {
        return "Command format entered is invalid. Format should be: (boat_name, command).";
    }
}
