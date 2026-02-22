import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main 
{
    public static void main(String[] args)
    {
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

       
        int buyNoteBooks = 0;
        int buyCalulators = 0;
        int buyBackPacks = 0;
        int buyBlackpens = 0;
        int buyPencils = 0; 
        double finalPrice = 0;
        DecimalFormat fm = new DecimalFormat("#.##");
        int completeOrder = 0;

        
        
        System.out.print("How many Notbooks: ");
        buyNoteBooks = input.nextInt();
        System.out.println("You bought " + buyNoteBooks + " notebooks." + " " + "SubTotal: $" + fm.format(total.subTotal(buyNoteBooks, buyInventory.noteBooks)));
        finalPrice += total.subTotal(buyNoteBooks, buyInventory.noteBooks);
        completeOrder = 0;
        
        System.out.println("\n");
        
        System.out.print("How many Calculators: ");
        buyCalulators = input.nextInt();
        System.out.println("You bought " + buyCalulators + " calculators." + " " + "SubTotal: $" + fm.format(total.subTotal(buyCalulators, buyInventory.calculators)));
        finalPrice += total.subTotal(buyCalulators, buyInventory.calculators);
        completeOrder = 0;

        System.out.println("\n");

         System.out.print("How many BackPacks: ");
        buyBackPacks = input.nextInt();
        System.out.println("You bought " + buyBackPacks + " backpacks."+ " " + "SubTotal: $" + fm.format(total.subTotal(buyBackPacks, buyInventory.backPacks)) );
        finalPrice += total.subTotal(buyBackPacks, buyInventory.backPacks);
        completeOrder = 0;

        System.out.println("\n");

        System.out.print("How many BlackPens: ");
        buyBlackpens = input.nextInt();
        System.out.println("You bought " + buyBlackpens + " blackpens." + " " + "SubTotal: $" + fm.format(total.subTotal(buyBlackpens, buyInventory.backPacks)));
        finalPrice += total.subTotal(buyBlackpens, buyInventory.backPacks);
        completeOrder = 0;

        System.out.println("\n");

        System.out.print("How many Pencils: ");
        buyPencils = input.nextInt();
        System.out.println("You bought " + buyPencils + " pencils." + " " + "SubTotal: $" + fm.format(total.subTotal(buyPencils, buyInventory.pencils)));
        finalPrice += total.subTotal(buyPencils, buyInventory.pencils);
        completeOrder = 100;
        
        System.out.println("\n");
        
        
        if (completeOrder == 100)
        {
        String linedivider = "_";
        int divider = 1;
        int dividerCount = 25;
        while (divider < dividerCount) 
            {
            System.out.print(linedivider + " ");
            divider++;
            
            if (divider == dividerCount)
                {
                    break;
                }
                
            }
        System.out.print("\n");

        String totals = "GRAND TOTAL: $" + fm.format(finalPrice);
        String grandTotal = String.format("%33s", totals);
        System.out.println(" " + grandTotal + " ");

        System.out.print("\n");

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
        
        LocalDateTime purchaseDate = LocalDateTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newTimeFormat = purchaseDate.format(formattedTime);
        String thanks = "THANK YOU FOR YOU ORDER!";
        String time = String.format("%32s", newTimeFormat);
        String thankYou = String.format("%35s", thanks);
        System.out.println(" " + time + " ");
       
        System.out.println(" " + thankYou + " ");
        
        input.close(); 
        
        }
    }
}




