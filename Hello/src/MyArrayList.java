import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {

/*      ArrayList can be changed, get new items, delete items, clean the list
*       ArrayList objects work in a  very similar way to Python List objects.
*       Even the for-each loop resembles the list comprehension syntax, although it does not create a list this way*/

    public static void main(String[] args) {

//        Creates an ArrayList Object named cars
        ArrayList<String> cars = new ArrayList<>();
        ArrayList<String> myCars = new ArrayList<>();

//        Adds elements to the list with the .add() method
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        myCars.add("Volvo");
        myCars.add("BMW");
        myCars.add("Ford");
        myCars.add("Mazda");
        System.out.println(cars);

//        ArrayList items can be accessed with .get() method:
        System.out.println(cars.get(0));

//        ArrayList items can be modified with .set() method:
        cars.set(0, "Opel");
        System.out.println(cars);

//        ArratList items can be deleted with .remove() method:
        cars.remove(0);
        System.out.println(cars);

//        To remove all elements, use .clear() method:
        cars.clear();
        System.out.println(cars);

//        .size() method gets the length of the ArrayList object and can be used in a for-Loop:
        for (int i = 0; i < myCars.size(); i++) {
            System.out.println(myCars.get(i));
        }

//            ArrayList objects can also be looped through via for-each loop:
        System.out.printf("%n%nUsing the for-each loop: %n");
        for (String i : myCars) {
            System.out.println(i);
        }

//        ArrayList can be sorted by the java.util.Collection:
        Collections.sort(myCars);
        System.out.printf("%n%nSorted ArrayList: %n");
        for (String i : myCars) {
            System.out.println(i);
        }

        }
}
