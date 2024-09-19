public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 0;
        double salesTax = 0;
        final double SALES_TAX_RATE = .05;

        salesTax = purchasePrice * SALES_TAX_RATE;

        System.out.println("The sales tax on a purchase of " + purchasePrice + "is" + salesTax);



    }
}