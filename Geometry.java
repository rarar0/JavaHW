import java.util.Scanner;

/**
    This program makes use of  static methods
*/

public class Geometry
{
    public static void main(String[] args)
    {
        int choice;       // The user's choice
        double value = 0; // The method's return value
		char letter;      // The user's Y or N decision
		double radius;    // The radius of the circle
		double length;    // The length of the rectangle
		double width;     // The width of the rectangle
		double height;    // The height of the triangle
		double base;      // The base of the triangle
		double side1;     // The first side of the triangle
		double side2;     // The second side of the triangle
		double side3;     // The third side of the triangle

		// Create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);

		// The do loop allows the menu to be displayed first
		do
		{
			// TASK #1 Call the printMenu method
            printMenu();
			choice = keyboard.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter the radius of " +
                                       "the circle: ");
                    radius = keyboard.nextDouble();

                    // TASK #3 Call the circleArea method and
                    // store the result in the value variable
                    
                    value = circleArea(radius);
                    System.out.println("The area of the " +
                                         "circle is " + value);
                    break;
                case 2:
                    System.out.print("Enter the length of " +
                                       "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of " +
                                       "the rectangle: ");
                    width = keyboard.nextDouble();

                    // TASK #3 Call the rectangleArea method and
                    // store the result in the value variable
                    
                    value = rectangleArea(length, width);


                    System.out.println("The area of the " +
                                         "rectangle is " + value);
                    break;
                case 3:
                    System.out.print("Enter the height of " +
                                       "the triangle: ");
                    height = keyboard.nextDouble();
                    System.out.print("Enter the base of " +
                                       "the triangle: ");
                    base = keyboard.nextDouble();

                    // TASK #3 Call the triangleArea method and
                    // store the result in the value variable
                    
                    value = triangleArea(height, base);

                    System.out.println("The area of the " +
                                         "triangle is " + value);
                    break;
                case 4:
                    System.out.print("Enter the radius of " +
                                       "the circle: ");
                    radius = keyboard.nextDouble();

                    // TASK #3 Call the circumference method and
                    // store the result in the value variable
                    value = circleCircumference(radius);

                    System.out.println("The circumference " +
                                         "of the circle is " +
                                          value);
                    break;
                case 5:
                    System.out.print("Enter the length of " +
                                       "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of " +
                                       "the rectangle: ");
                    width = keyboard.nextDouble();

                    // TASK #3 Call the perimeter method and
                    // store the result in the value variable
                    value = rectanglePerimeter(length, width);

                    System.out.println("The perimeter of " +
                                         "the rectangle is " +
                                          value);
                    break;
                case 6:
                    System.out.print("Enter the length of " +
                                       "side 1 of the " +
                                       "triangle: ");
                    side1 = keyboard.nextDouble();
                    System.out.print("Enter the length of " +
                                       "side 2 of the " +
                                       "triangle: ");
                    side2 = keyboard.nextDouble();
                    System.out.print("Enter the length of " +
                                       "side 3 of the " +
                                       "triangle: ");
                    side3 = keyboard.nextDouble();

                    // TASK #3 Call the perimeter method and
                    // store the result in the value variable
                    value = trianglePerimeter(side1, side2, side3);

                    System.out.println("The perimeter of " +
                                         "the triangle is " +
                                          value);
                    break;
                default:
                    System.out.println("You did not enter " +
                                         "a valid choice.");
            }
            keyboard.nextLine(); // Consume the new line

            System.out.println("Do you want to exit " +
                                 "the program (Y/N)?: ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);

        } while(letter != 'Y' && letter != 'y');
    }

     // TASK #1 Create the printMenu method here
     public static void printMenu()
     {
         System.out.println("This is a geometry"
                            +"calculator");
         System.out.println("Choose what you "
                            +"would like to calculate");
         System.out.println("1.  Find the area "
                            +"of a circle");
         System.out.println("2.  Find the area "
                            +"of a rectangle");
         System.out.println("3.  Find the area "
                            +"of a triangle");
         System.out.println("4.  Find the "
                            +"circumference of a circle");
         System.out.println("5.  Find the "
                            +"perimeter of a rectangle");
         System.out.println("6.  Find the "
                            +"perimeter of a triangle");
         System.out.println("Enter the number "
                            +"of your choice:");
     }
     // TASK #2 Create the value-returning methods here
     /**
     The circleArea Method takes in the radius of the circle and returns the area using the formula A =πr^2.
     @param radius The radius of a circle given from case 1
     @return The area of a circle, πr^2, which is passed to value
     */
     public static double circleArea(double radius)
     {
         double area;
         area =  Math.PI * Math.pow(radius, 2);
         return area;
     }
     /**
     The rectangleArea method takes in the length and width of the rectangle and returns the area using the formula A = lw.
     @param length The side length of a recrangle given from case 2
     @param width The side width of a rectangle given from case 2
     @return The area of a rectangle given side length and width, passed to value
     */
     public static double rectangleArea(double length, double width)
     {
         double area;
         area = length * width;
         return area;
     }
     /**
     triangleArea takes in the base and height of the triangle and returns the area using the formula A = ½bh.
     @param base The base length of a triangle given from case 3
     @param height The height length of a triangle given from case 3
     @return The area of a triangle, which is 1/2 * B*H. Passed to value
     */
     public static double triangleArea(double base, double height)
     {
         double area;
         area = ((base * height) / 2.0);
         return area;
     }
     /**
     circleCircumference takes in the radius of the circle and returns the circumference using the formula C = 2πr.
     @param radius The radius of a circle, given from case 4
     @return The circumference of a circle, 2πr. Passed to value
     */
     public static double circleCircumference(double radius)
     {
         double circumference;
         circumference = Math.PI * radius * 2.0;
         return circumference;
     }
     /**
     rectanglePerimeter takes in the length  and  the  width  of  the  rectangle  and  returns  the  perimeter  of  the  rectangle using the formula P = 2l+2w.
     @param length the length of a rectangle, given from case 5
     @param width The width of a rectangle, given from case 5
     @return The perimeter of a rectangle, where P = 2l+2w. Passed to value
     */
     public static double rectanglePerimeter(double length, double width)
     {
         double perimeter;
         perimeter = (2 * length) + (2 * width);
         return perimeter;
     }
     /**
     trianglePerimeter takes in the lengths of the three sides of the triangle and returns the perimeter of the triangle which is calculated by adding up the length of three sides.
     @param side1 The first of three sides of a triangle. Given from case 6
     @param side2 The second of three sides of a triangle. Given from case 6
     @param side3 The third of three sides of a triangle. Given from case 6
     @return The Perimeter of a triangle, given three side lengths. Passed to value.
     */
     public static double trianglePerimeter(double side1, double side2, double side3)
     {
         double perimeter;
         perimeter = side1 + side2 + side3;
         return perimeter;
     }
}    
