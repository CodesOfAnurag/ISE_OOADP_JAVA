public class Discount2 implements iDiscount{
    public double calculateDiscount(double amount){
        if (amount>=3000)
            return 800;
        else
            return amount*(0.10);
    }    
}