class FuelGauge {

    final static int MAXIMUM_GALLONS = 15;

    private int gallons;

    public FuelGauge() {
        gallons = 0;
    }

    /**
     
     @param gallons
     */
    public FuelGauge(int gallons) {
        if (gallons <= MAXIMUM_GALLONS) {
            this.gallons = gallons;
        } else {
            gallons = MAXIMUM_GALLONS;
        }
    }

    public int getGallons() {
        return gallons;
    }

    /**
     
     */
    public void addGallons() {
        if (gallons < MAXIMUM_GALLONS) {
            gallons++;
        } else {
            // TODO: see constructor, throw GasOverflowException
            System.out.println("FUEL OVERFLOWING!!!");
        }
    }

    /**
          */
    public void burnFuel() {
        if (gallons > 0) {
            gallons--;
        } else {
            System.out.println("OUT OF FUEL!!!");
        }
    }
}
