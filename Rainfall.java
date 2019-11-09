public class Rainfall
{
    private double[] rain = new double[12];
    private String[] monthNames = {"January", "February", "March", 
                                   "April", "May", "June",
      "July", "August", "September", "October", "November", "December"};

    public Rainfall(double[] r)
    {
        
    }
    public double getTotalRainFall()
    {
        int total = 0;
        for (int i=0; i < rain.length; i++)
        {
            total += rain[i];
        }
        return total;
    }
    public double getAverageRainFall()
    {
        int total = 0;
        for (int i=0; i < rain.length; i++)
        {
            total += rain[i];
        }
        return total / 12.0;
    }
    public int getHighestMonth()
    {
        double highest = rain[0];
        int highestIterator = 0;
        
        for (int i=1; i < rain.length; i++)
        {
            if (rain[i] > highest)
                highest = rain[i];
                highestIterator = i
        }
        return monthNames[highestIterator];
    }
    public int getLowestMonth()
    {
        double lowest = rain[0];
        int lowestIterator = 0;
        for (int i=1; i < rain.length; i++)
        {
            if (rain[i] < lowest)
                lowest = rain[i];
                lowestIterator = i
                
        }
        return monthNames[lowestIterator];
    }
    public double getRainAt(int e)
    {
        return rain[e];
    }
}
