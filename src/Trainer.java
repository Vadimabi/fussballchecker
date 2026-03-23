package Klassen;

/*Deklaration einer Klasse: Bauplan für viele Objekte*/
public class Trainer 
{
	

	private int idTrainer;
	private String trainerVorname;
	private String trainerNachname;
	

	public Trainer(){
			
	}
	
	
	public void setIdTrainer (int pIdTrainer){
		this.idTrainer = pIdTrainer;
	}
	
	public void setTrainerVorname (String pTrainerVorname){
		this.trainerVorname = pTrainerVorname;
	}
	
	public void setTrainerNachname (String pTrainerNachname){
		this.trainerNachname = pTrainerNachname;
	}
	
	public int getIdTrainer(){
		return this.idTrainer;
	}
	
	public String getTrainerVorname(){
		return this.trainerVorname;
	}
	
	public String getTrainerNachname(){
		return this.trainerNachname;
	}
	
	public String toString(){
		return "idTrainer: "+ this.idTrainer + "\n" +
				"TrainerVorname:" + this.trainerVorname + "\n"
				+ "TrainerNachname:" + this.trainerNachname;
	}
 }

