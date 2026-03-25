# Prozess: Schnellstart und Test

## Schritt-für-Schritt-Anleitung

1. **Voraussetzungen prüfen**: Java 11+, Docker installiert.
2. **Repository klonen**: `git clone <url>`
3. **Docker starten**: `docker-compose up -d` (startet MySQL).
4. **Java kompilieren**: `javac src/beispielprojekt/model/*.java src/beispielprojekt/controller/*.java`
5. **Java ausführen**: `java -cp src beispielprojekt.controller.Main`
6. **Web testen**: Öffne `http://localhost:8080` (falls Web-Server läuft).
7. **Python-Skript**: `python src/beispielprojekt/scripts/test.py`
8. **PHP-Skript**: `php src/beispielprojekt/scripts/test.php`
9. **Datenbank testen**: Verbinde zu MySQL auf localhost:3306.

## Test der einzelnen Dienste

- **Java**: Konsolen-Ausgabe prüfen.
- **MySQL**: Query ausführen: `SELECT * FROM tasks;`
- **Web**: Seite laden und Interaktion testen.
- **Python/PHP**: Skript-Ausgabe prüfen.

## Fehlerbehebung

- Port-Konflikte: Ports anpassen in docker-compose.yml.
- Java-Fehler: JDK-Version prüfen.