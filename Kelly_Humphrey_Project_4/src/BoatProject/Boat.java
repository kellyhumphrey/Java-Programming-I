/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BoatProject;

/**
 *
 * @author kelly
 */
public class Boat 
{
    private String name;
    private Boolean salePosition;
    private float speed;
    private static float maximumSpeed = 100;
    private static float minimumSpeed = 0;
    private static float increaseSpeed = 10;
    private static float decreaseSpeed = 5; 

    public static void main(String[] args)
    {
	 Boat simpleBoat = new Boat("BlueSea");
         
         simpleBoat.goFast();   
         simpleBoat.goSlow();
         simpleBoat.whereIsTheSale();
         simpleBoat.goFast();
         simpleBoat.whereIsTheSale();
         simpleBoat.goFast();
         simpleBoat.goFast();


    }
    
    //Constructor
    public Boat(String name)
    {
            this.name = name;
            salePosition = false;
            speed = 0;
    }    
    
    //method
    public void goFast()
    {
        salePosition = true;
        
        if (speed <= maximumSpeed-increaseSpeed)
        {
           speed = speed + increaseSpeed;
           System.out.println(name+" is raising the sale at a speed of "+speed+" mph");
        }
        
        else
        {
            speed = maximumSpeed;
            System.out.println(name+" is raising the sale at a maximum speed of "+speed+" mph");
        }
        
    }
    
    //method
    public void goSlow()
    {
        salePosition = false;
        
        if (speed >= minimumSpeed + decreaseSpeed)
        {
            speed = speed - decreaseSpeed;
            System.out.println(name+" is lowering the sale at a speed of "+speed+"mph");
        }
        else 
        {
            speed = minimumSpeed;
            System.out.println(name+" is lowering the sale at a minimum speed of "+speed+"mph");
        }
        
    }
    
    //method
    public void whereIsTheSale()
    {
        if (salePosition)
        {
            System.out.println("Sale is up.");
        }
        else
        {
            System.out.println("Sale is down.");
        }
    }
    
    public void setName(String name)
    {
        this.name = name;
        System.out.println(name+" is the new name of the boat");
    }
    
    public void changeMaximumSpeed(float newMaximumSpeed)
    {
        maximumSpeed = newMaximumSpeed;
    }
    
    public void printMaximumSpeed()
    {
        System.out.println(name+"'s Maximum Speed is "+maximumSpeed);
    }
}