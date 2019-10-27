public class Circle
{
    double radius;
    public Circle(double r)
        {
        radius = r;
        }
    public void setRadius(double r)
    {
       radius = r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    public double diameter()
    {
        return radius * 2.0;
    }
    public double circumference()
    {
        return Math.PI * radius * 2.0;
    }
}
    
