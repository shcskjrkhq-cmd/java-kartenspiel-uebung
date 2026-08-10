/* =====================================================================
 *  LEVEL 3 - Uebung 8: MiniSpiel "Krieg"    (alles zusammen) - ABSCHLUSS
 * =====================================================================
 *  Ziel: Deck + Spieler + Karte zu einem spielbaren Spiel verbinden.
 *  "Krieg": Deck mischen, je 26 Karten austeilen. Pro Runde deckt jeder
 *  seine oberste Karte auf - die hoehere gewinnt die Runde. Wer nach allen
 *  Runden mehr gewonnen hat, gewinnt das Spiel.
 *
 *   a) austeilen(deck, s1, s2): solange das Deck Karten hat, ABWECHSELND
 *      je eine Karte an s1 und s2 geben (deck.ziehen -> spieler.nimmKarte).
 *   b) rundenGewinner(a, b, sa, sb): gib den Spieler mit der hoeheren Karte
 *      zurueck - oder null bei Gleichstand.
 *
 *  Ersetze jedes "// TODO" und druecke RUN: erst Selbsttest, dann ein Spiel.
 *  Loesung: LOESUNGEN.md
 * ===================================================================== */

public class MiniSpiel {

    static void austeilen(Deck deck, Spieler s1, Spieler s2) {
        // TODO a
    }

    static Spieler rundenGewinner(Karte a, Karte b, Spieler sa, Spieler sb) {
        // TODO b
        return null;
    }

    public static void main(String[] args) {
        // ---- Selbsttest ----
        Spieler x = new Spieler("X");
        Spieler y = new Spieler("Y");
        Karte koenig = new Karte(Farbe.HERZ, Wert.KOENIG);    // Rang 13
        Karte vier   = new Karte(Farbe.PIK, Wert.VIER);       // Rang 4
        Karte koenig2 = new Karte(Farbe.KARO, Wert.KOENIG);   // Rang 13
        pruef("b) hoehere Karte gewinnt",   rundenGewinner(koenig, vier, x, y) == x);
        pruef("b) andere Reihenfolge",      rundenGewinner(vier, koenig, x, y) == y);
        pruef("b) Gleichstand -> null",     rundenGewinner(koenig, koenig2, x, y) == null);

        Deck deck = new Deck();
        Spieler a = new Spieler("Anna");
        Spieler b = new Spieler("Ben");
        austeilen(deck, a, b);
        pruef("a) jeder hat 26 Karten", a.handGroesse() == 26 && b.handGroesse() == 26);
        fazit();

        // ---- Ein komplettes Spiel ----
        System.out.println("\n=== KRIEG ===");
        Deck deck2 = new Deck();
        deck2.mischen();
        Spieler anna = new Spieler("Anna");
        Spieler ben  = new Spieler("Ben");
        austeilen(deck2, anna, ben);

        int siegeAnna = 0, siegeBen = 0;
        while (anna.handGroesse() > 0 && ben.handGroesse() > 0) {
            Karte ka = anna.legeObersteAb();
            Karte kb = ben.legeObersteAb();
            Spieler g = rundenGewinner(ka, kb, anna, ben);
            if (g == anna) siegeAnna++;
            else if (g == ben) siegeBen++;
        }
        System.out.println("Anna gewann " + siegeAnna + " Runden, Ben " + siegeBen + " Runden.");
        if (siegeAnna > siegeBen)      System.out.println("Anna gewinnt das Spiel!");
        else if (siegeBen > siegeAnna) System.out.println("Ben gewinnt das Spiel!");
        else                           System.out.println("Unentschieden!");
    }

    private static int ok = 0, no = 0;
    private static void pruef(String name, boolean b) { System.out.println((b ? "[PASS] " : "[FAIL] ") + name); if (b) ok++; else no++; }
    private static void fazit() { System.out.println("-----  " + ok + " PASS / " + no + " FAIL"); }
}
