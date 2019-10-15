import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   
public static void main(String[] args) throws IOException
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference
      ArrayList<Double> values = new ArrayList<>();

      Scanner keyboard = new Scanner (System.in);
      String filename;  

      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();
      keyboard.close();
      
      FileReader File = new FileReader(filename); // Create a FileReader object passing it the filename
      BufferedReader readFile = new BufferedReader(File); // Create a BufferedReader object passing FileReader object
      line = readFile.readLine(); // Perform a priming read to read the first line of the file
      while(true) // Loop until you are at the end of the file
      {
    	  line = readFile.readLine(); // Read a new line from the file
    	  if(line == null)
    		  break;
    	  else{
    		  values.add(Double.parseDouble(line)); // Convert the line to a double value and add the value to sum
    		 sum += Double.valueOf(line);
        	 count += 1; // Increment the counter
    	  }	
      }
      readFile.close(); 
      System.out.println(count); // Store the calculated mean
      mean = sum / count;
      
      FileReader File_read = new FileReader(filename); // Create a FileReader object passing it the filename
      BufferedReader read_File = new BufferedReader(File_read); // Create a BufferedReader object passing FileReader
      sum = 0; count = 0;
      line = read_File.readLine(); // Perform a priming read to read the first line of the file
      while(true) 
      {
    	  line = read_File.readLine(); // Loop until you are at the end of the file
    	  if(line == null)
    		  break;
    	  else
          {
    		  difference = (Double.valueOf(line) - mean); // Convert the line to a double value and add the value to the sum
    		  sum += Math.pow(difference, 2);
    		  count += 1;  // Increment the counter
    	  }
      }
      read_File.close(); // Close the input file
      stdDev = Math.sqrt(sum / count - 1); // Store the calculated standard deviation
      // ADD LINES FOR TASK #3 HERE
      FileWriter write = new FileWriter("Result.txt"); // Create a FileWriter object using "Results.txt"
      PrintWriter output = new PrintWriter(write); // Create a PrintWriter object passing the FileWriter object
      output.printf("Mean of %s = %.3f.\n\n", values.toString(), mean); // Print the results to the output file
      output.printf("Standard Deviation of %s  = %.3f.",values.toString(), stdDev); // Print the results to the output file
      output.close(); // Close the output file
   }
}
