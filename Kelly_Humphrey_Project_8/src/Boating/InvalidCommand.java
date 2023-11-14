/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boating;

/**
 *
 * @author kelly
 */
public class InvalidCommand extends Exception {
    
    InvalidCommand()
    {
        //
    }
    
    @Override
    public String getMessage()
    {
        return "Command invalid - Valid commands are: 'power on', 'power off', 'speed up', 'slow down', 'turn left', or 'turn right'.";
    }
}