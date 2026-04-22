# Projektverteidigung: Fußball-Checker

**Schulprojekt im Fach Informatik**  
**Entwickelt von: [Ihr Name]**  
**Datum: [Aktuelles Datum]**  
**Klasse/Lehrkraft: [Angaben einfügen]**

## 1. Einleitung

### 1.1 Projektübersicht
Liebe Lehrkraft, liebe Mitschülerinnen und Mitschüler,

heute stelle ich Ihnen mein Schulprojekt "Fußball-Checker" vor. Dieses Projekt wurde im Rahmen des Informatikunterrichts entwickelt und zielt darauf ab, grundlegende Konzepte der objektorientierten Programmierung (OOP) in der Programmiersprache Java anzuwenden. Der Fußball-Checker ist ein konsolenbasiertes Programm, das Fußball-bezogene Entitäten wie Trainer, Topspieler, Vereine und Erfolge modelliert, validiert und ausgibt. Es dient als praktisches Beispiel für die Umsetzung theoretischer Informatik-Konzepte in lauffähigen Code.

Das Projekt basiert auf einer vorgegebenen Template-Struktur, die für schulische Softwareprojekte optimiert ist. Es umfasst eine vollständige Dokumentation, Versionskontrolle mit Git und manuelle Tests, um die Qualitätskriterien zu erfüllen.

### 1.2 Motivation und Relevanz
Fußball ist ein beliebtes Thema, das viele Schüler interessiert und somit die Motivation für die Programmierung steigert. Durch die Modellierung realer Objekte wie Spielern und Trainern können abstrakte OOP-Konzepte greifbar gemacht werden. Dieses Projekt trägt zur Erreichung der Lernziele im Informatik-Lehrplan bei, insbesondere:
- Verständnis von Klassen und Objekten.
- Implementierung von Datenvalidierung.
- Anwendung von Versionskontrolle und Dokumentation.

### 1.3 Projektumfang
Das Projekt ist bewusst einfach gehalten, um den Fokus auf die Kernkonzepte zu legen. Es umfasst:
- Vier Hauptklassen (Topspieler, Trainer, Topclub, Erfolg).
- Eine Hauptklasse (main) zur Demonstration.
- Konsolenausgabe als Benutzerschnittstelle.
- Grundlegende Validierung von Eingabedaten.

## 2. Projektziele und Anforderungen

### 2.1 Ziele
Das Hauptziel war die Entwicklung eines funktionsfähigen Java-Programms, das folgende Aspekte demonstriert:
1. **Objektorientierte Modellierung**: Abbildung von Fußball-Entitäten als Klassen mit Attributen und Methoden.
2. **Datenvalidierung**: Sicherstellung der Datenintegrität durch Überprüfung von Eingaben (z.B. positives Alter).
3. **Ausgabe und Benutzerfreundlichkeit**: Klare, strukturierte Konsolenausgabe der Daten.
4. **Erweiterbarkeit**: Modulare Struktur für zukünftige Erweiterungen.
5. **Dokumentation und Qualität**: Vollständige Dokumentation und manuelle Tests zur Sicherstellung der Funktionalität.

Zusätzlich wurden schulische Ziele wie die Anwendung von Git für Versionskontrolle und die Erstellung professioneller Dokumentation verfolgt.

### 2.2 Anforderungsanalyse
Basierend auf dem Pflichtenheft (siehe `PFLICHTENHEFT.md`) wurden folgende Anforderungen definiert:

- **Funktionale Anforderungen**:
  - Erstellung und Instanziierung von Objekten für alle Entitäten.
  - Setzen und Abrufen von Attributen via Getter/Setter.
  - Validierung kritischer Daten (z.B. Alter ≥ 0).
  - Ausgabe der Objektdaten in lesbarer Form.

- **Nicht-funktionale Anforderungen**:
  - Einfache Bedienbarkeit und Verständlichkeit.
  - Klare Code-Struktur mit Packages und Kommentaren.
  - Dokumentation in deutscher Sprache.
  - Kompatibilität mit Java 11+.

- **Qualitätskriterien**:
  - Korrektheit: Alle Funktionen müssen fehlerfrei arbeiten.
  - Robustheit: Umgang mit ungültigen Eingaben.
  - Wartbarkeit: Sauberer, modularer Code.
  - Vollständigkeit: Alle Anforderungen erfüllt.

## 3. Systemarchitektur und Design

### 3.1 Architekturübersicht
Das System orientiert sich am MVC-Modell (Model-View-Controller), auch wenn es in diesem einfachen Projekt nicht vollständig getrennt ist:
- **Model**: Datenklassen (`Topspieler`, `Trainer`, `Topclub`, `Erfolg`), die die Geschäftslogik und Datenhaltung kapseln.
- **View**: Konsolenausgabe als einfache Benutzerschnittstelle.
- **Controller**: Die `main`-Klasse steuert die Erstellung und Ausgabe der Objekte.

