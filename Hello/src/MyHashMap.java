import java.util.HashMap;

public class MyHashMap {
    /*     HashMap creates a key/value pair, and work the same way as dictionaries in Python */

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City):
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

//        HashMap items can be accessed with .get() method:
        System.out.println(capitalCities.get("England"));

//        HashMap items can be deleted by .remove() method:
        capitalCities.remove("England");
        System.out.println(capitalCities);

//        HashMap .size() method returns the number of items:
        System.out.println(capitalCities.size());

//        Loop through a HashMap with a for-each loop. .keySet() method gets only the keys while .values() method gets the values
        System.out.printf("%n%nUsing the keySet() method: %n");
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        System.out.printf("%n%nNow the values method: %n");
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

//      Now using both keySet() and values():
        System.out.printf("%n%nNow using both .keySet() and .values(): %n");
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
