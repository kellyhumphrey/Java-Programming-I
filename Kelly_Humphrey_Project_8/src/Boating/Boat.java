/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boating;

/**
 *
 * @author kelly
 */
public class Boat {
    String name;
    int speed;
    int angle;
    boolean power;
    int maximumSpeed = 50;
    int speedIncrement = 2;
    
    
    public Boat (String name)
            {
                this.name = name;
                speed = 0;
                angle = 0;
                power = false;
                
            }
    
    public void powerOn()
    {
        power = true;
        System.out.println(name + " is pointing in the direction of " + angle + " deg.");
    }
    
    public void powerOff()
    {
        power = false;
        speed = 0;
        System.out.println(name + " is powered off.");
    }
    
    public void speedUp() throws PowerNotOn
    {
        if (power == false)
        {
            PowerNotOn PNO = new PowerNotOn(name);
            throw PNO;
        }
        if (speed < maximumSpeed-speedIncrement)
        {
            speed = speed + speedIncrement;
            System.out.println(name + " is moving at in " + angle + " deg angle at the speed of " + speed + "mph.");
        }
        
        else
        {
            System.out.println(name + " is already moving at a maximum speed of " + maximumSpeed + "mph and angle of " + angle + " deg.");
        }
        
    }
    
    public void slowDown() throws PowerNotOn
    {
        if (power == false)
        {
            PowerNotOn PNO = new PowerNotOn(name);
            throw PNO;
        }
        
        if (speed >= 0 + speedIncrement)
        {
            speed = speed - speedIncrement;
            System.out.println(name + " is moving in " + angle + " deg angle at a speed of " + speed + "mph.");
        }
        
        else
        {
            System.out.println(name + "is not moving (angle is " + angle + " deg).");
        }
        
    }
    
    public void turnRight() throws PowerNotOn
    {
        if (power == false)
        {
            PowerNotOn PNO = new PowerNotOn(name);
            throw PNO;
        }
        
        if (angle == 355)
        {
            angle = 0;
            System.out.println(name + " is in " + angle + " deg angle.");
        }
        
        else
        {
            angle = angle + 5;
            System.out.println(name + " is in " + angle + " deg angle.");
        }
        
    }
    
    public void turnLeft() throws PowerNotOn
    {
        if (power == false)
        {
            PowerNotOn PNO = new PowerNotOn(name);
            throw PNO;
        }
        
        if (angle == 0)
        {
            angle = 355;
            System.out.println(name + " is in " + angle + " deg angle.");
        }
        
        else
        {
            angle = angle - 5;
            System.out.println(name + " is in " + angle + " deg angle.");
        }
        
    }
}
