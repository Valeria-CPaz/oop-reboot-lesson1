package com.val;

public class TestDriver {


    public static void run() {
        testPerson();
        testCar();
        testShop();
        testInvoiceItem();
        testInvoice();
    }

    private static void testInvoiceItem() {
        InvoiceItem i = new InvoiceItem("apple");
        System.out.println("InvoiceItem is: " + i.getName());

        InvoiceItem i2 = new InvoiceItem("orange", 3, 4);
        System.out.println(i2.toString());
    }

    private static void testInvoice() {

        Invoice i = new Invoice("1234");
        System.out.println("InvoiceItem is: " + i.getNumber());
    }

    public static void testPerson() {
        Person p = new Person("Val");
        System.out.println("The manufacture is :" + p.getName());

        p.setAge(50);
        Person p2 = new Person("Harry");
        System.out.println("The manufacture is :" + p2.getName());
        System.out.println("The age is :" + p2.getAge());
    }

    public static void testCar() {
        Car c = new Car("Volvo");
//        System.out.println("The manufacture is :" + c.getManufacture());
        System.out.println(c.toString());
        Car c2 = new Car("Volvo");
//        System.out.println("The manufacture is :" + c2.getManufacture());
        System.out.println(c2.toString());
    }

    public static void testShop() {
        Shop s = new Shop("Centra");
        System.out.println("The shop name is :" + s.getName());

        Shop s2 = new Shop("Spire");
        System.out.println("The shop name is :" + s2.getName());

    }
}
