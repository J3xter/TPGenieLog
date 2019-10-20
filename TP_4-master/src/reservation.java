import java.util.Date;
import java.util.ArrayList;


enum Etat{
	EN_ATTENTE,
	ANNULEE,
	CONFIRMEE,
	PAYEE,
}

public class reservation{
	public  Date date;
	public Double id;
	public Etat etat;

	/*correspond aux relations 0..* */
	public ArrayList <vol> vols;
	public ArrayList <client> clients;
	public ArrayList <passager> passagers;

	/*fonction pour créer une instance de reservation*/
	public reservation(Date pdate, Double pid, ArrayList <vol> pvols, ArrayList <client> pclients, ArrayList <passager> ppassagers){
		date = pdate;
		id = pid;
		etat = Etat.EN_ATTENTE;
		vols.addAll(pvols);
		clients.addAll(pclients);
		passagers.addAll(ppassagers);

	}

	/*si la reservation est annulee on met son etat comme il le faut*/
	public void annuler(){
		if(getEtat() != Etat.ANNULEE){
			setEtat(Etat.ANNULEE);
		}
		else{
			System.out.println("la réservation est déjà annulée");}

	}

	/*meme idee que precedemment*/
	public void confirmer(){
		if(getEtat() == Etat.EN_ATTENTE){
			setEtat(Etat.ANNULEE);
		}
		else{
			System.out.println("la réservation est déjà annulee ou payeé");}
	}

	/*si la commande est payee on la met en tant que tel*/
	public void payer(){
		if(getEtat() == Etat.CONFIRMEE){
			setEtat(Etat.PAYEE);		
		}
		else{
			System.out.println("la réservation est déjà annulee ou payée");}
	}

	public Date getDate(){
		return this.date;
	}
	
	public Double getId(){
		return this.id;
	}

	public Etat getEtat(){
		return this.etat;
	}

	public void setDate(Date pdate){
		this.date = pdate;
	}
	
	public void setId(Double pid){
		this.id = pid;
	}

	public void setEtat(Etat petat){
		this.etat = petat;
	}

}
