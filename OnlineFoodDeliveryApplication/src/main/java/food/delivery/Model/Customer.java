package food.delivery.Model;

import javax.persistence.*;
import javax.validation.constraints.Max;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String customerId;
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	
	@NonNull
	@Max(100)
	private int age;
	
	@NonNull
	private String gender;
	private String mobileNumber;
	private Address address;

}
