public class GradeBook
{
    final private int NUM_STUDENTS = 5;
    final private int NUM_TESTS = 4;
    private String[] names = new String[NUM_STUDENTS];
    private char[] grades = new char[NUM_TESTS];
    private double[] scores1 = new double[NUM_TESTS];
    private double[] scores2 = new double[NUM_TESTS];
    private double[] scores3 = new double[NUM_TESTS];
    private double[] scores4 = new double[NUM_TESTS];
    private double[] scores5 = new double[NUM_TESTS];
    
    public void setName(int studentNum, String name)
    {
        names[studentNum] = name;
    }
    public void setScores(int studentNum, double[] scores)
    {
        if (studentNum == 1)
            copyArray(scores1, scores);
        else if (studentNum == 2)
            copyArray(scores2, scores);
        else if (studentNum == 3)
            copyArray(scores3, scores);
        else if (studentNum == 4)
            copyArray(scores4, scores);
        else if (studentNum == 5)
            copyArray(scores5, scores);
    }
    public String getName(int studentNum)
    {
        return names[studentNum];
    }
    public double getAverage(int studentNum)
    {
        
    }
    public char getLetterGrade(int studentNum)
    {
        return grades[studentNum];
    }
    private void copyArray(double[] to, double[] from)
    {
        for (int i = 0; i <to.length; i++)
        {
            to[i] = from[i];
        }
    }
    private double calcAverage(double[] scores)
    {
        double total = 0.0, average, lowest;
        for (int i=0; i < scores.length; i++)
        {
            total += scores[i];
        }
        return total / scores.length;
    }
    private void assignGrade(int studentNum)
    {
        if (studentNum == 1)
            determineGrade();
        else if (studentNum == 2)
            
        else if (studentNum == 3)
            
        else if (studentNum == 4)
            
        else if (studentNum == 5)
            
    }
    private char determineGrade(double average)
    {
        
    }
}
