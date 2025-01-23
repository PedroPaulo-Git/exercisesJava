package entities;

public class OrderItem {
    Product product;
    private Integer quantity;
    private Double price;

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public OrderItem(Integer quantity, Double price,Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "product=" +
                ", name="+ product.getName()+
                ", ,=" + product.getPrice() +
                ", quantity=" + quantity +
                ", subtotal=" + subTotal() +
                ", price=" + price +
//                ", total price=" + price +

                '}';
    }

    public Double subTotal(){
        return price * quantity;
    }
}
