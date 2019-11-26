class FuelGauge 
{

    final static int MAXIMUM_GALLONS = 15;
    private int gallons;
    /**
    FuelGauge constructor initializes gallons to 0
    */
    public FuelGauge() 
    {
        gallons = 0;
    }
    /**
    The FuelGauge constructor receives an int gallons.
    @param gallons
    */
    public FuelGauge(int gallons) 
    {
        this.gallons = gallons
    }
    /**
    getGallons returns gallons
    @return gallons is the number of gallons
    */
    public int getGallons() 
    {
        return gallons;
    }
    /**
    incrementGallons increments gallons by 1
    */
    public void incrementGallons() 
    {
       gallons++;
    }
    /**
    decrementGallons decrements gallons by 1
    */
    public void decrementGallons() 
    {
        gallons--;
    }
}
