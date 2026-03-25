# Schulische Projektvorlage

Dieses Repository dient als didaktische Projekt-Template-Repo für schulische Softwareprojekte. Es bietet eine stabile Dokumentationsstruktur und einen austauschbaren Quellcode-Bereich für verschiedene Schülerprojekte.

## Zweck des Templates

- Bereitstellung einer standardisierten Struktur für Schulprojekte.
- Vollständige Handbuch-Dokumentation für Projektmanagement und Prozesse.
- Austauschbarer `src/`-Bereich mit Beispielprojekten (z.B. Fußball-Checker und neutrales Beispielprojekt).
- Unterstützung für Live-Tests mit Datenbank und Webanwendung.

## Ein neues Schülerprojekt starten

1. Klone dieses Repository: `git clone https://github.com/Vadimabi/fussballchecker.git`
2. Entferne oder ersetze den Inhalt von `src/` mit deinem Projekt.
   - Verwende `src/<projektname>/` für dein Projekt (z.B. `src/meinprojekt/`).
   - Halte MVC-Trennung ein: `model/`, `view/`, `controller/`.
3. Passe die Dokumentation in `docs/handbuch/` an dein Projekt an.
4. Für Tests: Folge der [Schnellstart-Anleitung](docs/handbuch/prozesse/schnellstart-und-test.md).

## Verwendung der Handbuch-Doku

Die Dokumentation in `docs/handbuch/` enthält:
- [README.md](docs/handbuch/README.md): Quick-Start und Übersicht.
- [INDEX.md](docs/handbuch/INDEX.md): Vollständiges Inhaltsverzeichnis.
- Prozesse, Templates und Marschpläne für Projektmanagement.

## Kurzanleitung für Branch/PR/Review

1. Erstelle einen Feature-Branch: `git checkout -b feature/meine-funktion`
2. Commite deine Änderungen: `git commit -m "Beschreibung"`
3. Pushe den Branch: `git push origin feature/meine-funktion`
4. Öffne einen Pull Request auf GitHub.
5. Warte auf Review und merge nach Genehmigung.

## Beispielprojekte

- `src/fussballchecker/`: Einfache Java-Konsolen-App für Fußball-Daten.
- `src/beispielprojekt/`: Neutrales Beispiel mit MVC und Datenbank/Web-Unterstützung.

## Lizenz

Dieses Projekt ist unter der MIT-Lizenz lizenziert.
