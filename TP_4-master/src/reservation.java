import java.util.Date;


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


	public reservation(Date pdate, Double pid){
		date = pdate;
		id = pid;
		etat = Etat.EN_ATTENTE;

	}
	public void annuler(){
		if(getEtat() != Etat.ANNULEE){
			setEtat(Etat.ANNULEE);
		}
		else{
			System.out.println("la reservation est déjà annulee");}

	}

	public void confirmer(){
		if(getEtat() == Etat.EN_ATTENTE){
			setEtat(Etat.ANNULEE);
		}
		else{
			System.out.println("la reservation est déjà annulee ou payee");}
	}

	public void payer(){
		if(getEtat() == Etat.CONFIRMEE){
			setEtat(Etat.PAYEE);		
		}
		else{
			System.out.println("la reservation est déjà annulee ou payee");}
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
