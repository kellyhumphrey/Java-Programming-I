/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HungrySquirrel;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kelly
 */
public class HungrySquirrelGame {
    
    public static void main(String[] args)
    {
        try
        {
            Squirrel squirrel = new Squirrel();
            Maze.create("Maze.txt");
            Maze.display();
            
            System.out.println("Enter a starting location for the squirrel in the format: <rowNumber>,<columnNumber>");
            Scanner setSquirrel  = new Scanner(System.in);
            
            while (setSquirrel.hasNextLine())
                    {
                        String input = setSquirrel.nextLine();
                        String[] squirrelCoord = input.split(",");
                        if (squirrelCoord.length != 2)
                        {
                            System.out.println("Sorry but that is the incorrect format. Use <rowNumber>,<columnNumber>");
                        }

                        else
                        {
                            String coordOne = squirrelCoord[0].trim();
                            String coordTwo = squirrelCoord[1].trim();
                            int squirrelRow = Integer.parseInt(coordOne);
                            int squirrelCol = Integer.parseInt(coordTwo);
                            
                            if (Maze.coordinateEmpty(squirrelRow, squirrelCol))
                            {
                                squirrel.create(squirrelRow,squirrelCol);
                                Maze.setEntityElement(squirrel.getRow(), squirrel.getColumn(), squirrel);
                                break;
                            }
                            else
                            {
                                System.out.println("The coordinates entered are not eligible for selection.");
                            }
                        }
                    }
                Random rand = new Random();
                for (int i = 0 ; i < 5 ; i++)
                {
                    if (rand.nextDouble() >= 0.5)
                    {
                        Almond nut = new Almond();
                        nut.put();
                        Maze.setEntityElement(nut.getRow(), nut.getColumn(), nut);
                    }
                    else
                    {
                        Peanut nut = new Peanut();
                        nut.put();
                        Maze.setEntityElement(nut.getRow(), nut.getColumn(), nut);
                    }
                    Cashew nut = new Cashew();
                    nut.put();
                    Maze.setEntityElement(nut.getRow(), nut.getColumn(), nut);
                }
            Scanner keyboard  = new Scanner(System.in);
            while (true)
            {
                Maze.display();
                System.out.println("Total nuts eaten:  " + squirrel.getNuts());
                System.out.println("Total nutritional points:  " + squirrel.getPoints());
                System.out.println("To move the squirrel enter one of the following commands: \n"
                + "'e' for up\n"
                + "'d' for down\n"
                + "'s' for left\n"
                + "'f' for right\n"
                + "'quit' to quit.");
                
                String input = keyboard.nextLine();
                if (input.equalsIgnoreCase("quit"))
                {
                    break;
                }
                if ("s".equals(input) || "e".equals(input) || "d".equals(input) || "f".equals(input) )
                {
                    char direction = input.charAt(0);
                    squirrel.move(direction);
                }
                if (squirrel.getPoints() == -15)
                {
                    Maze.display();
                    System.out.println("Your squirrel ate a poisonous cashew and died of dysentery.");
                    System.out.println("Total nuts eaten:  " + squirrel.getNuts());
                    System.out.println("Total nutritional points:  " + squirrel.getPoints());
                    break;
                }
                if (squirrel.getNuts() == 5)
                {
                    Maze.display();
                    System.out.println("YOU WON!!!!!");
                    System.out.println("Total nuts eaten:  " + squirrel.getNuts());
                    System.out.println("Total nutritional points:  " + squirrel.getPoints());
                    break;
                }
            }  
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File could not be found: ");
        }
        
    }
}