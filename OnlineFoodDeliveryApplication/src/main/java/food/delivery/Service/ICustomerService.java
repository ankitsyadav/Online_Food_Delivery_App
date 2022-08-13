package food.delivery.Service;

import java.util.List;

import food.delivery.Model.Customer;
import food.delivery.Model.Restaurant;

public interface ICustomerService {
   public Customer addCustomer(Customer customer);
   public Customer updateCustomer(Customer customer);
   public Customer removeCustomer(Customer customer);
   public Customer viewCustomer(Customer customer);
   public List<Customer> viewsAllCustomers(Restaurant res);
}
