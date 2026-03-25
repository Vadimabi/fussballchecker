# Fußball-Checker

Ein einfaches Java-Programm zur Verwaltung von Fußball-Daten wie Trainern, Spielern, Clubs und Erfolgen. Dieses Projekt demonstriert grundlegende objektorientierte Programmierung (OOP) und Datenmodellierung.

## Funktionen

- Erstellung und Anzeige von Trainer-, Spieler-, Club- und Erfolgs-Objekten.
- Konsolenbasierte Ausgabe der Daten.
- Einfache Validierung von Eingaben (z.B. Alter muss positiv sein).

## Installation und Ausführung

1. Stelle sicher, dass Java (JDK 11+) installiert ist.
2. Klone das Repository: `git clone https://github.com/Vadimabi/fussballchecker.git`
3. Navigiere in das Verzeichnis: `cd fussballchecker`
4. Kompiliere: `javac src/*.java`
5. Führe aus: `java -cp src Klassen.main`

## Projektstruktur

- `src/`: Java-Quellcode
  - `main.java`: Haupteinstiegspunkt
  - `Trainer.java`, `Topspieler.java`, etc.: Datenklassen
- `docs/Handbuch/`: Dokumentation
  - `Pflichtenheft.md`: Projektanforderungen
  - `ARCHITEKTUR.md`: Systemdesign

## Architektur

Das System folgt einem einfachen Modell-View-Controller (MVC) Ansatz:
- **Model**: Klassen wie Trainer, Topspieler (Datenhaltung).
- **View**: Konsolen-Ausgabe.
- **Controller**: Logik in main.java.

## Beitrag

Für Verbesserungen: Forke das Repo, erstelle einen Branch und öffne einen Pull Request.

## Lizenz

Dieses Projekt ist unter der MIT-Lizenz lizenziert.
