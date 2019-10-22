import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class DateTime {
    public static void main(String[] args) {

        // Creates an instance (myDateObj) of LocalDateTime Class
        LocalDateTime myDateObj = LocalDateTime.now();

        // Prints myDateObj without nanoseconds
        System.out.println("Before formatting: " + myDateObj.withNano(0));

        // Creates an instance (myFormatObj) of DateTimeFormatter Class
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Creates a String (formattedDate), applying myFormatObj
        String formattedDate = myDateObj.format(myFormatObj);

        // Prints formatted object
        System.out.println("After formatting: " + formattedDate);

        // Gets month value (number) from myDateObj
        System.out.println(myDateObj.getMonthValue());
    }
}