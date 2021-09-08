package com.edureka;

class Shoe {
    String type;
    String color;
    String brand;
    int number;
    int price;

    public Shoe() {
        System.out.println("My OWN SHOES STORE");
    }

    void setShoeDetails(String type, String color, String brand, int number, int price) {
        this.type=type;
        this.color=color;
        this.brand=brand;
        this.number=number;
        this.price=price;
    }
    void showShoesDetails(){
        System.out.println("------------------");
        System.out.println(("--Shoes Type : "+type));
        System.out.println("--Shoes color : "+color);
        System.out.println("--Shoes brand : "+brand);
        System.out.println("--Shoes number : "+number);
        System.out.println("--Shoes price : "+price);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Shoe shoe1 =new Shoe();
        Shoe shoe2 =new Shoe();
        Shoe shoe3 =new Shoe();
    shoe1.setShoeDetails("running","black","ADIDAS",43,3600);
    shoe2.setShoeDetails("summer","white/black","Polo",40,9500);
    shoe3.setShoeDetails("basketball","Black/Red","NIKE",44,1150);
    shoe1.showShoesDetails();
    shoe2.showShoesDetails();
    shoe3.showShoesDetails();







    }
}
