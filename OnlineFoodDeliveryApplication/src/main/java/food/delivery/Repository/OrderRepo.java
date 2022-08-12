package food.delivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.delivery.Model.OrderDetails;

public interface OrderRepo extends JpaRepository<OrderDetails, Integer>{

}
