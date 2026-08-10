# Lernpfad: Java + Git Schritt für Schritt

Diese Anleitung führt dich durch beides gleichzeitig: die **Java-Übungen** (von simpel bis zum kleinen Kartenspiel) und den **Git/GitHub-Workflow**, der mit jeder Übung ein Stück wächst. Du baust dein Repository **selbst** auf — genau das ist die Übung.

Voraussetzungen (hast du): macOS, Git, GitHub-Account, VS Code.

> **Tipp für VS Code:** Installiere einmal den „Extension Pack for Java" (von Microsoft). Danach erscheint über jeder `main`-Methode ein kleiner **▶ Run**-Knopf. Fehlt dir noch ein JDK, hilft dir die Extension beim Einrichten (oder installiere „Temurin/OpenJDK 21").

---

## Teil A — Einmalige Einrichtung

**1. Prüfen, ob alles da ist** (Terminal in VS Code: `Terminal → New Terminal`):

```bash
git --version        # sollte eine Versionsnummer zeigen
java -version         # zeigt deine Java-Version (JDK)
```

**2. Git mit deinem Namen verknüpfen** (nur einmal pro Rechner nötig):

```bash
git config --global user.name  "Dein Name"
git config --global user.email "deine@github-mail.de"
git config --global init.defaultBranch main
```

**3. Diesen Übungsordner öffnen:** Entpacke den Ordner und öffne ihn in VS Code (`File → Open Folder…`). Du solltest `src/`, `README.md` usw. sehen.

**4. Leeres Repo auf GitHub anlegen:** Auf github.com → **New repository** → Name z. B. `java-kartenspiel-uebungen` → **ohne** README/`.gitignore` anlegen (die hast du schon) → **Create**. GitHub zeigt dir danach eine URL wie `https://github.com/DEINNAME/java-kartenspiel-uebungen.git` — die brauchst du gleich.

Die eigentliche Verbindung stellst du in **Übung 1** her. Los geht's.

---

## Teil B — Die Übungen (mit wachsenden Git-Schritten)

Arbeite **eine Übung nach der anderen** ab. Jede hat einen *Java-Teil* (Datei in `src/` öffnen, TODOs füllen, ▶ Run bis alles `[PASS]`) und einen *Git-Teil*.

### Übung 1 · `HalloJava.java` — Git-Grundlagen: das erste Mal committen & pushen

*Java:* `begruessung` und `quadrat` implementieren, bis der Selbsttest grün ist.

*Git:* Aus deinem Ordner ein Repo machen und mit GitHub verbinden:

```bash
git init                     # macht aus dem Ordner ein Git-Repo
git add .                    # alle Dateien vormerken
git commit -m "Start: Übungsgeruest und HalloJava"
git remote add origin https://github.com/DEINNAME/java-kartenspiel-uebungen.git
git branch -M main
git push -u origin main      # erstes Hochladen zu GitHub
```

Beim ersten `push` fragt GitHub nach Login — melde dich im aufpoppenden Browserfenster an (VS Code merkt sich das). Danach: Seite auf GitHub neu laden → deine Dateien sind da. 🎉

### Übung 2 · `Rechner.java` — der tägliche Zyklus: status → add → commit → push

*Java:* die vier Rechen-Methoden, `dividiere`, `istGerade`, `groesserVon`.

*Git:* Merke dir diesen Dreiklang — den nutzt du ab jetzt ständig:

```bash
git status                   # zeigt: Rechner.java wurde geändert
git diff                     # zeigt Zeile für Zeile, WAS du geändert hast
git add src/Rechner.java
git commit -m "Rechner: alle Methoden implementiert"
git push
```

### Übung 3 · `Schleifen.java` — Branches & Pull Requests (der wichtigste Schritt!)

Im Team arbeitet **niemand direkt auf `main`**. Man macht einen eigenen Branch, und führt ihn per *Pull Request* zusammen. Übe das jetzt allein:

```bash
git switch -c uebung/schleifen     # neuen Branch anlegen + hinwechseln
# ... jetzt Schleifen.java lösen (Run bis grün) ...
git add src/Schleifen.java
git commit -m "Schleifen: summeBis, fakultaet, fizzbuzz"
git push -u origin uebung/schleifen
```

