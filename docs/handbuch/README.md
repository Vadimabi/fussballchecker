# Handbuch-README

## Quick-Start in 5 Minuten

1. **Repository klonen**: `git clone <url>`
2. **Java installieren**: Stelle sicher, JDK 11+ ist vorhanden.
3. **Projekt kompilieren**: `javac src/fussballchecker/*.java`
4. **Ausführen**: `java -cp src Klassen.main`
5. **Testen**: Folge der [Schnellstart-Anleitung](prozesse/schnellstart-und-test.md) für Datenbank und Web.

## Links auf Prozesse, Templates und Marschplan

- [Hauptmarschplan](marschplaene/HAUPTMARSCHPLAN.md)
- [Prozesse](prozesse/):
  - [Neue Routine erstellen](prozesse/neue-routine-erstellen.md)
  - [Review-Prozess](prozesse/review-prozess.md)
- [Templates](templates/):
  - [Routine-Template](templates/ROUTINE-TEMPLATE.md)

## Kurze Strukturübersicht

- `docs/handbuch/`: Vollständige Projekt-Dokumentation.
- `src/<projektname>/`: Austauschbarer Quellcode mit MVC-Struktur.
- `docker-compose.yml`: Für Datenbank-Tests.

## Best Practices

- Halte Code modular und dokumentiert.
- Verwende Branches für Änderungen.
- Teste regelmäßig mit den bereitgestellten Skripten.