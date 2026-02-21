import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main 
{
    public static void main(String[] args)
    {
        // TO DO: Display avilable items, from inventory class.
        Inventory buyInventory = new Inventory();
        CalculatePrice total = new CalculatePrice();

        DecimalFormat nb = new DecimalFormat("#.##");
        System.out.print("notbooks:".toUpperCase()+" "+ "$");
        System.out.println(nb.format(buyInventory.noteBooks));
       
        DecimalFormat cal = new DecimalFormat("#.##");
        System.out.print("calculators:".toUpperCase()+" "+ "$");
        System.out.println(cal.format(buyInventory.calculators));

        DecimalFormat bp = new DecimalFormat("#.##");
        System.out.print("backpacks:".toUpperCase()+" "+ "$");
        System.out.println(bp.format(buyInventory.backPacks));

        DecimalFormat blkp = new DecimalFormat("#.##");
        System.out.print("blackpens:".toUpperCase()+" "+ "$");
        System.out.println(blkp.format(buyInventory.blackPens));

        DecimalFormat pl = new DecimalFormat("#.##");
        System.out.print("pencils:".toUpperCase()+" "+ "$");
        System.out.println(pl.format(buyInventory.pencils));
        // TO DO: Get user input for list.
       
        // TO DO: error check for user input
        // TO DO: If user presses enter when order is complete then do next tasks.
        // TO DO: format out put.
        // TO DO: display time and date.
        LocalDateTime purchaseDate = LocalDateTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newTimeFormat = purchaseDate.format(formattedTime);
        System.out.println(newTimeFormat);
        // TO DO: Thank user for purchase.
    }
}




