import java.util.Random;  //to use the random number generator 
public class DiceSimulation
{
  public static void main(String[] args)
  {
    final int NUMBER = 10000; //the number of times to roll the dice
    Random generator = new Random();    
    int die1Value; // number of spots on the first die
    int die2Value; // number of spots on the second die
    int count = 0; // number of times the dice were rolled
    int snakeEyes = 0; // number of times snake eyes is rolled
    int twos = 0; // number of times double two is rolled
    int threes = 0; // number of times double three is rolled
    int fours = 0; // number of times double four is rolled
    int fives = 0; // number of times double five is rolled
    int sixes = 0; // number of times double six is rolled

    //TASK #1 Enter the code for your algorithm here (see lab manual):
    //see page 268 for while loop example
    
// ===== While loop =====
    while (count < NUMBER)
    {
      die1Value=generator.nextInt(6)+1;
      die2Value=generator.nextInt(6)+1;
      if (die1Value == die2Value)
      {
        if (die1Value == 1)
        { snakeEyes = snakeEyes + 1; }
        else if (die1Value == 2)
        { twos = twos + 1; }
        else if (die1Value == 3)
        { threes = threes + 1; }
        else if (die1Value == 4)
        { fours = fours + 1; }
        else if (die1Value == 5)
        { fives = fives + 1; }
        else if (die1Value == 6)
        { sixes = sixes + 1; }
      }
      count = count + 1;
    }
    System.out.println ("~~~~~~~~ While Loop ~~~~~~~~");
    System.out.println ("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
    System.out.println ("You rolled double twos " + twos + " out of " + count + " rolls.");
    System.out.println ("You rolled double threes " + threes + " out of " + count + " rolls.");
    System.out.println ("You rolled double fours " + fours + " out of " + count + " rolls.");
    System.out.println ("You rolled double fives " + fives + " out of " + count + " rolls.");
    System.out.println ("You rolled double sixes " + sixes + " out of " + count + " rolls.");

// ===== Do-while loop =====
    count = 0; // reset count int
    snakeEyes = 0; // reset number of times snake eyes is rolled
    twos = 0; // reset number of times double two is rolled
    threes = 0; // reset number of times double three is rolled
    fours = 0; // reset number of times double four is rolled
    fives = 0; // reset number of times double five is rolled
    sixes = 0; // reset number of times double six is rolled
    do
    {
      die1Value=generator.nextInt(6)+1;
      die2Value=generator.nextInt(6)+1;
      if (die1Value == die2Value)
      {
        if (die1Value == 1)
        { snakeEyes = snakeEyes + 1; }
        else if (die1Value == 2)
        { twos = twos + 1; }
        else if (die1Value == 3)
        { threes = threes + 1; }
        else if (die1Value == 4)
        { fours = fours + 1; }
        else if (die1Value == 5)
        { fives = fives + 1; }
        else if (die1Value == 6)
        { sixes = sixes + 1; }
      }
      count = count + 1;
    }
    while (count < NUMBER);
    System.out.println ("~~~~~~~~ Do-While Loop ~~~~~~~~");
    System.out.println ("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
    System.out.println ("You rolled double twos " + twos + " out of " + count + " rolls.");
    System.out.println ("You rolled double threes " + threes + " out of " + count + " rolls.");
    System.out.println ("You rolled double fours " + fours + " out of " + count + " rolls.");
    System.out.println ("You rolled double fives " + fives + " out of " + count + " rolls.");
    System.out.println ("You rolled double sixes " + sixes + " out of " + count + " rolls.");
       // ===== For loop =====
    count = 0; //reset count int
    snakeEyes = 0; // reset number of times snake eyes is rolled
    twos = 0; // reset number of times double two is rolled
    threes = 0; // reset number of times double three is rolled
    fours = 0; // reset number of times double four is rolled
    fives = 0; // reset number of times double five is rolled
    sixes = 0; // reset number of times double six is rolled
    for (count=0; count<NUMBER; count++)
    {
      die1Value=generator.nextInt(6)+1;
      die2Value=generator.nextInt(6)+1;
      if (die1Value == die2Value)
      {
        if (die1Value == 1)
        { snakeEyes = snakeEyes + 1; }
        else if (die1Value == 2)
        { twos = twos + 1; }
        else if (die1Value == 3)
        { threes = threes + 1; }
        else if (die1Value == 4)
        { fours = fours + 1; }
        else if (die1Value == 5)
        { fives = fives + 1; }
        else if (die1Value == 6)
        { sixes = sixes + 1; }
      }
    }
    System.out.println ("~~~~~~~~ For Loop ~~~~~~~~");
    System.out.println ("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
    System.out.println ("You rolled double twos " + twos + " out of " + count + " rolls.");
    System.out.println ("You rolled double threes " + threes + " out of " + count + " rolls.");
    System.out.println ("You rolled double fours " + fours + " out of " + count + " rolls.");
    System.out.println ("You rolled double fives " + fives + " out of " + count + " rolls.");
    System.out.println ("You rolled double sixes " + sixes + " out of " + count + " rolls.");
  }
}
