import java.util.Scanner;

public class AverageRainfall
{
  public static void main(String [] args)
  {
    int years;
    int months;
    int numMonths = 0;
    double inches = 0.0;
    double average = 0.0;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the number of years:");
    years = keyboard.nextInt();
    System.out.println("Please enter rainfall, in inches, for each month.");

    for (int inYears = 1; inYears <= years ; inYears++)
    {
      for (months = 1; months <=12; months++)
      {
        System.out.println("Year " + inYears + " month " + months);
        inches += keyboard.nextDouble();
        numMonths++;
      }
    }
    average = inches / numMonths;
    System.out.println("Total number of months: " + numMonths);
    System.out.println("Total Rainfall = " + inches + " inches.");
    System.out.println("Average Monthly Rainfall: " + average + " inches");
  }
}
