package com.val;

public class InvoiceItem {

    private String name;
    private Integer quantity;
    private int price;

    public InvoiceItem(String _name) {
        name = _name;
    }
    //nAlternative constructor - we want to use a different set of argument
    // this is knows as overloading - same method name but different signature
    public InvoiceItem(String _name, int _price, int _quantity) {
        name = _name;
        price = _price;
        quantity = _quantity;
    }

    public String getName() {
        return name;

    }

    @Override
    public String toString(){

        return String.format("Invoice Item Details" + name + "| Price: " + price + "| Quantity: " + quantity);

    }
}
