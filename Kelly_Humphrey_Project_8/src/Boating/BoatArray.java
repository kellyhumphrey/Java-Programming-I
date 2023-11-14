/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boating;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kelly
 */
public class BoatArray {
    
    static int ListIndex = 0;
    int maxBoats = 100;
    String[] BoatNames;
    Boat[] BoatArray;
    String[] validCommands = {"power on", "power off", "speed up", "slow down", "turn left", "turn right"};
    
    BoatArray() throws FileNotFoundException
    {
        BoatNames = new String[maxBoats];
        BoatArray = new Boat[maxBoats];
        
    } 
    
    public void poppulateBoatArray() throws FileNotFoundException
    {
        String inputFileName = "boats.txt";
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        
        
        while (in.hasNextLine())
        {
            String value = in.nextLine();
            BoatNames[ListIndex] = value;
            BoatArray[ListIndex] = new Boat(value);
            
            ListIndex++;
        }
        
        in.close();
    }
    
    public void UserInput(String UserInput_BoatName, String UserInput_Command) throws NameDoesNotExist, InvalidCommand, PowerNotOn
    {
        if (Arrays.asList(BoatNames).indexOf(UserInput_BoatName) == -1)
        {
            NameDoesNotExist NDNE = new NameDoesNotExist(UserInput_BoatName);
            throw NDNE;
        }
        
        if(Arrays.asList(validCommands).indexOf(UserInput_Command) == -1)
        {
            InvalidCommand IC = new InvalidCommand();
            throw IC;
        }
        
        CommandProcessing(UserInput_BoatName, UserInput_Command);
    }
    
    public void CommandProcessing(String UserInput_BoatName, String UserInput_Command) throws PowerNotOn
    {
        try
        {
            
            int NameIndex = Arrays.asList(BoatNames).indexOf(UserInput_BoatName);
            switch (UserInput_Command)
            {
                case "power on":
                    BoatArray[NameIndex].powerOn();
                    break;
                case "power off":
                    BoatArray[NameIndex].powerOff();
                    break;
                case "speed up":
                    BoatArray[NameIndex].speedUp();
                    break;
                case "slow down":
                    BoatArray[NameIndex].slowDown();
                    break;
                case "turn left":
                    BoatArray[NameIndex].turnLeft();
                    break;
                case "turn right":
                    BoatArray[NameIndex].turnRight();
                    break;

            }
        }
        catch(PowerNotOn e)
        {
            PowerNotOn PNO = new PowerNotOn(UserInput_BoatName);
            throw PNO;
        }
        
        
        
    }
}