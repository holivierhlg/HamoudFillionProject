package src.Model;

public class Conges {

	private static Conges instance = null;
	private Boolean jours [] ;
	
	/**
	* Private constructor
	*/
	private Conges() {
		
		jours = new Boolean [365];
		
		for (int i=0; i<jours.length; i++) {
			jours[i]=Boolean.TRUE;
		}
	}
	
	/**
	* @return an instance
	*/
	public static Conges instance() {
	
		if(instance==null)
			instance = new Conges();
		
		return instance;
	}
	
	/**
	* @param jour du cong�
	* @return vrai si le jour est dispo false si le jour est pris ou la valeur de jour n'est pas valide
	*/
	public boolean verifierJour(int jour) {
		
		if((jour<365) && (jour>=0))
			return jours[jour].booleanValue();
		
		return Boolean.FALSE;
	}
	
	/**
	* @param jour du cong�
	* La fonction permet de poser un jour de cong�
	*/
	public void poserJour(int jour) {
		jours[jour]=Boolean.FALSE;
	}

}
