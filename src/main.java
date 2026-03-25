package Klassen;

/**
 * Hauptklasse des Fußball-Checker Programms.
 * Demonstriert die Erstellung und Ausgabe von Fußball-Objekten.
 */
public class main
{
	public static void main(String[] args)
	{
		// Trainer-Objekt erstellen und setzen
		Trainer myTrainerObject = new Trainer();

		myTrainerObject.setIdTrainer(1);
		myTrainerObject.setTrainerVorname("Jürgen");
		myTrainerObject.setTrainerNachname("Klopp");

		System.out.println("Trainer:");
		System.out.println(myTrainerObject.toString());
		System.out.println();

		// Erfolg-Objekt
		Erfolg myErfolgObject = new Erfolg();

		myErfolgObject.setIdErfolg(1);
		myErfolgObject.setErfolgErfolge("Champions League");

		System.out.println("Erfolg:");
		System.out.println(myErfolgObject.toString());
		System.out.println();

		// Topclub-Objekt
		Topclub myTopclubObject = new Topclub();

		myTopclubObject.setIdTopclub(1);
		myTopclubObject.setTopclubClub("Barcelona");
		myTopclubObject.setTopclubGruendungsjahr("1899");

		System.out.println("Topclub:");
		System.out.println(myTopclubObject.toString());
		System.out.println();

		// Topspieler-Objekt mit Validierung
		Topspieler myTopspielerObject = new Topspieler();

		myTopspielerObject.setIdTopspieler(1);
		myTopspielerObject.setTopspielerVorname("Lionel");
		myTopspielerObject.setTopspielerNachname("Messi");
		myTopspielerObject.setTopspielerAlter(33); // Validierung: muss positiv sein
		myTopspielerObject.setTopspielerPosition("Angriff");

		System.out.println("Topspieler:");
		System.out.println(myTopspielerObject.toString());
	}
}
