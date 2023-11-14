import java.util.Date;

class DateTimeExample {
    public static void main(String[] args) {
        displayCurrentDateTime();
    }

    public static void displayCurrentDateTime() {
        Date currentDate = new Date();

       
        System.out.println("Current Date and Time: " + currentDate);
    }
}
