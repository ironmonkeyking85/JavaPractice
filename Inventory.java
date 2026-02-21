//inventory class
public class Inventory
{
    double min = 1.00;
    double max = 10.00;
    double priceAdjustment = 1.00; 
    double priceRange = max - min + priceAdjustment;
    //inventory list.
    //randomize available item prices.
    double noteBooks = (double) (Math.random()* (priceRange));
    double calculators = (double) (Math.random()* (priceRange));
    double backPacks = (double) (Math.random()* (priceRange));
    double blackPens = (double) (Math.random()* (priceRange));
    double pencils = (double) (Math.random()* (priceRange));
}