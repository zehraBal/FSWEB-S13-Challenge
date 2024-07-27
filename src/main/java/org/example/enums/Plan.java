package org.example.enums;

public enum Plan {
    STARTER("A",1000),
    BASIC("B",2000),
    PREMIUM("c",5000);


    private String name;
    private int price;

    Plan(String name,int price){
        this.name=name;
        this.price=price;
    }

    //getter methods
    public String getName(){
        return name;
    }

    public int getPrice(){
        return  price;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(int price){
        this.price=price;
    }
}
