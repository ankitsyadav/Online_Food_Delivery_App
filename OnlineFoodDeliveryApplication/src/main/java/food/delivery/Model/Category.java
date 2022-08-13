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
<<<<<<< HEAD
	Integer catId;
=======
	private Integer catId;
>>>>>>> 15fbf0fcb27194d9d7fd748f5f5c206724faf442
	@NotNull(message = "category should not be null")
	private String categoryName;
}
