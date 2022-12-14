package food.delivery.Model;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.*;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	@NotNull(message = "building shoud not be null")
	private String buildingName;
	
	@NotNull(message = "street shoud not be null")
	private String streetNo;
	
	@NotNull(message = "area shoud not be null")
	private String area;
	
	@NotNull(message = "city shoud not be null")
	private String city;
	
	@NotNull(message = "state shoud not be null")
	private String state;
	
	@NotNull(message = "country shoud not be null")
	private String country;
	
	@NotNull
	@Size(min=6,max=6,message="Invalid Pincode")
	@Pattern(regexp="[1-9][0-9]{5}", message = "Invalid pincode")
	private String pincode;


	
	
}
