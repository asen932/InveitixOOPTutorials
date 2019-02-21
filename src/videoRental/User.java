package videoRental;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class User extends videoStore {

   private String username;
   private int ID;
   private List<String> rentedItems = new ArrayList<String>();

   public void rentingItem(String rentedItem) {

      rentedItems.add(rentedItem);



   }

}
