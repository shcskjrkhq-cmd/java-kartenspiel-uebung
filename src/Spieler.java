import java.util.ArrayList;

/* =====================================================================
 *  LEVEL 3 - Uebung 7: Spieler         (Objekt mit Zustand, Liste als Feld)
 * =====================================================================
 *  Ziel: ein Spieler mit einer Hand voller Karten. Baut auf Karte auf.
 *
 *  Name, Hand-Liste und Konstruktor sind vorgegeben. Implementiere:
 *   a) nimmKarte(k): Karte hinten an die Hand anhaengen
 *   b) handGroesse(): Anzahl der Handkarten
 *   c) legeObersteAb(): zuletzt genommene Karte ENTFERNEN und zurueckgeben
 *      (bei leerer Hand null)
 *   d) punkte(): Summe der Rang-Werte aller Handkarten (Wert.getRang())
 *
 *  Ersetze jedes "// TODO" und druecke RUN. Loesung: LOESUNGEN.md
 * ===================================================================== */

public class Spieler {

    private final String name;
    private final ArrayList<Karte> hand = new ArrayList<>();

    public Spieler(String name) { this.name = name; }

    public String getName() { return name; }

    public void nimmKarte(Karte k) { /* TODO a */ }

    public int handGroesse() { return 0; /* TODO b */ }

    public Karte legeObersteAb() {
        // TODO c
        return null;
    }

    public int punkte() {
        // TODO d
        return 0;
    }

    public static void main(String[] args) {
        Spieler p = new Spieler("Paul");
        pruef("Name == Paul", p.getName().equals("Paul"));
        pruef("Hand anfangs leer", p.handGroesse() == 0);
        p.nimmKarte(new Karte(Farbe.HERZ, Wert.ASS));   // Rang 14
        p.nimmKarte(new Karte(Farbe.PIK, Wert.ZWEI));   // Rang 2
        pruef("a/b) Hand hat 2 Karten", p.handGroesse() == 2);
        pruef("d) Punkte == 16", p.punkte() == 16);
        Karte oben = p.legeObersteAb();
        pruef("c) zuletzt genommene Karte ist ZWEI", oben != null && oben.getWert() == Wert.ZWEI);
        pruef("c) Hand hat wieder 1 Karte", p.handGroesse() == 1);
        fazit();
    }

    private static int ok = 0, no = 0;
    private static void pruef(String name, boolean b) { System.out.println((b ? "[PASS] " : "[FAIL] ") + name); if (b) ok++; else no++; }
    private static void fazit() { System.out.println("-----  " + ok + " PASS / " + no + " FAIL"); }
}
