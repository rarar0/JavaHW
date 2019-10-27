import java.util.Scanner;
public class CircleDemo
{
    public static void main(String[] args)
    {
        String input;
        double value;
        Circle radius = new Circle();
        System.out.printf("Enter the radius"+
                        "of a circle");
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextLine();
        value = Double.parseDouble(input);
        radius.setRadius(value);
        System.out.printf("Area: " + radius.getArea()
        + "\n Diameter: " + radius.getDiameter() +
        "\nCircumference: " + radius.getCircumference());
        System.exit(0);
    }
}
