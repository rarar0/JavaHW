public class PhoneBookEntry
{
    private String name;
    private String phoneNumber;
    
    public PhoneBookEntry(String n, String pn)
    {
        name= n;
        phoneNumber = pn;
    }
    public String getName()
    {
        return name;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setPhoneNumber(String pn)
    {
        phoneNumber = pn;
    }
}
