/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HungrySquirrel;

/**
 *
 * @author kelly
 */
public class Squirrel extends Entity implements Moveable {
    
    int pointsCollected;
    int totalNutsEaten;
    
    
    Squirrel ()
    {
        super();
    }
    
    
    // Update method to prompt user for initial location start
    @Override
    public void create(int startingRow, int startingColumn)
    {
        symbol = "@";
        this.row = startingRow;
        this.column = startingColumn;
        
    }
    
    public void move(char direction)    // 's' for left, 'f' for right, 'd' for down, and 'e' for up. 
    {
        Entity treat = null;
        int newRow;
        int newCol;
          
        switch (Character.toLowerCase(direction)) {
        // if moving up, row value should decrease by 1 int value (if available)
            case 'e':
                newRow = this.row-1;
                if (Maze.available(newRow, column))
                {
                    treat = Maze.moveEntityElement(row, column, newRow, column);
                }
                //System.out.println(Maze.available(newRow, column));
                break;
        // if moving down, row value should increase by 1 int value (if available)
            case 'd':
                newRow = this.row+1;
                if (Maze.available(newRow, column))
                {
                    treat = Maze.moveEntityElement(row, column, newRow, column);
                }
                //System.out.println(Maze.available(newRow, column));
                break;
        // if moving left, column value should decrease by 1 int value (if available)
            case 's':
                newCol = this.column-1;
                if (Maze.available(row, newCol))
                {
                    treat = Maze.moveEntityElement(row, column, row, newCol);
                }
                //System.out.println(Maze.available(row, newCol));
                break;
        // if moving right, column value should increase by 1 int value (if available)
            case 'f':
                newCol = this.column+1;
                if (Maze.available(row, newCol))
                {
                    treat = Maze.moveEntityElement(row, column, row, newCol);
                }
                //System.out.println(Maze.available(row, newCol));
                break;
        }
        
        if (treat == null)
        {
            //squirrel finds nothing
        }
        else if ("P".equals(treat.getSymbol()))
        {   
            //squirrel finds a peanut
            pointsCollected = pointsCollected + treat.getNutrition();
            totalNutsEaten = totalNutsEaten + 1;
            
        }
        
        else if ("A".equals(treat.getSymbol()))
        {
            pointsCollected = pointsCollected + treat.getNutrition();
            totalNutsEaten = totalNutsEaten + 1;
        }
        
        else if ("C".equals(treat.getSymbol()))
        {
            pointsCollected = treat.getNutrition();
        }
    }
    
    public int getPoints()
    {
        return pointsCollected;
    }
    
    public int getNuts()
    {
        return totalNutsEaten;
    }
}
