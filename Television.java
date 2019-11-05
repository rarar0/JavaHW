/**
The Television class stores information about
a television set, including size, manufacturer,
channel, volume, and power state. You can change 
power state, volume, and channel.

CSCI 1541-60 
Alex Malm
11/5/19
*/
public class Television
{
    String manufacturer; //Var for 
    // Manufacturer name, interacts with getManufacturer
    int screenSize; //Size variable, interacts
    // with getScreenSize
    boolean powerOn; // Power state, default is off
    int channel; // Stores Channel, default of 2
    int volume; // Stores Volume, default of 20
    /**
    Constructor Television
    @param brand The brand of television.
    @param size The screen size.
    */
    public Television(String brand, int size)
    {
        manufacturer = brand;
        screenSize = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }
    /**
    Method getVolume returns volume
    */
    
    public int getVolume()
    {
        return volume;
    }
    /**
    Method getChannel returns int channel
    */
    public int getChannel()
    {
        return channel;
    }
    /**
    Method getManufacturer returns String manufacturer
    */
    public String getManufacturer()
    {
        return manufacturer;
    }
    /**
    Method getScreenSize returns int screenSize
    */
    public int getScreenSize()
    {
        return screenSize;
    }
    /**
    Mutator Method setChannel accepts int station
    and assigns the int to channel
    */
    public void setChannel(int station)
    {
        channel = station;
    }
    /**
    Mutator Method power changes powerOn boolean
    */
    public void power()
    {
        powerOn = !powerOn;
    }
    /**
    Mutator Method increaseVolume increases volume
    */
    public void increaseVolume()
    {
        volume+=1;
    }
    /**
    Mutator Method decreaseVolume decreases volume
    */
    public void decreaseVolume()
    {
        volume-=1;
    }
}