Dann auf GitHub: Es erscheint ein Button **„Compare & pull request"** → anklicken → **Create pull request** → **Merge pull request** → **Confirm**. Damit ist dein Branch in `main` gelandet. Zum Schluss lokal aufholen:

```bash
git switch main
git pull                            # holt den gemergten Stand von GitHub
```

### Übung 4 · `Wuerfel.java` — Branch-Flow selbst wiederholen

Mach den kompletten Ablauf aus Übung 3 nun **ohne Spickzettel**: Branch `uebung/wuerfel` → lösen → add/commit/push → Pull Request → merge → `main` pullen.

*Nebenbei:* Führe `git status` aus, während VS Code läuft — dank `.gitignore` tauchen `.class`-Dateien und `.vscode/` **nicht** auf. Genau so soll es sein (kompilierte Dateien gehören nie ins Repo).

### Übung 5 · `Karte.java` — Historie ansehen & letzte Nachricht korrigieren

Branch `uebung/karte`, `Karte` implementieren. Neue Git-Werkzeuge:

```bash
git log --oneline            # deine Commit-Historie auf einen Blick
git commit -m "Karte gemacht"        # (bewusst schlechte Nachricht)
git commit --amend -m "Karte: Konstruktor, getter, toString, istHoeherAls"
```

`--amend` ersetzt die **letzte** Commit-Nachricht (nur machen, solange noch nicht gepusht!). Danach normal pushen und per Pull Request mergen.

### Übung 6 · `Deck.java` — Änderungen verwerfen (der Rettungsknopf)

Branch `uebung/deck`. Probiere bewusst aus, wie man Mist wegwirft:

```bash
# Du hast in einer Datei rumprobiert und willst zurück zum letzten Commit:
git restore src/Deck.java    # verwirft NICHT-committete Änderungen dieser Datei
```

Dann `Deck` richtig lösen, committen, pushen, mergen.

### Übung 7 · `Spieler.java` — Routine

Branch `uebung/spieler`, lösen, der ganze Flow. Das sollte jetzt sitzen. Wenn du magst, schreib die Commits in mehreren kleinen Schritten (z. B. erst `nimmKarte`/`handGroesse`, committen, dann `punkte`, committen).

### Übung 8 · `MiniSpiel.java` — Abschluss + (optional) einen Merge-Konflikt üben

Branch `uebung/minispiel`, `austeilen` und `rundenGewinner` implementieren, Run → erst grüner Selbsttest, dann läuft ein echtes „Krieg"-Spiel in der Konsole. 🎮 Mergen wie gewohnt.

**Optional (sehr nützlich fürs Team):** einen Merge-Konflikt provozieren und lösen. Ändere dieselbe Zeile in zwei Branches unterschiedlich:

```bash
git switch main
git switch -c konflikt-test-a
# in README.md die erste Zeile leicht ändern -> commit
git switch main
git switch -c konflikt-test-b
# dieselbe Zeile ANDERS ändern -> commit
git switch konflikt-test-a
git merge konflikt-test-b     # -> CONFLICT
```

VS Code markiert die Konfliktstelle mit `<<<<<<<`, `=======`, `>>>>>>>` und bietet Knöpfe „Accept Current / Incoming / Both". Aussuchen, speichern, `git add`, `git commit` — fertig. Genau das passiert im Team ständig; einmal geübt nimmt es den Schrecken.

---

## Teil C — Tipps für die Gruppenarbeit (nächstes Trimester)

- **Immer auf einem Branch arbeiten**, nie direkt auf `main`. Ein Branch = eine Aufgabe.
- **Vor dem Loslegen `git pull`** auf `main`, damit du den neuesten Stand hast.
- **Kleine, häufige Commits** mit klaren Nachrichten — leichter nachvollziehbar und weniger Konflikte.
- **Pull Requests** nutzen: die anderen sehen deine Änderung, bevor sie in `main` kommt (Code Review).
- **`.gitignore` pflegen**, damit keine `.class`-Dateien, IDE-Ordner oder `.DS_Store` im Repo landen.
- **Reden hilft:** Wer arbeitet an welcher Datei? So vermeidet ihr, dass zwei dieselbe Zeile ändern.

Befehle zum Nachschlagen: `GIT_SPICKZETTEL.md` · Musterlösungen (erst selbst probieren!): `LOESUNGEN.md`
