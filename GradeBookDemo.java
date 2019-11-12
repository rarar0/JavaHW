import java.io.*;
import java.util.*;

/**
Method GradeBookDemo takes input from a file
StudentInfo.txt and passes it to the GradeBook method to copy the data
to 5 different arrays, and outputs an average grade letter
*/
public class GradeBookDemo
{
    public static void main(String[] args) throws IOException
    {
        // Create a GradeBook object
        GradeBook gb = new GradeBook();
        // Read the data from the File
        readFromFile(gb);
        
        // Display the Student Data
        for (int i = 1; i <= 5; i++)
        {
            System.out.printf("Name: %s \t" +
                              "Average Score: %.2f \t" +
                              "Grade: %s \n", gb.getName(i),
                              gb.getAverage(i), gb.getLetterGrade(i));
        }
        
    }
    /**
    The readFromFile method reads a student name from a file,
    then reads scores from the next 4 lines.
    @param gb The GradeBook object.
    */
    public static void readFromFile(GradeBook gb)
        throws IOException
    {
        double[] studentScores = new double[4];
        String input;
        String filename = "StudentInfo.txt";
        FileReader File = new FileReader(filename); 
        BufferedReader readFile = new BufferedReader(File);

        for (int student = 1; student <= 5; student++)
        {
            input = readFile.readLine();
            gb.setName(student, input);
            for (int i = 0; i < 4 ; i++)
            {
                input = readFile.readLine();
                studentScores[i] = Double.parseDouble(input);
            }
            // call setScores
            gb.setScores(student, studentScores);            
        }
        
        readFile.close(); // Close the input file

    }
}
