package food.delivery.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class Login {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer userId;
   @NotNull
   private String userName;
   @NotNull
   @Size(min = 6,max=10 ,message = "Password Size 6 to 10 charcter")
   private String password;
}
