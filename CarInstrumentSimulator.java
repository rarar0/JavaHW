/**
CarInstrumentSimulator utilizes the FuelGauge and Odometer classes
to print out a simulated car ride.
*/
public class CarInstrumentSimulator
{

    public static void main(String[] args) 
    {

        // Creates a FuelGauge object
        FuelGauge fuel = new FuelGauge();
        // Creates an Odometer object
        Odometer odometer = new Odometer(0, fuel);
        
        // Executes a loop to fill the gastank
        for (int i = 0; i < FuelGauge.MAXIMUM_GALLONS; i++) 
        {
            fuel.incrementGallons();
        }
        // Executes a loop while the gastank has gas
        while (fuel.getGallons() > 0) 
        {
            // mile driven
            odometer.incrementMileage();
            // mileage printout
            System.out.println("Mileage: " + odometer.getMileage());
            // fuel printout
            System.out.println("Fuel level: " + fuel.getGallons() + " gallons");
            // newline
            System.out.println("--------------------------------------");
        }
    }
}
