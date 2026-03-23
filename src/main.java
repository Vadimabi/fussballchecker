package Klassen;

public class main
{

	public static void main(String[] args)
	{
		Trainer myTrainerObject = new Trainer();
		
		myTrainerObject.setIdTrainer(1);
		myTrainerObject.setTrainerVorname("Jürgen");
		myTrainerObject.setTrainerNachname("Klopp");
		
		System.out.println(myTrainerObject.toString());
		
		
		Erfolg myErfolgObject = new Erfolg();
		
		myErfolgObject.setIdErfolg(1);
		myErfolgObject.setErfolgErfolge("Champions League");
		
		System.out.println(myErfolgObject.toString());
		
		Topclub myTopclubObject = new Topclub();
		
		myTopclubObject.setIdTopclub(1);
		myTopclubObject.setTopclubClub("Barcelona");
		myTopclubObject.setTopclubGruendungsjahr("1899");
		
		System.out.println(myTopclubObject.toString());
		
		
		Topspieler myTopspielerObject = new Topspieler();
		
		myTopspielerObject.setIdTopspieler(1);
		myTopspielerObject.setTopspielerVorname("Lionel");
		myTopspielerObject.setTopspielerNachname("Messi");
		myTopspielerObject.setTopspielerAlter(33);
		myTopspielerObject.setTopspielerPosition("Angriff");
		
		System.out.println(myTopspielerObject.toString());
		
	}

}
