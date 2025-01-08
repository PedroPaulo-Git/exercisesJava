package entities;

public class product {
    public String name ;
    public int price ;
    public int quantity ;

    public int totalValueInStock(){
        return price * quantity;
    }
    public int addedStock(int quantity){
       this.quantity =+ quantity;
        return quantity;
    }
    public int removeFromStock(int quantity){
        this.quantity =- quantity;
        return quantity;
    }
}
