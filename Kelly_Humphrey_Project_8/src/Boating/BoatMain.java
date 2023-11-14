/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boating;

//import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kelly
 */
public class BoatMain {
    
    
    //String outputFileName = console.next();  use for input
    
    public static void main(String[] args) throws FileNotFoundException, CommandFormatInvalid, NameDoesNotExist, InvalidCommand, PowerNotOn
    {
       try
       {
           BoatArray Courtney = new BoatArray();
           Courtney.poppulateBoatArray();
           
           
           System.out.println("Enter a valid boat name and a valid command. Input is case sensitive and should be comma separated. Enter 'quit' to end program.");
           Scanner console = new Scanner(System.in);
           
           while(console.hasNextLine())
           {
               String UserInput = console.nextLine();
               if (UserInput.equalsIgnoreCase("quit"))
               {
                   break;
               }
               
               String[] SplitInput = UserInput.split(",");
               if(SplitInput.length != 2)
               {
               CommandFormatInvalid CFI = new CommandFormatInvalid();
               throw CFI;
               }
               
               String UserInput_BoatName = SplitInput[0].trim();
               String UserInput_Command = SplitInput[1].trim();
               
               Courtney.UserInput(UserInput_BoatName, UserInput_Command);
           }   
       }
       catch(FileNotFoundException | CommandFormatInvalid | NameDoesNotExist | InvalidCommand |PowerNotOn e)
       {
           System.out.println("Excelption: " + e.getMessage());
       }

    }
}
