package food.delivery.Service;

import java.util.List;

import food.delivery.Model.Customer;
import food.delivery.Model.OrderDetails;
import food.delivery.Model.Restaurant;

public interface IOrderService {
    public OrderDetails addOrder(OrderDetails order);
    public OrderDetails updateOrder(OrderDetails order);
    public OrderDetails removeOrder(OrderDetails order);
    public OrderDetails  viewOrder(OrderDetails order);
    public List<OrderDetails> viewAllAllOrders(Restaurant res);
    public List<OrderDetails> viewAllAllOrders(Customer customer);
    
}
