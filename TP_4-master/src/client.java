
public class client {

	private String nom;
	private String contact;
	private String paiement;
	private String reference;

	public client(String pnom, String ppaiement, String pcontact, String pref){
		nom = pnom;
		paiement = ppaiement;
		contact = pcontact;
		reference = pref;
	}

	/* les getters */
	public String getNom(){
		return this.nom;
	}
	
	public String getpaiement(){
		return this.paiement;
	}

	public String getContact(){
		return this.contact;
	}

	public String getRef(){
		return this.reference;
	}
	/* les setters */
	public void setNom(String pnom){
		 this.nom = pnom;
	}
	
	public void setpaiement(String ppaiement){
		this.paiement = ppaiement;
	}

	public void setContact(String pcontact){
		this.contact = pcontact;
	}

	public void setRef(String pref){
		this.reference = pref;
	}

	


}
