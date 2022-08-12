package food.delivery.Exception;

import java.time.LocalDateTime;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDetails {
	 private LocalDateTime time;
     private String message;
     private String detail;
     
     
}
