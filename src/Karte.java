/* =====================================================================
 *  LEVEL 2 - Uebung 5: Karte      (eigene Klasse, enum, Kapselung, toString)
 * =====================================================================
 *  Ziel: dein erstes eigenes Objekt - der Grundbaustein jedes Kartenspiels.
 *
 *  Die beiden enums Farbe und Wert sind fertig vorgegeben (Beispiel, wie man
 *  einer Aufzaehlung Werte mitgibt). Implementiere die Klasse Karte:
 *
 *   a) zwei private final Felder: farbe (Farbe) und wert (Wert)
 *   b) Konstruktor Karte(Farbe farbe, Wert wert)
 *   c) getFarbe(), getWert()
 *   d) toString() -> z.B. "DAME KARO"   (wert + " " + farbe)
 *   e) istHoeherAls(andere): true, wenn der Rang dieser Karte groesser ist
 *
 *  Ersetze jedes "// TODO" und druecke RUN. Loesung: LOESUNGEN.md
 * ===================================================================== */

// --- fertig vorgegeben (nicht aendern) ---
enum Farbe { HERZ, KARO, PIK, KREUZ }

enum Wert {
    ZWEI(2), DREI(3), VIER(4), FUENF(5), SECHS(6), SIEBEN(7), ACHT(8),
    NEUN(9), ZEHN(10), BUBE(11), DAME(12), KOENIG(13), ASS(14);

    private final int rang;
    Wert(int rang) { this.rang = rang; }
    public int getRang() { return rang; }
}
// -----------------------------------------

public class Karte {

    // TODO a: Felder farbe und wert

    // TODO b: Konstruktor

    public Farbe getFarbe() { return null; /* TODO c */ }

    public Wert getWert() { return null; /* TODO c */ }

    @Override
    public String toString() { return ""; /* TODO d */ }

    public boolean istHoeherAls(Karte andere) { return false; /* TODO e */ }

    public static void main(String[] args) {
        Karte dameKaro = new Karte(Farbe.KARO, Wert.DAME);
        Karte siebenPik = new Karte(Farbe.PIK, Wert.SIEBEN);
        pruef("c) getFarbe() == KARO", dameKaro.getFarbe() == Farbe.KARO);
        pruef("c) getWert() == DAME",  dameKaro.getWert() == Wert.DAME);
        pruef("d) toString() == 'DAME KARO'", "DAME KARO".equals(dameKaro.toString()));
        pruef("e) DAME ist hoeher als SIEBEN", dameKaro.istHoeherAls(siebenPik));
        pruef("e) SIEBEN ist nicht hoeher als DAME", !siebenPik.istHoeherAls(dameKaro));
        fazit();
    }

    private static int ok = 0, no = 0;
    private static void pruef(String name, boolean b) { System.out.println((b ? "[PASS] " : "[FAIL] ") + name); if (b) ok++; else no++; }
    private static void fazit() { System.out.println("-----  " + ok + " PASS / " + no + " FAIL"); }
}
