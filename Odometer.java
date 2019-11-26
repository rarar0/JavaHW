class Odometer 
{

    // Constant for the maximum mileage
    public final int MAXIMUM_MILEAGE = 999999;
    // Constant for the miles-per-gallon
    public final int MPG = 24;
    private int mileage;
    private int setPoint;
    // Field to reference a FuelGauge object
    private FuelGauge fuelGauge;
    /**
    Odometer constructor
    @param mileage sets initial mileage.
    @param fuelGauge references FuelGauge object.
    */
    public Odometer(int mileage, FuelGauge fuelGauge) 
    {
        this.setPoint = mileage;
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    /**
    The getMileage method
    @return The mileage.
    */
    public int getMileage() 
    {
        return mileage;
    }

    /**
    The incrementMileage method increments the mileage and
    checks MPG. If mileage is greater than max, it resets to 0.
    */
    public void incrementMileage() 
    {

        if (mileage < MAXIMUM_MILEAGE) 
        {
            mileage++;
        } 
        else 
        {
            mileage = 0;
        }
        // calls fuelGauge to decrementGallons every time a gallons worth
        // of driving occurs
        int milesDriven = setPoint - mileage;
        // Every 24 miles, fuelGauge.decrementGallons executes
        if (milesDriven % MPG == 0) 
        {
            fuelGauge.decrementGallons();
        }
    }
}
