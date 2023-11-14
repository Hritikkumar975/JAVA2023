/* Write a java method to display the current date and time. */
import java.util.Date;

public class function8_7024 {
    public static void main(String[] args) {
        displayCurrentDateTime();
    }

    public static void displayCurrentDateTime() {
    
        Date currentDate = new Date();

        
        System.out.println("Current Date and Time: " + currentDate);
    }
}