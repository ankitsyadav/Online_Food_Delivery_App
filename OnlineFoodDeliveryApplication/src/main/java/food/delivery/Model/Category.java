package food.delivery.Model;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String catId;
	@NotNull(message = "category should not be null")
	String categoryName;
}
