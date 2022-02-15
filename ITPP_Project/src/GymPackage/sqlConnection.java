package GymPackage;

public class sqlConnection {

	public boolean checkLogin(String username,String password) {
		boolean login = false;
		
		if(username.equals("test") & password.equals("test")) {
		login =  true;
		System.out.println("here");
		}
		else {
		login = false;
		System.out.println(username+"/"+password);
		}
		return login;
	}
}
