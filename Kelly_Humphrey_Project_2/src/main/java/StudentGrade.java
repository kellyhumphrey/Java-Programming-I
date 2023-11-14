/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kelly
 */

public class StudentGrade {
    
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 5)
        {
            int score = (int)(Math.random()*50)+50;
            char grade;
            
            if (score >=90)
            {
                grade = 'A';
            }
            else if (score >= 80 && score <= 89)
            {
                grade = 'B';
            }
            else if (score >= 70 && score <= 79)
            {
                grade = 'C';
            }
            else if (score >= 60 && score <= 69)
            {
                grade = 'D';
            }
            else 
            {
                grade = 'F';
            }
        System.out.println("Student grade is "+score+" which is "+grade);
        counter++;
        
        }
        
    }
    
}
