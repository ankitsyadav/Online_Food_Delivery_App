package food.delivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.delivery.Model.Category;
@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
