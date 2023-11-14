/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HungrySquirrel;

/**
 *
 * @author kelly
 */
public abstract class Entity {
    String symbol;
    int row;
    int column;
    
    Entity()
    {
        
    }
    
    public abstract void create(int row, int col);
    
    public String getSymbol()
    {
        return symbol;
    }
    
    public int getRow()
    {
        return row;
    }
    
    public int getColumn()
    {
        return column;
    }
    
    public void setRow(int newRow)
    {
        row = newRow;
    }
    
    public void setColumn(int newCol)
    {
        column = newCol;
    }
    
    /*
    public Entity put(int newRow, int newCol)
    {
        
    }
    */

    int getNutrition()
    {
        return 0;
    }
}
