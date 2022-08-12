package food.delivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.delivery.Model.FoodCart;

@Repository
public interface CartRepo extends JpaRepository<FoodCart, Integer>{

}
