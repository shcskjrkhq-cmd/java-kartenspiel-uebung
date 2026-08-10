import java.util.Random;

/* =====================================================================
 *  LEVEL 1 - Uebung 4: Wuerfel        (Arrays, Random, Schleifen) - spielnah!
 * =====================================================================
 *  Ziel: mit Zufall und Arrays arbeiten - baust du spaeter fuers Spiel.
 *
 *  a) wuerfle(r): liefert eine Zufallszahl von 1 bis 6.
 *     Tipp: r.nextInt(6) liefert 0..5.
 *  b) haeufigkeiten(wuerfe): zaehlt, wie oft jede Augenzahl vorkommt.
 *     Rueckgabe: int[7], wobei Index 1..6 = Anzahl der jeweiligen Augenzahl
 *     (Index 0 bleibt ungenutzt / 0).
 *
 *  Ersetze jedes "// TODO" und druecke RUN. Loesung: LOESUNGEN.md
 * ===================================================================== */

public class Wuerfel {

    static int wuerfle(Random r) {
        // TODO a
        return 0;
    }

    static int[] haeufigkeiten(int[] wuerfe) {
        int[] h = new int[7];
        // TODO b: fuer jeden Wurf den passenden Zaehler erhoehen
        return h;
    }

    public static void main(String[] args) {
        Random r = new Random();
        boolean alleImBereich = true;
        for (int i = 0; i < 1000; i++) {
            int w = wuerfle(r);
            if (w < 1 || w > 6) alleImBereich = false;
        }
        pruef("a) wuerfle() immer 1..6", alleImBereich);

        int[] wuerfe = {1, 1, 2, 6, 6, 6, 3};
        int[] h = haeufigkeiten(wuerfe);
        pruef("b) Augenzahl 1 kommt 2x", h[1] == 2);
        pruef("b) Augenzahl 6 kommt 3x", h[6] == 3);
        pruef("b) Augenzahl 3 kommt 1x", h[3] == 1);
        pruef("b) Augenzahl 5 kommt 0x", h[5] == 0);
        fazit();
    }

    private static int ok = 0, no = 0;
    private static void pruef(String name, boolean b) { System.out.println((b ? "[PASS] " : "[FAIL] ") + name); if (b) ok++; else no++; }
    private static void fazit() { System.out.println("-----  " + ok + " PASS / " + no + " FAIL"); }
}
