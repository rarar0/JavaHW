import java.util.*;
/**
AverageDriver class creates an Average object
and then calls the printString method
*/
public class AverageDriver
{
    public static void main(String[] args)
    {
        Average avg = new Average();
        printString(avg);
    }
    /**
    The printString method calls the Average
    object and the toString method, and prints
    */
    public static void printString(Average avg)
        {
            System.out.println(avg.toString());

        }
}
