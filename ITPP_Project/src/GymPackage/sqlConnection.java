package GymPackage;

public class sqlConnection {

	//checks user login
	public boolean checkLogin(String username,String password) {
		boolean login = false;
		
		if(username.equals("test") & password.equals("test")) {
		login =  true;
		}
		else {
		login = false;
		}
		return login;
	}
}
