/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HungrySquirrel;

import java.util.Random;

/**
 *
 * @author kelly
 */
public abstract class Nut extends Entity {
    int TOTAL_NUTS = 5;
    int NUTRITION_POINTS;
    String name;
    
    Nut()
    {
        super();
    }
    
    
    public void put()
    {
        Random rand = new Random();
        
        while (true)
        {
            int row = rand.nextInt(20);
            int col = rand.nextInt(50);
            if (Maze.coordinateEmpty(row, col))
            {
                this.row = row;
                this.column = col;
                break;
            }
        }
    }
    
    @Override
    public int getNutrition()
    {
        return NUTRITION_POINTS;
    }
    
}
