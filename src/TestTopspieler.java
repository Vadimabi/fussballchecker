package Klassen;

/**
 * Einfache Testklasse für Topspieler.
 */
public class TestTopspieler {
    public static void main(String[] args) {
        Topspieler spieler = new Topspieler();
        spieler.setIdTopspieler(1);
        spieler.setTopspielerVorname("Test");
        spieler.setTopspielerNachname("Spieler");
        spieler.setTopspielerAlter(25);
        spieler.setTopspielerPosition("Mitte");

        System.out.println("Test erfolgreich:");
        System.out.println(spieler.toString());

        // Test Validierung
        spieler.setTopspielerAlter(-5); // Sollte Fehler ausgeben
        System.out.println("Alter nach Validierung: " + spieler.getTopspielerAlter());
    }
}