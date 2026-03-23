package Klassen;

/*Deklaration einer Klasse: Bauplan für viele Objekte*/
public class Topclub 
{
	

	private int idTopclub;
	private String TopclubClub;
	private String TopclubGruendungsjahr;

	public Topclub(){
			
	}
	


	public String getTopclubGruendungsjahr()
	{
		return TopclubGruendungsjahr;
	}


	public void setTopclubGruendungsjahr
	(String topclubGruendungsjahr)
	{
		TopclubGruendungsjahr = topclubGruendungsjahr;
	}



	public String getTopclubClub()
	{
		return TopclubClub;
	}



	public void setTopclubClub(String topclubClub)
	{
		TopclubClub = topclubClub;
	}



	public int getIdTopclub()
	{
		return idTopclub;
	}



	public void setIdTopclub(int idTopclub)
	{
		this.idTopclub = idTopclub;
	}
	
	public String toString(){
		return "idTopclub: "+ this.idTopclub + "\n"
+				"TopclubClub:" + this.TopclubClub +
"\n" + "TopclubGruendungsjahr:"
				+ this.TopclubGruendungsjahr;
	}
 }

