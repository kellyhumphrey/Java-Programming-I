/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boating;

/**
 *
 * @author kelly
 */
public class NameDoesNotExist extends Exception {
    String name;
    
    NameDoesNotExist(String name)
    {
        this.name = name;
    }
    
    
    @Override
    public String getMessage()
    {
        return "The boat name '" + name + "' does not exist in file. Please confirm the list of accepted names and try again.";
    }
}
