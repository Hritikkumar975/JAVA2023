import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datecon {
    public static void main(String[] args) {
        String dateString = "2023-11-05"; // A sample date string in yyyy-MM-dd format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = dateFormat.parse(dateString); // Convert the string to a Date object
            System.out.println("Original: " + dateString);
            System.out.println("Reviewd Date: " + date);
        } catch (ParseException e) {
            System.err.println("Reviewing failed. Exception: " + e.getMessage());
        }
    }
}
