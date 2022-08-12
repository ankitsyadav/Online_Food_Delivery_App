package food.delivery.Model;

import javax.persistence.*;
import lombok.*;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id")
	private String addressId;
	
	
	private String buildingName;
	private String streetNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
}
