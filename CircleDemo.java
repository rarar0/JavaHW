import java.util.Scanner;
public class CircleDemo
{
    public static void main(String[] args)
    {
        String input;
        double value;
        System.out.printf("Enter the radius"+
                        "of a circle");
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextLine();
        value = Double.parseDouble(input);
        Circle radius = new Circle(0);

        radius.setRadius(value);
        System.out.printf("Area: " + radius.getArea()
        + "\n Diameter: " + radius.getDiameter() +
        "\nCircumference: " + radius.getCircumference());
        System.exit(0);
    }
}
