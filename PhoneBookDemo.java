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
      ArrayList<PhoneBookEntry> list = new ArrayList<PhoneBookEntry>();
      
      // Add three objects to the ArrayList.
      list.add(new PhoneBookEntry(Bteve, 612-555-5555));
      list.add(new PhoneBookEntry(Pringles, 651-707-1010));
      list.add(new PhoneBookEntry(Joseph, 555-555-5555));
      
      // Display each item.
      for (int index = 0; index < list.size(); index++)
      {
         PhoneBookEntry var = list.get(index);
         System.out.println(" at index " + index +
                      "\nBalance: " + var.methodTo(stuff));
      }      
   }
}
