/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HungrySquirrel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kelly
 */
public class Maze {
    static int MAX_MAZE_ROW = 20;
    static int MAX_MAZE_COLUMN = 50;
    static Entity[][] map = new Entity[20][50];
    
    private Maze() {}  //Private constructor to prevent instantiation 
    
    public static void create(String filename) throws FileNotFoundException
    {
        String inputFileName = filename;
        File inputFile = new File(inputFileName);
        Scanner input = new Scanner(inputFile);
        input.useDelimiter("");
        
        int i = 0;
        while (input.hasNextLine())
        {
            String line = input.nextLine();
            for (int j = 0 ; j < line.length() ; j++)
            {
                char c = line.charAt(j);
                if (c == '*')
                {
                    Wall element = new Wall();
                    element.create(i,j);
                    map[element.getRow()][element.getColumn()] = element;
                }
            }
            i++;
        }
    }
    
    public static void display()
    {
        for (int k = 0 ; k < MAX_MAZE_ROW ; k++)
        {
            String line = "";
            for (int j = 0 ; j < MAX_MAZE_COLUMN ; j++)
            {
                if (map[k][j] == null)
                {
                    line = line + " ";
                }
                else
                {
                    line = line + map[k][j].getSymbol();
                }
            }
            System.out.print(line + '\n');
        }
        
    }
    
    public static boolean available(int row, int col)
    {
        if (map[row][col] == null)
        {
            return true;
        }
        else
        {
            return "P".equals(map[row][col].getSymbol()) || "A".equals(map[row][col].getSymbol()) || "C".equals(map[row][col].getSymbol());
        }
    }
    
    public static boolean coordinateEmpty(int row, int col)
    {
        return (map[row][col] == null);
    }
        
    public static Entity moveEntityElement(int oldRow, int oldCol, int newRow, int newCol)
    {
        Entity oldEntity = map[newRow][newCol];
        map[newRow][newCol] = map[oldRow][oldCol];
        map[newRow][newCol].setColumn(newCol);
        map[newRow][newCol].setRow(newRow);
        map[oldRow][oldCol] = null;
        
        if (oldEntity == null)
        {
            return null;
        }
        else
        {
            return oldEntity;  //Returns existing object (oldEntity)that was replaced by new object move
        }
    }
    
    public static Entity getEntityElement(int row, int col)
    {
        return map[row][col];
    }
    
    public static void setEntityElement(int row, int col, Entity entObj)
    {
        map[row][col] = entObj;
    }
}












/*
String inputFileName = filename;
        File inputFile = new File(inputFileName);
        Scanner input = new Scanner(inputFile);
        input.useDelimiter("");
        String[][] str_2D_Array = new String[MAX_MAZE_ROW][MAX_MAZE_COLUMN];
        
        int i = 0;
        while (input.hasNextLine())
        {
            
            String line = input.nextLine();
            
            for (int j = 0 ; j < line.length() ; j++)
            {
                char c = line.charAt(j);
                if (c == '*')
                {
                    str_2D_Array[i][j] = Character.toString(c);
                    
                }
                else
                {
                    str_2D_Array[i][j] = " ";
                }
            }
            i++;
        }
        
        
        for (int k = 0 ; k < MAX_MAZE_ROW ; k++)
        {
            String line = "";
            for (int j = 0 ; j < MAX_MAZE_COLUMN ; j++)
            {
                line = line + str_2D_Array[k][j];
            }
            System.out.print(line + '\n');
        }
        
*/