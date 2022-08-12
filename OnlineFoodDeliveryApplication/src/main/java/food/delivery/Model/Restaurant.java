package food.delivery.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String restaurantId;
	private String restaurantName;
	private String address;
	private String managerName;
	private String contactNumber;
}
