/*

    Arlo Insigne
    CMIS 242
    Assignment 2
    October 18, 2022

    Purpose: Write an order system that allows users to order fruit or salty snack.
    The program returns the summary of the order along with the calculated price.

 */

public class FruitSnack extends Snack{
    private boolean isCitrus;

    FruitSnack(String id, String size, boolean isCitrus) {
        super(id, size);
        this.isCitrus = isCitrus;
    }
    public void setCitrus(boolean citrus){
        this.isCitrus = citrus;
    }

    public boolean getCitrus(){
        return this.isCitrus;
    }

    @Override
    public String toString(){
        double newPrice = (Math.round(this.getPrice() * 100.0)/100.0);
        return "You have chosen snack type = Fruit Snack, of type = " + getSize() +
                ", id = " + getID() + " and price " + newPrice + ".";
    }

}
