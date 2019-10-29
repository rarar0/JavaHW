public class Circle
{
    double radius;
    public Circle(double r)
        {
        radius = r;
        }
    public Circle()
    {
        radius = 0.0;
    }
    public void setRadius(double r)
    {
       radius = r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getDiameter()
    {
        return radius * 2.0;
    }
    public double getCircumference()
    {
        return Math.PI * radius * 2.0;
    }
}
    
