abstract public class CustomerType {
    String name;
    int age;
    iDiscount discount;
    double bill, amount;

    CustomerType(String name, int age, double amount){
        this.name = name;
        this.age = age;
        this.amount = amount;
    }

    public void setDiscount(iDiscount discount){
        this.discount = discount;
    }
    public void calcBill(){
        if (discount!=null)
            bill = amount - discount.calculateDiscount(amount);
        else 
            bill = amount;
    }

    public void display(){
        calcBill();
        System.out.println(
            "\n Name: "+name+
            "\n Age: "+age+
            "\n Amount: "+amount+
            "\n Discount: "+discount.calculateDiscount(amount)+
            "\n Bill: "+bill);
    }
    
}