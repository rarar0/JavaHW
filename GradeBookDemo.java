import java.io.*;
import java.util.*;

public class GradeBookDemo
{
    public static void main(String[] args) throws IOException
    {
        String filename = "StudentInfo.txt";
        FileReader File = new FileReader(filename); 
        BufferedReader readFile = new BufferedReader(File);
        String line = readFile.readLine();      
        String[] test = new String[25];
        while (true)
        {
            line = readFile.readLine(); // Read a new line from the file
    	    if(line == null)
    		    break;
    	    else
            {
                for (int i = 0; i < test.length; i++)
                {
                    test[i] = readFile.readLine();
                }
            }
        }
        for (int i = 0; i <= 25; i++)
        {
            System.out.println(test[i]);
        }
    }
}
