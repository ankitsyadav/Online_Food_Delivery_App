package food.delivery.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class FoodCart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer cartId;
	@NotNull(message = "customer shoud not be null")
	private Customer customer;
	@NotNull(message = "itemList shoud not be null")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Item> itemList;

}
