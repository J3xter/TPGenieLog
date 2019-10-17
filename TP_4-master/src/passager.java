public class passager{

	private String nom;
	private String contact;

	public passager(String pnom, String pcontact){

		this.nom = pnom;
		this.contact = pcontact;
	}

	public String getNom(){
		return this.nom;
	}
	
	public String getContact(){
		return this.contact;
	}
	
	public void setNom(String pnom){
		this.nom = pnom;
	}
	
	public void setContact(String pcontact){
		this.contact = pcontact;
	}


	



}
