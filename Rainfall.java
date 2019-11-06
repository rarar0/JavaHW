public class Rainfall
{
    private double[] rain = new double[12];
    public Rainfall(double[] r)
    {
        rain = r;
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
        return Rainfall.getTotalRainFall() / 12;
    }
    public int getHighestMonth()
    {
        double highest = rain[0];
        for (int i=1; i < rain.length; i++)
        {
            if (rain[i] > highest)
                highest = rain[i];
        }
    }
    public int getLowestMonth()
    {
        double lowest = rain[0];
        for (int i=1; i < rain.length; i++)
        {
            if (rain[i] < lowest)
                lowest = rain[i];
        }
    }
    public double getRainAt(int e)
    {
        return rain[e];
    }
}
