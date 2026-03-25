package Klassen;

public class Topspieler
{
	private int idTopspieler;
	private String TopspielerVorname;
	private String TopspielerNachname;
	private int TopspielerAlter;
	private String TopspielerPosition;
	private String Trainer;
	
	public int getIdTopspieler()
	{
		return idTopspieler;
	}
	public void setIdTopspieler(int idTopspieler)
	{
		this.idTopspieler = idTopspieler;
	}
	
	
	public String getTopspielerVorname()
	{
		return TopspielerVorname;
	}
	public void setTopspielerVorname(String topspielerVorname)
	{
		TopspielerVorname = topspielerVorname;
	}
	
	
	public String getTopspielerNachname()
	{
		return TopspielerNachname;
	}
	public void setTopspielerNachname(String topspielerNachname)
	{
		TopspielerNachname = topspielerNachname;
	}
	
	
	public int getTopspielerAlter()
	{
		return TopspielerAlter;
	}
	public void setTopspielerAlter(int topspielerAlter)
	{
		if (topspielerAlter >= 0) {
			TopspielerAlter = topspielerAlter;
		} else {
			System.out.println("Fehler: Alter muss positiv sein. Setze auf 0.");
			TopspielerAlter = 0;
		}
	}
	
	
	public String getTopspielerPosition()
	{
		return TopspielerPosition;
	}
	public void setTopspielerPosition(String topspielerPosition)
	{
		TopspielerPosition = topspielerPosition;
	}
	public String toString(){
		return "idTopspieler: "+ this.idTopspieler + "\n" +
				"TopspielerVorname:" + this.TopspielerVorname 
				+ "\n" + "TopspielerNachname" +
				this.TopspielerNachname + "\n" +
				"TopspielerAlter:" + this.TopspielerAlter + "\n" +
				"TopspielerPosition:" + this.TopspielerPosition;
	}
}