package food.delivery.Model;

import javax.persistence.Entity;

import org.apache.tomcat.jni.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	private String customerId;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String mobileNumber;
	private Address address;

}
