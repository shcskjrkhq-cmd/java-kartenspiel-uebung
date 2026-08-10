# Git-Spickzettel

Die Befehle, die du im Alltag zu 90 % brauchst.

## Zustand ansehen
```bash
git status            # was ist geändert / bereit zum Commit?
git diff              # was genau habe ich geändert (noch nicht "added")?
git log --oneline     # Commit-Historie kurz
```

## Änderungen sichern (der tägliche Zyklus)
```bash
git add DATEI         # Datei für den Commit vormerken  (git add .  = alles)
git commit -m "Text"  # Schnappschuss mit Nachricht speichern
git push              # zu GitHub hochladen
```

## Branches (für jedes Feature ein eigener Ast)
```bash
git switch -c mein-feature   # neuen Branch anlegen + hinwechseln
git switch main              # zurück zum Hauptbranch
git branch                   # alle Branches anzeigen
git push -u origin mein-feature   # Branch das erste Mal hochladen
```

## Vom Team holen
```bash
git pull              # neueste Änderungen von GitHub holen (fetch + merge)
```

## Rückgängig / retten
```bash
git restore DATEI            # Änderungen an DATEI verwerfen (vor dem add)
git restore --staged DATEI   # "add" zurücknehmen (Datei bleibt geändert)
git commit --amend -m "neu"  # letzte Commit-Nachricht korrigieren
```

## Einmalige Einrichtung
```bash
git config --global user.name  "Dein Name"
git config --global user.email "deine@mail.de"
git config --global init.defaultBranch main
```

## Gute Commit-Nachrichten
- Kurz, im Imperativ, sagt *was* sich ändert: `"Karte: toString und istHoeherAls implementiert"`.
- Lieber viele kleine Commits als ein riesiger.