Die Architektur ist modular und folgt Prinzipien wie DRY (Don't Repeat Yourself) und SSOT (Single Source of Truth). Daten werden zentral in den Objekten gehalten, ohne externe Speicherung.

### 3.2 Datenmodell
Das Datenmodell basiert auf den folgenden Klassen:

1. **Topspieler**:
   - Attribute: idTopspieler (int), TopspielerVorname (String), TopspielerNachname (String), TopspielerAlter (int), TopspielerPosition (String).
   - Validierung: Alter muss ≥ 0 sein.

2. **Trainer**:
   - Attribute: idTrainer (int), TrainerVorname (String), TrainerNachname (String).

3. **Topclub**:
   - Attribute: idTopclub (int), TopclubClub (String), TopclubGruendungsjahr (String).

4. **Erfolg**:
   - Attribute: idErfolg (int), ErfolgErfolge (String).

Jede Klasse verfügt über Getter-, Setter-Methoden und eine `toString()`-Methode für die Ausgabe.

### 3.3 Designprinzipien
- **Kapselung**: Attribute sind privat, Zugriff via Methoden.
- **Validierung**: Im Setter für Alter implementiert, um Datenintegrität zu wahren.
- **Lesbarkeit**: Klare Namenskonventionen und Kommentare im Code.

## 4. Implementierung

### 4.1 Technologien und Tools
- **Programmiersprache**: Java (JDK 11+).
- **Entwicklungsumgebung**: Visual Studio Code mit Java-Extensions.
- **Versionskontrolle**: Git für Commit-Historie und Zusammenarbeit.
- **Dokumentation**: Markdown für Handbuch und Pflichtenheft.

### 4.2 Code-Implementierung
Der Code ist in das Package `Klassen` organisiert. Hier ein exemplarischer Ausschnitt der `Topspieler`-Klasse:

```java
package Klassen;

public class Topspieler {
    private int idTopspieler;
    private String TopspielerVorname;
    private String TopspielerNachname;
    private int TopspielerAlter;
    private String TopspielerPosition;

    // Getter und Setter
    public int getIdTopspieler() { return idTopspieler; }
    public void setIdTopspieler(int idTopspieler) { this.idTopspieler = idTopspieler; }

    public String getTopspielerVorname() { return TopspielerVorname; }
    public void setTopspielerVorname(String topspielerVorname) { TopspielerVorname = topspielerVorname; }

    // Validierung im Setter
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

Die `main`-Klasse demonstriert die Nutzung:

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

### 4.3 Projektmanagement
- **Zeitplan**: Entwicklung in mehreren Iterationen: Analyse (1 Woche), Design (1 Woche), Implementierung (2 Wochen), Testing (1 Woche).
- **Risiken**: Komplexität von OOP für Anfänger – gelöst durch schrittweise Umsetzung und Lehrkraft-Unterstützung.
- **Qualitätssicherung**: Regelmäßige Code-Reviews und manuelle Tests.

## 5. Testing und Validierung

### 5.1 Teststrategie
Da automatisierte Tests nicht implementiert wurden, erfolgten manuelle Tests:
- **Unit-Tests**: Einzelne Methoden testen (z.B. Validierung des Alters).
- **Integrationstests**: Vollständige Ausführung der main-Methode.
- **Grenzfalltests**: Ungültige Eingaben (z.B. negatives Alter) prüfen.

### 5.2 Testergebnisse
Beispielausgabe bei korrekter Ausführung:

```
Topspieler:
idTopspieler: 1
TopspielerVorname: Lionel
TopspielerNachname: Messi
TopspielerAlter: 33
TopspielerPosition: Angriff
```

Bei ungültigem Alter (z.B. -5):
```
Fehler: Alter muss positiv sein. Setze auf 0.
```

Alle Tests bestanden; das Programm läuft stabil.

## 6. Herausforderungen und Lösungen

### 6.1 Herausforderungen
1. **Validierung implementieren**: Anfangs unsicher, wie Setter zu erweitern – gelöst durch if-Abfragen.
2. **Code-Organisation**: Packages und Imports richtig verwenden – durch Recherche und Beispiele behoben.
3. **Ausgabe formatieren**: toString() anfangs fehlerhaft – iterativ verbessert.

### 6.2 Gelerntes
Dieses Projekt hat mir geholfen, OOP-Prinzipien praktisch anzuwenden. Ich habe gelernt, wie wichtig Validierung und modulare Struktur sind, und wie Git die Zusammenarbeit erleichtert.

## 7. Erweiterungsmöglichkeiten

Das Projekt ist erweiterbar:
- **Persistenz**: Datenbankintegration (z.B. MySQL) für dauerhafte Speicherung.
- **GUI**: Grafische Oberfläche mit JavaFX.
- **Web-App**: HTML/CSS/JS für Browser-Zugang.
- **Funktionen**: Suchen, Sortieren und Filtern von Daten.

## 8. Fazit und Reflexion

### 8.1 Zusammenfassung
Das Projekt "Fußball-Checker" ist ein erfolgreiches Beispiel für die Anwendung von OOP in Java. Es erfüllt alle Anforderungen, demonstriert Validierung und Ausgabe, und ist gut dokumentiert. Die Entwicklung hat meine Programmierfähigkeiten gestärkt und mir Einblick in den Softwareentwicklungsprozess gegeben.

### 8.2 Persönliche Reflexion
Ich bin stolz auf das Ergebnis und habe viel gelernt: von der Planung bis zur Implementierung. Herausforderungen wie Validierung haben mich motiviert, kreative Lösungen zu finden. Für zukünftige Projekte werde ich automatisierte Tests und erweiterte Funktionen einbeziehen.

### 8.3 Ausblick
Dieses Projekt bildet eine solide Basis für komplexere Anwendungen. Ich danke meiner Lehrkraft für die Unterstützung und meinen Mitschülern für das Feedback.

Vielen Dank für Ihre Aufmerksamkeit. Gibt es Fragen?

---

**Anhänge**:
- Quellcode: `src/fussballchecker/`
- Pflichtenheft: `docs/handbuch/PFLICHTENHEFT.md`
- Architektur: `docs/handbuch/ARCHITEKTUR.md`