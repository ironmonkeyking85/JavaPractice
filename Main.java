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
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the supply store!");

        String linebreak = "~";
        int saperator = 1;
        int saperatorCount = 25;
        while (saperator < saperatorCount) {
            System.out.print(linebreak + " ");
            saperator++;

            if (saperator == saperatorCount)
                {
                    break;
                }
        }
        System.out.print("\n");

        DecimalFormat nb = new DecimalFormat("#.##");
        System.out.print("notebooks:".toUpperCase()+" "+ "$");
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
        System.out.println("\n");

        // TO DO: Get user input for list.
        // TO DO: Take input argument and use with calculate class.    
        int buyNoteBooks = 0;
        int buyCalulators = 0;
        int buyBackPacks = 0;
        int buyBlackpens = 0;
        int buyPencils = 0; 
        double finalPrice = 0;
        DecimalFormat fm = new DecimalFormat("#.##");

        
        System.out.print("How many Notbooks: ");
        buyNoteBooks = input.nextInt();
        System.out.println("You bought " + buyNoteBooks + " notebooks." + " " + "SubTotal: $" + fm.format(total.subTotal(buyNoteBooks, buyInventory.noteBooks)));
        finalPrice += total.subTotal(buyNoteBooks, buyInventory.noteBooks);
        System.out.println("\n");
        
        System.out.print("How many Calculators: ");
        buyCalulators = input.nextInt();
        System.out.println("You bought " + buyCalulators + " calculators." + " " + "SubTotal: $" + fm.format(total.subTotal(buyCalulators, buyInventory.calculators)));
        finalPrice += total.subTotal(buyCalulators, buyInventory.calculators);
        System.out.println("\n");

         System.out.print("How many BackPacks: ");
        buyBackPacks = input.nextInt();
        System.out.println("You bought " + buyBackPacks + " backpacks."+ " " + "SubTotal: $" + fm.format(total.subTotal(buyBackPacks, buyInventory.backPacks)) );
        finalPrice += total.subTotal(buyBackPacks, buyInventory.backPacks);
        System.out.println("\n");

        System.out.print("How many BlackPens: ");
        buyBlackpens = input.nextInt();
        System.out.println("You bought " + buyBlackpens + " blackpens." + " " + "SubTotal: $" + fm.format(total.subTotal(buyBlackpens, buyInventory.backPacks)));
        finalPrice += total.subTotal(buyBlackpens, buyInventory.backPacks);
        System.out.println("\n");

        System.out.print("How many Pencils: ");
        buyPencils = input.nextInt();
        System.out.println("You bought " + buyPencils + " pencils." + " " + "SubTotal: $" + fm.format(total.subTotal(buyPencils, buyInventory.pencils)));
        finalPrice += total.subTotal(buyPencils, buyInventory.pencils);
        System.out.println("\n");

      //  if (!input.hasNextInt())
        //{    
          //  System.out.println("Invalid entry, plaease enter whole numbers.");
       // }
        
        // TO DO: Display avilable items.
        // TO DO: display totals from list of bought items.
        // TO DO: display sub-totol.
        // TO DO: error check for user input
        // TO DO: If user presses enter when order is complete then do next tasks.
        String linedivider = "_";
        int divider = 1;
        int dividerCount = 25;
        while (divider < dividerCount) {
            System.out.print(linedivider + " ");
            divider++;
            
            if (divider == dividerCount)
                {
                    break;
                }
                
            }
        input.close();
        System.out.print("\n");
        String totals = "GRAND TOTAL: $" + fm.format(finalPrice);
        String grandTotal = String.format("%33s", totals);
        System.out.println(" " + grandTotal + " ");
        String linedivider2 = "_";
        int divider2 = 1;
        int dividerCount2 = 25;
        while (divider2 < dividerCount2) {
            System.out.print(linedivider2 + " ");
            divider2++;
            
            if (divider2 == dividerCount2)
                {
                    break;
                }
                
            }
        System.out.print("\n");
        
        // TO DO: format out put.
        // TO DO: display time and date.
        LocalDateTime purchaseDate = LocalDateTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newTimeFormat = purchaseDate.format(formattedTime);
        String thanks = "THANK YOU FOR YOU ORDER!";
        String time = String.format("%32s", newTimeFormat);
        String thankYou = String.format("%35s", thanks);
        System.out.println(" " + time + " ");
        // TO DO: Thank user for purchase.
        System.out.println(" " + thankYou + " ");
    }
}




