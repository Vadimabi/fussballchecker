# Projektverteidigung: Fußball-Checker

## Einleitung

Liebe Zuhörerinnen und Zuhörer,

heute möchte ich Ihnen mein Projekt "Fußball-Checker" vorstellen. Dieses Projekt wurde im Rahmen meines Informatikunterrichts entwickelt und dient als Beispiel für die Anwendung objektorientierter Programmierung in Java. Der Fußball-Checker ist ein einfaches Programm, das Fußball-bezogene Daten modelliert und verwaltet, wie Trainer, Spieler, Vereine und Erfolge. Es demonstriert grundlegende Konzepte der Softwareentwicklung, einschließlich Klassen, Objekten, Validierung und Ausgabe.

## Projektziele

Das Hauptziel dieses Projekts war es, ein funktionsfähiges Programm zu erstellen, das:

1. **Objektorientierte Modellierung**: Verschiedene Entitäten des Fußballs (Trainer, Topspieler, Topclub, Erfolg) als Klassen darstellt.
2. **Datenvalidierung**: Sicherstellt, dass eingegebene Daten sinnvoll sind, z.B. positives Alter für Spieler.
3. **Ausgabe und Darstellung**: Die Daten in einer lesbaren Form auf der Konsole ausgibt.
4. **Erweiterbarkeit**: Eine Struktur bietet, die leicht um weitere Funktionen erweitert werden kann.

Zusätzlich sollte das Projekt die Verwendung von Versionskontrolle (Git), Dokumentation und Testing demonstrieren.

## Anforderungsanalyse

Basierend auf dem Pflichtenheft wurden folgende Anforderungen definiert:

- **Funktionale Anforderungen**:
  - Erstellung von Objekten für Trainer, Erfolg, Topclub und Topspieler.
  - Setzen von Attributen wie Name, Alter, Position usw.
  - Validierung von Eingabedaten (z.B. Alter muss positiv sein).
  - Ausgabe der Objektdaten auf der Konsole.

- **Nicht-funktionale Anforderungen**:
  - Einfache Bedienbarkeit.
  - Klare, verständliche Code-Struktur.
  - Dokumentation in Deutsch.

## Systemarchitektur

Das System folgt dem MVC-Modell (Model-View-Controller), obwohl in diesem einfachen Beispiel die Trennung nicht vollständig implementiert ist:

- **Model**: Die Klassen wie `Topspieler`, `Trainer`, `Topclub` und `Erfolg` repräsentieren die Datenmodelle. Jede Klasse hat Getter- und Setter-Methoden sowie eine `toString()`-Methode für die Ausgabe.
- **View**: Die Konsolenausgabe dient als View, wo die Daten angezeigt werden.
- **Controller**: Die `main`-Klasse fungiert als Controller, indem sie die Objekte erstellt, Daten setzt und die Ausgabe steuert.

Die Architektur ist modular aufgebaut, was eine einfache Erweiterung ermöglicht. Zum Beispiel könnte man eine Datenbankintegration hinzufügen, um die Daten persistent zu speichern.

## Implementierung

### Klassenübersicht

1. **Topspieler**: Repräsentiert einen Top-Fußballspieler mit Attributen wie ID, Vorname, Nachname, Alter und Position. Das Alter wird validiert, um sicherzustellen, dass es nicht negativ ist.

2. **Trainer**: Modelliert einen Fußballtrainer mit ID, Vorname und Nachname.

3. **Topclub**: Stellt einen Top-Fußballverein dar, mit ID, Clubname und Gründungsjahr.

4. **Erfolg**: Beschreibt einen Erfolg, z.B. einen Titelgewinn, mit ID und Beschreibung.

5. **main**: Die Hauptklasse, die Instanzen dieser Klassen erstellt, Daten setzt und ausgibt.

### Code-Beispiele

Hier ein Beispiel für die `Topspieler`-Klasse:

