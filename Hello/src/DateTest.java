public class DateTest {

    public static void main(String[] args) {

        Date date1 = new Date(12, 02, 1978);
        Date date2 = new Date(28, 07, 1985);
        Date date3 = new Date(15, 9, 2015);
        Date date4 = new Date(11,9,2011);

        System.out.printf("%n%n*****  Date Testing Utility  *****%n%n");
        System.out.printf("Date1: ");
        date1.displayDate();
        System.out.printf("Date2: ");
        date2.displayDate();
        System.out.printf("Date3: ");
        date3.displayDate();
        System.out.printf("Date4: ");
        date4.displayDate();
    }
}
