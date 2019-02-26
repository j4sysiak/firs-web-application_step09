package webapp.login;

public class LoginService {

	public boolean validateUser(String user, String password){
		
		if(user.equalsIgnoreCase("jacek") && password.equals("pppp")){
			return true;
		}
		return false;
	}
}

 


 