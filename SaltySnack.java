/*

    Arlo Insigne
    CMIS 242
    Assignment 2
    October 18, 2022

    Purpose: Write an order system that allows users to order fruit or salty snack.
    The program returns the summary of the order along with the calculated price.

 */

public class SaltySnack extends Snack{

    private boolean isNutty;

    SaltySnack(String id, String size, boolean isNutty) {
        super(id, size);
        this.isNutty = isNutty;
    }
    public void setNutty(boolean nutty){
        this.isNutty = nutty;
    }
    public boolean getNutty(){
        return this.isNutty;
    }

    @Override
    public String toString(){
        double newPrice = (Math.round(this.getPrice() * 100.0)/100.0);
        return "You have chosen snack type = Salty Snack, of type = " + getSize() +
                ", id = " + getID() + " and price " + newPrice + ".";
    }
}
