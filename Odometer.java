class Odometer {

    // Constant for the maximum mileage
    public final int MAXIMUM_MILEAGE = 999999;

    // Constant for the miles-per-gallon
    public final int MPG = 24;

    private int initialMileage;
    private int mileage;

    // Field to reference a FuelGauge object
    private FuelGauge fuelGauge;

    /**
     * Constructor
     *
     * @param m
     *            Initial mileage.
     * @param fg
     *            A reference to a FuelGauge object.
     */
    public Odometer(int mileage, FuelGauge fuelGauge) {
        this.initialMileage = mileage;
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    /**
     * getMileage method
     *
     * @returns The mileage.
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * The addMileage method increments the mileage field. If mileage
     * exceeds the maximum amount, it rolls over to 0.
     */
    public void addMileage() {

        if (mileage < MAXIMUM_MILEAGE) {
            mileage++;
        } else {
            mileage = 0;
        }

        int driven = initialMileage - mileage;
        if (driven % MPG == 0) {
            fuelGauge.burnFuel();
        }
    }
}
