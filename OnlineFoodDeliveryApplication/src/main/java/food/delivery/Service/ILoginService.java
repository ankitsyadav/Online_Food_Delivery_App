package food.delivery.Service;

import food.delivery.Model.Login;

public interface ILoginService {

	public Login signIn(Login login);
	
	public Login signout(Login login);
}
