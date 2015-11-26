package src.Model;

public class Employes {

	private static Employes instance = null;
	private String[] login, password;
	
	
	private Employes() {
		
		login = new String[2];
		password = new String[2];
		
		for(int i =0; i<2; i++)
		{
			login[i] = "user" + i;
			password[i] = "password" + i;
		}
		
	}
	
	public static Employes instance() {
		
		if(instance==null)
			instance = new Employes();
		
		return instance;
	}
	
	public boolean verifId(String login, String password)
	{
		int verif = 0;
		
		for(int i = 0; i<2; i++)
		{
			if(this.login[i].equals(login) && this.password[i].equals(password)) verif = 1;
		}
		
		if(verif == 0) return Boolean.FALSE;
		else return Boolean.TRUE;
	}
	
	

}
