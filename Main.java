import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main 
{
    public static void main(String[] args)
    {
        // TO DO: Display avilable items, from inventory class.
        // TO DO: Get user input for list.
        // TO DO: error check for user input
        // TO DO: format out put.
        // TO DO: display time and date.
        LocalDateTime purchaseDate = LocalDateTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newTimeFormat = purchaseDate.format(formattedTime);
        System.out.println(newTimeFormat);
        // TO DO: Thank user for purchase.
    }
}




