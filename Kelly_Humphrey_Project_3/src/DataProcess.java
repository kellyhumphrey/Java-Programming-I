import java.util.Scanner;

public class DataProcess 
{
    public static void main(String[] args)
    {
        //Set initial variables
        final int LENGTH = 5;
        double[] values = new double[LENGTH];
        int currentSize = 0;
        
        
        //Collect 5 input values from user
        System.out.println("Please enter integer values: ");
        Scanner in = new Scanner(System.in);
        while (currentSize < values.length)
        {
            values[currentSize] = in.nextDouble();
            currentSize++;
        }
        
        //Call to calculate the average using method 'getAverage', get largest value using method 'getLargest', get smallest valuing using method 'getSmallest'
        double AVERAGE = getAverage(values);
        double LARGEST = getLargest(values);
        double SMALLEST = getSmallest(values);
        
        //Print statement to output the results
        System.out.println("The Average is: "+AVERAGE+", the largest is: "+LARGEST+", and the smallest is: "+SMALLEST);
    }
    
    
    //method to calculate and return the average
    public static double getAverage(double[] values)
    {
        double sum = 0;
        for (int i = 0; i <values.length; i++ )
        {
            sum = values[i]+sum;
        }
        double average = sum/(values.length);
        return average;
    }
    
    //method to calculate and return the largest value
    public static double getLargest(double[] values)
    {
        if (values[0] >= values[1] && values[0] >= values[2] && values[0] >= values[3] && values[0] >= values[4])
        {
            return values[0];
        }
        else if (values[1] >= values[0] && values[1] >= values[2] && values[1] >= values[3] && values[1] >= values[4])
        {
            return values[1];
        }
        else if (values[2] >= values[0] && values[2] >= values[1] && values[2] >= values[3] && values[2] >= values[4])
        {
            return values[2];
        }
        else if (values[3] >= values[0] && values[3] >= values[1] && values[3] >= values[2] && values[3] >= values[4])
        {
            return values[3];
        }
        else
        {
            return values[4];
        }
    }
    
    //method to calculate and return the smallest value
    public static double getSmallest(double[] values)
    {
        if (values[0] <= values[1] && values[0] <= values[2] && values[0] <= values[3] && values[0] <= values[4])
        {
            return values[0];
        }
        else if (values[1] <= values[0] && values[1] <= values[2] && values[1] <= values[3] && values[1] <= values[4])
        {
            return values[1];
        }
        else if (values[2] <= values[0] && values[2] <= values[1] && values[2] <= values[3] && values[2] <= values[4])
        {
            return values[2];
        }
        else if (values[3] <= values[0] && values[3] <= values[1] && values[3] <= values[2] && values[3] <= values[4])
        {
            return values[3];
        }
        else
        {
            return values[4];
        }
    }
}

   
