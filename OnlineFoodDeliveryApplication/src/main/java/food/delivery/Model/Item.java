package food.delivery.Model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.*;
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String itemId;
	
	@NotNull(message = "item name should not be null")
	private String itemName;
	
	@NotNull(message = "category should not be null")
	private String category;
	
	@NotNull(message = "quantity should not be null")
	private Integer quantity;
	
	@NotNull(message = "cost should not be null")
	private Double cost;
	
	@NotNull(message = "cost should not be null")
	private List<Restaurant> restaurants;
	
	
}
