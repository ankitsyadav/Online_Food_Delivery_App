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
	private Integer catId;

	@NotNull(message = "category should not be null")
	private String categoryName;
}
