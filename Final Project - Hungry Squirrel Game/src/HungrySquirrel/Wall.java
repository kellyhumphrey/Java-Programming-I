/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HungrySquirrel;

/**
 *
 * @author kelly
 */
public class Wall extends Entity {
    
    Wall()
    {
        super();
        symbol = "*";
    }
    
    @Override
    public void create(int startingRow, int startingColumn)
    {
        this.row = startingRow;
        this.column = startingColumn;
    }
    
    
    public void create()
    {
        
    }
        
}
