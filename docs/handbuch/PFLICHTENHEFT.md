# Pflichtenheft: Schulische Projektvorlage

## Ziele

- Bereitstellung einer standardisierten Template-Struktur für Schulprojekte.
- Vollständige, stabile Dokumentation für Projektmanagement.
- Austauschbarer Quellcode-Bereich mit Beispielimplementierungen.
- Unterstützung für Live-Tests mit Datenbank und Webanwendung.

## Scope

- Top-Level-Struktur: LICENSE, README.md, docs/handbuch/, src/
- Handbuch-Dokumentation: Prozesse, Templates, Marschpläne, Routinen.
- Quellcode: MVC-Struktur, Datenbankzugriff, Web-Komponenten (HTML/CSS/JS, Python/PHP).
- Testumgebung: Docker für MySQL, Skripte für schnellen Start.

## Nicht-Ziele

- Vollständige Anwendung für spezifische Domänen (nur Beispiele).
- Integration mit externen APIs (außer Datenbank).
- Mobile Apps oder komplexe Frameworks.

## Stakeholder

- Schüler: Nutzer der Template für Projekte.
- Lehrkräfte: Anpasser und Betreuer der Projekte.
- Entwickler: Beitragende zum Template.

## Risiken

- Komplexität der Technologien (Java, MySQL, Web) für Anfänger.
- Wartung der Dokumentation bei Änderungen.
- Sicherheitsrisiken bei Datenbank-Tests.

## Qualitätskriterien

- Verständlichkeit: Deutsch, schulgeeignet.
- Vollständigkeit: Alle Prozesse und Templates vorhanden.
- Testbarkeit: Alle Dienste live testbar.
- Wartbarkeit: Klare Struktur, keine Redundanzen.  
- **Alternativen:** Off-the-shelf-Lösungen wie Knowledge Graphs, aber weniger anpassbar.  

## 5. Entwicklungsschritte

1. **Schritt 1: Anforderungsanalyse** – Sammeln und Dokumentieren aller Anforderungen.  
2. **Schritt 2: Systemdesign** – Entwurf der Architektur, Datenmodelle und Schnittstellen.  
3. **Schritt 3: Implementierung der Kernfunktionen** – CRUD, Speicherung, Lernalgorithmen.  
4. **Schritt 4: Sicherheit und Nicht-funktionale Aspekte** – Verschlüsselung, Zugriffe, Performance.  
5. **Schritt 5: Testing** – Unit-Tests, Integrationstests, Sicherheitstests.  
6. **Schritt 6: Dokumentation und Training** – Benutzerhandbuch, API-Docs.  
7. **Schritt 7: Deployment und Monitoring** – Installation, Überwachung.  
8. **Schritt 8: Wartung und Updates** – Regelmäßige Verbesserungen basierend auf Feedback.  

## 6. Risiken und Abhängigkeiten

- **Risiko 1:** Datenverlust – Mitigation: Regelmäßige Backups.  
- **Risiko 2:** Sicherheitslücken – Mitigation: Code-Reviews und Penetrationstests.  
- **Abhängigkeiten:** Java 11+, Datenbankserver, Lernbibliotheken (z.B. TensorFlow).  

## 7. Anhänge

- [Anhang 1: Datenmodell Diagramm]  
- [Anhang 2: API-Spezifikation]  
- [Anhang 3: Testfälle]