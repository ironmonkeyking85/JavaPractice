public class CalculatePrice {
    
    Inventory currentInventory = new Inventory();
    

    public double subTotal(double amount, double currentPrice)
    {
      
        double subtotal = amount * currentPrice;
        return subtotal;
      
    }

    public double grandTotal(double total)
    {
      double totalorderprice = subTotal(total, total) ;
      return totalorderprice;
    }


}
