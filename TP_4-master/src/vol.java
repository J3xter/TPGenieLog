import java.time.*;

public class vol{

	private String identifiant[];
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	/* ajout d'un attribut status pour mieux controler l'ouverture d'un vol */ 
	private boolean status;

	/* fonction d'instance de vol */
	public vol(String id[], ZonedDateTime pdepart, ZonedDateTime parrivee ){
		
		for(int i=0; i < id.length; i++){
			identifiant[i] = id[i];
		}
		depart = pdepart;
		arrivee = parrivee;
		status = false;
	}
	/* fonction duree renvoie en duration l'écart entre deux zoneddatetime passes en parametres*/
	public Duration duree(){

		return Duration.between(this.depart, this.arrivee);
	}
	/* fonction ouvrir a l'ouverture le vol est disponible et existant donc true*/
	public void ouvrir(){
		
		this.status = true;
	}
	/* fonction fermer on ferme le vol qui n'est pas disponible donc false*/
	public void fermer(){
		
		this.status = false;
	}
	/* les get et set pour acceder aux attributs et les modifier */
	public String getIdentifiant(int i){
		return this.identifiant[i];
	}
	public ZonedDateTime getArrivee(){
		return this.arrivee;
	}
	public ZonedDateTime getDepart(){
		return this.depart;
	}

	public boolean getStatus(){
		return this.status;
	}

	public void setArrivee(ZonedDateTime pArrivee){
		this.arrivee=pArrivee;
	}
	public void setDepart(ZonedDateTime pDepart){
		this.depart=pDepart;
	}
}
