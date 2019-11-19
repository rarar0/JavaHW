import java.util.*;
/**
The average class prompts a user to enter 5 
scores, the program then takes the mean of those
5 scores, returns the average and the scores in 
highest to lowest order.

*/
public class Average
{
    private int[] data = new int[5]; // Data array
    private double mean; // Average of scores
    /**
    The Average constructor method uses a for loop
    to get user input and store the input in the data
    array.
    
    The mean is then calculated and the data is sorted.
    */
    public Average()
    {
        Scanner keyboard = new Scanner(System.in);
        int input;
        for (int inc = 0; inc <= 4; inc++)
        {
            System.out.println("Enter score "+ (inc + 1) +":");
            input = keyboard.nextInt();
            data[inc] = input;
        }
        calculateMean();
        selectionSort();
    }
    /**
    The calculateMean method takes a total of the scores
    and divides that total by the length of the data
    */
    public void calculateMean()
    {
        double total = 0.0;
        for (int i = 0; i <=4; i++)
            total += data[i];
        mean = total / data.length;
    }
    /**
    The toString method returns a string containing 
    the scores after sort, and the mean.
    
    @return A string containing scores and the avg.
    */
    public String toString()
    {
        return "Scores: "+data[0]+", "+ data[1]+", "+
               data[2]+", "+data[3]+", "+data[4]+", "+
               " Average = " + mean;
    }
    /**
    The selectionSort method takes the data in the data
    array and sorts it from highest score to lowest
    */
    
    public void selectionSort()
    {
        int n = data.length;

    for(int i = 0; i < n-1; i++)
    {
        int min_idx = i;
        for(int j = i+1; j < n; j++)
            if(data[j] >= data[min_idx])
                min_idx = j;

        int temp = data[min_idx];
        data[min_idx] = data[i];
        data[i] = temp;
    }
    }
}
