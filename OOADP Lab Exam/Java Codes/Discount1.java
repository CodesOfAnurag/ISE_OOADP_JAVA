public class Discount1 implements iDiscount{
    public double calculateDiscount(double amount){
        if (amount>=2000)
            return 350;
        else
            return amount*(0.2);
    }    
}