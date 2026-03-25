# Architektur des Fußball-Checker Projekts

Dieses Dokument beschreibt die Systemarchitektur des Fußball-Checker Programms.

## Systemkontext

Das Programm ist eine einfache Java-Anwendung zur Verwaltung von Fußball-bezogenen Daten. Es läuft in der Konsole und speichert Daten temporär im Speicher (keine persistente Datenbank).

- **Eingaben**: Keine Benutzereingaben (statische Beispieldaten).
- **Ausgaben**: Konsolen-Ausgabe der Objekte.
- **Externe Systeme**: Keine.

## Komponenten

Das System verwendet eine einfache objektorientierte Struktur:

- **Datenklassen (Model)**: Trainer, Topspieler, Topclub, Erfolg – repräsentieren Daten mit Gettern und Settern.
- **Hauptklasse (Controller/View)**: main.java – erstellt Objekte und gibt sie aus.

## Datenfluss

1. main.java instanziiert Objekte der Datenklassen.
2. Setzt Werte über Setter-Methoden.
3. Ruft toString() auf und druckt in der Konsole.

## Designprinzipien

- **Kapselung**: Private Attribute, öffentliche Getter/Setter.
- **Einfachheit**: Fokussiert auf Grundlagen der OOP.
- **Erweiterbarkeit**: Neue Klassen können leicht hinzugefügt werden.