import java.util.Scanner;

public class TempDemo
{
    public static void main(String [] args)
    {
        double input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input a fahrenheit temperature"
        +" for conversion : ");
        input = keyboard.nextDouble();
        Temperature temp = new Temperature(input);
        temp.setFahrenheit(input);
        System.out.println(input+"Fahrenheit converted to :");
        System.out.println("Celsius : "+temp.celsius());
        System.out.println("Kelvin : "+temp.kelvin());
    }
}
