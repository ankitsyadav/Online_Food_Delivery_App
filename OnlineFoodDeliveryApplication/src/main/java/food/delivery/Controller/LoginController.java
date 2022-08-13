package food.delivery.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.delivery.Model.Login;
import food.delivery.Service.ILoginService;

@RestController
@RequestMapping("foodPanda")
public class LoginController {

	@Autowired
	private ILoginService loginService;
	 
	@PostMapping("/login")
	public ResponseEntity<Login> login(@RequestBody Login login)throws Exception{
		Login login2=loginService.signIn(login);
		return new ResponseEntity<Login>(login2, HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/logout")
	public ResponseEntity<Login> logout(@RequestBody Login login)throws Exception{
		Login login2=loginService.signout(login);
		return new ResponseEntity<Login>(login2, HttpStatus.ACCEPTED);
		
	}
}
