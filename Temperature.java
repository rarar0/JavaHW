public class Temperature
{
    private double fahrenheit;
    
    public Temperature (double ftemp)
    {
        fahrenheit = ftemp;
    }
    public void setFahrenheit(double ftemp)
    {
        fahrenheit = ftemp;
    }
    public double getFahrenheit()
    {
        return fahrenheit;
    }
    public double celsius()
    {
        return (5.0/9.0) * (fahrenheit - 32);
    }
    public double kelvin()
    {
        return (5.0/9.0) * (fahrenheit - 32) + 273;
    }
    
}
