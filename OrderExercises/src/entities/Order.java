package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private final Client client;
    private final List<OrderItem> items = new ArrayList<>();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }


    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Order(Date moment, OrderStatus status,Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public void addItem( OrderItem item){
        items.add(item);
    }
    public void removeItem( OrderItem item){
        return;
    }
    public Double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Order moment: ");
//        sb.append(sdf.format(moment)).append("\n");
//        sb.append("Order status: ");
//        sb.append(status).append("\n");
//        sb.append("Client: ");
//        sb.append(client).append("\n");
//        sb.append("Order items:\n");
//        for (OrderItem item : items) {
//            sb.append(item + "\n");
//        }
//        sb.append("Total price: $");
//        sb.append(String.format("%.2f", total()));
//        return sb.toString();

    @Override
    public String toString() {
        return "Order{" +
                "moment=" + moment +
                ", status=" + status +
                ", client=" + client +
                ", items=" + items +
                ", total=" + total() +
                '}';
    }
//    }

}
