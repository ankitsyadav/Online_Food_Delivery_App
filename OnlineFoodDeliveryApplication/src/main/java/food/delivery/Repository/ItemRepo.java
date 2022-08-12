package food.delivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.delivery.Model.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Integer>{

}
