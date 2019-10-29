import java.util.Scanner;

/**
   This program calls the Die class and 
   simulates the rolling of two 6 sided die.
   The user faces a computer player. Closest to
   21 without going over wins.
*/

public class AGameOfTwentyOne
{
   	public static void main(String[] args)
    {
        int computerPoints = 0;
        int userPoints = 0;
        while(rollDice())
        {
            computerPoints += getDiceValue();
            userPoints += getDiceValue();
        
            if(!underLimit(computerPoints)||!underLimit(userPoints))
            {
                break;
            }
            System.out.println("User's points: "+ userPoints);
        }
        if (userPoints == 0 && computerPoints == 0)
        {
            System.out.println("The game ended because you "+
            "didn't play atleast once");
        }
        else
        {
            displayResults(computerPoints,userPoints);
        }
    }
   
    /**
      The getDiceValue method simulates the rolling 
      of a pair of dice.
      @return The sum of the value of the dice.
    */ 
   
    public static int getDiceValue()
    {
        Die dieRoll = new Die();
        dieRoll.roll();
        int firstRoll = dieRoll.getValue();
        dieRoll.roll();
        int secondRoll = dieRoll.getValue();
        return firstRoll + secondRoll;
    }
    /**
        The rollDice method asks the user to roll
        the dice, accepting keyboard input as the
        answer.
        @return true if the user wants to roll the 
        dice, or false otherwise.
    */ 
    public static boolean rollDice()
    {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Roll the dice? (y/n) : ");
        String letter = Keyboard.nextLine();
        char input = letter.charAt(0);
        if(isValid(input))
        {
            if(input == 'y' || input == 'Y')
            {
               	return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            System.out.println("Please try again.");
            return rollDice();
        }
    }
    /**
        The underLimit method determines if the
        points are under the limit of 21.
        @return true if points are less than 21,
        or false otherwise.
    */
    public static boolean underLimit(int value)
    {
        if(value > 21)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    /**
        The isValid method validates the user input.
        @return true if the input is valid, or
        false otherwise.
    */
    public static boolean isValid(char letter)
    {
        if(letter == 'y' || letter == 'Y'|| letter == 'n' || letter == 'N')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
        The displayResults method determines the results
        of the game and displays them.
    */
    public static void displayResults(int computer, int user)
    {
        if(user > computer && underLimit(user))
        {
            System.out.println("User wins!");
        }
        else if(underLimit(user) && !underLimit(computer))
        {
            System.out.println("User wins!");
        }
        else if (user == 21 && computer != 21)
        {
            System.out.println("User wins!");
        }
        else if(user == computer && underLimit(user) && underLimit(computer))
        {
            System.out.println("Computer wins due to tie!");
        }
        else if(!underLimit(user) && !underLimit(computer))
        {
            System.out.println("Both players bust!");
        }
        else
        {
            System.out.println("The computer won!");
        }
        System.out.println("User's Points: "+ user);
        System.out.println("Computer's Points: "+ computer);
   }
}
