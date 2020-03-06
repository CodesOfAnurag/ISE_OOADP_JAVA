
public class Item {
    String name;
    double price = 0.0;
    int qty = 0;
    double billAmount = 0.0;
    CalcTax ct;

    Item(String name, double price, CalcTax ct) {
        this.name = name;
        this.price = price;
        this.ct = ct;
    }

    void setTax(CalcTax ct) {
        this.ct = ct;
    }

    void setQunatity(int qty) {
        this.qty = qty;

    }

    void printPrice() {
        double tax = ct.taxAmount(name, qty, price);

        billAmount = price * qty + tax;
        System.out.println("\nTax = " + tax);
        System.out.println(
                "Item " + name + "\nQuantity " + qty + "\nUnit price " + price + "\nTotal Amount " + billAmount);
    }

}
