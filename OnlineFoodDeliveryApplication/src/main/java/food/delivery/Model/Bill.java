package food.delivery.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String billId;
	@NotNull(message = "date shoud not be null")
	private LocalDateTime billDate;
	@NotNull(message = "order shoud not be null")
	private OrderDetails order;
	@NotNull(message = "items_number shoud not be null")
	private Integer totalItem;
	@NotNull(message = "cost shoud not be null")
	private double totalCost;
	
}
