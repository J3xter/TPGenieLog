import java.time.ZonedDateTime;

public class vol{

	private String identifiant[];
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;

	public vol(  ){

	}
	
	public String getIdentifiant(int i){
		return this.identifiant[i];
	}
	public ZonedDateTime getArrivee(){
		return this.arrivee;
	}
	public ZonedDateTime getDepart(){
		return this.depart;
	}

	public void setArrivee(ZonedDateTime pArrivee){
		this.arrivee=pArrivee;
	}
	public void setDepart(ZonedDateTime pDepart){
		this.depart=pDepart;
	}
}
