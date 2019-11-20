// Code from midterm 2
public class ArraySort
{
    public static void main(String[] args)
    {
        int[][] numbers new int[3][4] = {{23, 40, 50, 20}, {12, 60, 51, 30}, {12, 41, 51, 11}};
        int highest;
        int lowest; 
        int highCol = 0;
        int highRow = 0;
        int lowCol = 0;
        int lowRow = 0;
        
        getHighest();
        getLowest();
    }
    public static getHighest()
    {
        highest = numbers[0][0];
        for (int row = 0; row < numbers.length; row++)
        {
            for (int col = 0; col < numbers[row].length; col++)
            {
                if (highest < numbers[row][col])
                {
                    highest = numbers[row][col];
                    highRow = row;
                    highCol = col;
                }
            }
        }
        System.out.println("The highest nubmer is "+highest+" at row "+
                          highRow+" column "+ highCol);
    }
    public static getLowest()
    {
        lowest = numbers[0][0];
        for (int row = 0; row < numbers.length; row++)
        {
            for (int col = 0; col < numbers[row].length; col++)
            {
                if (lowest > numbers[row][col])
                {
                    lowest = numbers[row][col];
                    lowRow = row;
                    lowCol = col;
                }
            }
        }
        System.out.println("The lowest nubmer is "+lowest+" at row "+
                          lowRow+" column "+ lowCol);

    }
}
