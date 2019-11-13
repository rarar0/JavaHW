import java.util.*; // Needed for ArrayList class

/**
   This program demonstrates how to store
   objects in an ArrayList.
*/

public class PhoneBookDemo
{
    public static void main(String[] args)
    {
      // Create an ArrayList to hold objects.
        ArrayList<PhoneBookEntry> pbe = new ArrayList<PhoneBookEntry>();
      
      // Add three objects to the ArrayList.
         pbe.add(new PhoneBookEntry("Alex", "612-555-5555"));
         pbe.add(new PhoneBookEntry("John", "651-707-1010"));
         pbe.add(new PhoneBookEntry("Joseph", "555-555-5555"));
         pbe.add(new PhoneBookEntry("Matthew", "952-555-5555"));
         pbe.add(new PhoneBookEntry("Luke", "253-529-0633"));
      
      // Display each item.
         for (int index = 0; index < pbe.size(); index++)
         {
             PhoneBookEntry entry = pbe.get(index);
             System.out.println("Entry at index " + index +
                      "\nName: " + entry.getName(index) +
                      "\nPhone Number: " + entry.getPhoneNumber(index);
         }      
    }
}
