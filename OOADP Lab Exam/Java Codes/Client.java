public class Client {
    public static void main(String args[]){
        CustomerType customer;
        
        iDiscount discount1, discount2;
        discount1 = new Discount1();
        discount2 = new Discount2();
        
        
        customer = new Regular("Anurag", 21, 8000);
        
        System.out.println("****************************************************"+"\nRegular Customer with discount type 1\n"+"****************************************************");
        customer.setDiscount(discount1);
        customer.display();

        
        System.out.println("****************************************************"+"\nRegular Customer with discount type 2\n"+"****************************************************");
        customer.setDiscount(discount2);
        customer.display();

        customer = new Senior("Rajeev", 65, 3000);
        
        System.out.println("****************************************************"+"\nSeniorCitizen Customer with discount type 1\n"+"****************************************************");
        customer.setDiscount(discount1);
        customer.display();

        System.out.println("****************************************************"+"\nSeniorCitizen with discount type 2\n"+"****************************************************");
        customer.setDiscount(discount2);
        customer.display();

        System.out.println("****************************************************");
    }
}