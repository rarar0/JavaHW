public class CarInstrumentSimulator
{

    public static void main(String[] args) 
    {

        FuelGauge fuel = new FuelGauge();
        Odometer odometer = new Odometer(0, fuel);

        for (int x = 0; x < FuelGauge.MAXIMUM_GALLONS; x++) 
        {
            fuel.addGallons();
        }

        while (fuel.getGallons() > 0) 
        {

            // mile driven
            odometer.addMileage();

            // the mileage.
            System.out.println("Mileage: " + odometer.getMileage());

            // the amount of fuel.
            System.out.println("Fuel level: " + fuel.getGallons() + " gallons");
            System.out.println("--------------------------------------");
        }
    }
}
