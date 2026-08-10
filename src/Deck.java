import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* =====================================================================
 *  LEVEL 3 - Uebung 6: Deck        (ArrayList, verschachtelte Schleifen)
 * =====================================================================
 *  Ziel: ein komplettes 52-Karten-Deck verwalten. Baut auf Karte auf.
 *
 *   a) Konstruktor: erzeuge alle 52 Karten (jede Farbe x jeder Wert).
 *      Tipp: for (Farbe f : Farbe.values()) for (Wert w : Wert.values()) ...
 *   b) anzahl(): Anzahl der Karten im Deck
 *   c) istLeer(): true, wenn keine Karte mehr da ist
 *   d) mischen(): Karten zufaellig mischen (Collections.shuffle(karten))
 *   e) ziehen(): oberste Karte ENTFERNEN und zurueckgeben; bei leerem Deck null
 *
 *  Ersetze jedes "// TODO" und druecke RUN. Loesung: LOESUNGEN.md
 * ===================================================================== */

public class Deck {

    private final ArrayList<Karte> karten = new ArrayList<>();

    public Deck() {
        // TODO a: alle 52 Karten in "karten" einfuegen
    }

    public int anzahl() { return 0; /* TODO b */ }

    public boolean istLeer() { return true; /* TODO c */ }

    public void mischen() { /* TODO d */ }

    public Karte ziehen() {
        // TODO e
        return null;
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        pruef("a/b) 52 Karten", d.anzahl() == 52);

        Deck d2 = new Deck();
        HashSet<String> gesehen = new HashSet<>();
        boolean alleVerschieden = true;
        for (int i = 0; i < 52; i++) {
            Karte k = d2.ziehen();
            if (k == null || !gesehen.add(k.toString())) alleVerschieden = false;
        }
        pruef("e) alle 52 Karten verschieden", alleVerschieden && gesehen.size() == 52);
        pruef("c/e) nach 52x ziehen ist das Deck leer", d2.istLeer());

        Deck d3 = new Deck();
        d3.ziehen();
        pruef("e) nach 1x ziehen sind 51 uebrig", d3.anzahl() == 51);
        fazit();
    }

    private static int ok = 0, no = 0;
    private static void pruef(String name, boolean b) { System.out.println((b ? "[PASS] " : "[FAIL] ") + name); if (b) ok++; else no++; }
    private static void fazit() { System.out.println("-----  " + ok + " PASS / " + no + " FAIL"); }
}
