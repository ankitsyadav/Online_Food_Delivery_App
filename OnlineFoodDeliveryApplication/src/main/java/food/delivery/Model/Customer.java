package food.delivery.Model;

import javax.persistence.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@NonNull
	@Pattern(regexp="[a-z]{3,12}", message="Last must Not Contain Special Character")
	private String firstName;
	
	@NonNull
	@Pattern(regexp="[a-z]{3,12}", message="Last must Not Contain Special Character")
	private String lastName;
	
	@NonNull
	private int age;
	
	@NonNull
	private String gender;
	@NonNull
	@Size(min=10 ,max=10,message="Mobile Must have 10 Digit")
	@Pattern(regexp="[6789][0-9]{9}",message="Please Enter Valid Mobile No")
	private String mobileNumber;
	
	@NonNull
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;

}