```java
public class Topspieler {
    private int idTopspieler;
    private String TopspielerVorname;
    private String TopspielerNachname;
    private int TopspielerAlter;
    private String TopspielerPosition;

    // Getter und Setter mit Validierung für Alter
    public void setTopspielerAlter(int topspielerAlter) {
        if (topspielerAlter >= 0) {
            TopspielerAlter = topspielerAlter;
        } else {
            System.out.println("Fehler: Alter muss positiv sein. Setze auf 0.");
            TopspielerAlter = 0;
        }
    }

    // toString für Ausgabe
    public String toString() {
        return "idTopspieler: " + this.idTopspieler + "\n" +
               "TopspielerVorname: " + this.TopspielerVorname + "\n" +
               "TopspielerNachname: " + this.TopspielerNachname + "\n" +
               "TopspielerAlter: " + this.TopspielerAlter + "\n" +
               "TopspielerPosition: " + this.TopspielerPosition;
    }
}
```

In der `main`-Methode werden Objekte erstellt und ausgegeben:

```java
public static void main(String[] args) {
    Topspieler myTopspielerObject = new Topspieler();
    myTopspielerObject.setIdTopspieler(1);
    myTopspielerObject.setTopspielerVorname("Lionel");
    myTopspielerObject.setTopspielerNachname("Messi");
    myTopspielerObject.setTopspielerAlter(33);
    myTopspielerObject.setTopspielerPosition("Angriff");
    System.out.println("Topspieler:");
    System.out.println(myTopspielerObject.toString());
}
```

### Technologien

- **Programmiersprache**: Java (Version 11+)
- **Entwicklungsumgebung**: VS Code mit Java-Extensions
- **Versionskontrolle**: Git
- **Dokumentation**: Markdown-Dateien

## Testing

Das Projekt wurde manuell getestet:

- **Unit-Tests**: Überprüfung der Validierung (z.B. negatives Alter wird auf 0 gesetzt).
- **Integrationstests**: Vollständige Ausführung der `main`-Methode und Überprüfung der Konsolenausgabe.
- **Grenzfalltests**: Testen mit ungültigen Eingaben, um die Robustheit zu prüfen.

Beispielausgabe:

```
Topspieler:
idTopspieler: 1
TopspielerVorname: Lionel
TopspielerNachname: Messi
TopspielerAlter: 33
TopspielerPosition: Angriff
```

## Herausforderungen und Lösungen

Während der Entwicklung traten folgende Herausforderungen auf:

1. **Validierung**: Die Implementierung der Altersvalidierung erforderte eine if-Abfrage im Setter. Dies wurde erfolgreich umgesetzt, um Datenintegrität zu gewährleisten.

2. **Code-Struktur**: Sicherstellung einer klaren Trennung der Klassen. Durch die Verwendung von Packages (`Klassen`) wurde dies erreicht.

3. **Ausgabeformatierung**: Die `toString()`-Methode musste sorgfältig formatiert werden, um lesbare Ausgaben zu erzeugen.

## Erweiterungsmöglichkeiten

Das Projekt bietet Raum für Erweiterungen:

- **Datenbankintegration**: Hinzufügen von MySQL zur persistenten Speicherung der Daten.
- **GUI**: Entwicklung einer grafischen Benutzeroberfläche mit JavaFX oder Swing.
- **Web-Interface**: Integration von HTML/CSS/JS für eine Webanwendung.
- **Zusätzliche Funktionen**: Suchen, Filtern und Sortieren von Spielern.

## Fazit

Das Projekt "Fußball-Checker" hat mir ermöglicht, grundlegende Konzepte der objektorientierten Programmierung anzuwenden und ein funktionsfähiges Programm zu entwickeln. Es demonstriert die Bedeutung von Validierung, Modularität und klarer Dokumentation in der Softwareentwicklung. Ich bin stolz auf das Ergebnis und sehe Potenzial für weitere Entwicklungen.

Vielen Dank für Ihre Aufmerksamkeit. Gibt es Fragen?