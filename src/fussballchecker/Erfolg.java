package Klassen;

/*Deklaration einer Klasse:
 *  Bauplan für viele Objekte*/
public class Erfolg 
{
	

	private int idErfolg;
	private String erfolgErfolge;
	

	public Erfolg(){
			
	}
	
	
	public void setIdErfolg (int pIdErfolg){
		this.idErfolg = pIdErfolg;
	}
	
	public void setErfolgErfolge (String pErfolgErfolge){
		this.erfolgErfolge = pErfolgErfolge;
	}
	
	
	public int getIdErfolg(){
		return this.idErfolg;
	}
	
	public String getErfolgErfolge(){
		return this.erfolgErfolge;
	}
	
	
	public String toString(){
		return "idErfolg: "+ this.idErfolg + "\n"
+				"ErfolgErfolge:" + this.erfolgErfolge;
	}
 }

