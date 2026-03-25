# Architektur der Projektvorlage

## Systemkontext

Die Projektvorlage unterstützt schulische Softwareprojekte mit Java-Backend, Datenbankzugriff (MySQL/JSON), und Webanwendung (HTML/CSS/JS, Python/PHP). Es läuft in einem Docker-Container für Tests.

- **Eingaben**: Benutzer über Web-Interface oder Konsole.
- **Ausgaben**: Konsolen-Ausgabe, Web-Interface, Datenbank-Queries.
- **Externe Systeme**: MySQL-Datenbank via Docker.

## Komponenten

- **Model**: Datenklassen (z.B. Trainer, Task) mit Validierung.
- **View**: Konsolen-Ausgabe, HTML/CSS/JS für Web.
- **Controller**: Logik in Java, Python/PHP-Skripte.
- **Datenbank**: MySQL für persistente Daten.
- **Web-Server**: Einfacher HTTP-Server in Java oder Python.

## Datenfluss

1. Benutzer interagiert über Web oder Konsole.
2. Controller verarbeitet Anfragen, validiert Daten.
3. Model speichert/abruft aus Datenbank.
4. View zeigt Ergebnisse an.

## Designprinzipien

- **DRY (Don't Repeat Yourself)**: Wiederverwendung von Code, keine Duplikate.
- **SSOT (Single Source of Truth)**: Daten zentral in Datenbank.
- **Modularität**: Klare Trennung von Model, View, Controller; kleine, verständliche Klassen.