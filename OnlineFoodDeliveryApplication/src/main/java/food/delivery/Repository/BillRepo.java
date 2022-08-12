package food.delivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.delivery.Model.Bill;
@Repository
public interface BillRepo extends JpaRepository<Bill, Integer>{

}
