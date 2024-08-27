/*

    Arlo Insigne
    CMIS 242
    Assignment 2
    October 18, 2022

    Purpose: Write an order system that allows users to order fruit or salty snack.
    The program returns the summary of the order along with the calculated price.

 */

public class Snack {
    private String id;
    private String size;
    private double price;

    Snack(String id, String size){
        this.id = id;
        this.size = size;
    }

    public void setID(String id){
        this.id = id;
    }

    public String getID(){
        return this.id;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return this.size;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String toString(){
        return "";
    }
}
