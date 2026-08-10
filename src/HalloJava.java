/* =====================================================================
 *  LEVEL 0 - Uebung 1: Hallo Java            (Variablen, Typen, Methoden)
 * =====================================================================
 *  Ziel: ein Programm zum Laufen bringen und die ersten Bausteine kennen.
 *
 *  a) Ergaenze die Methode begruessung(name, alter), die z.B.
 *       "Hallo Paul, du bist 22 Jahre alt." zurueckgibt.
 *  b) Ergaenze quadrat(x), die x*x zurueckgibt.
 *  c) Spiele in main() ruhig mit System.out.println(...) herum.
 *
 *  Ersetze jedes "// TODO" und druecke RUN. Unten laeuft ein Selbsttest.
 *  Loesung: LOESUNGEN.md
 * ===================================================================== */

public class HalloJava {

    static String begruessung(String name, int alter) {
        // TODO (a): Text zusammensetzen mit + und zurueckgeben
        return "Hallo " + name + ", du bist " + alter + " Jahre alt.";
    }

    static int quadrat(int x) {
        // TODO (b)
        return x*x;
    }

    public static void main(String[] args) {
        // c) Freies Ausprobieren - hier darfst du alles aendern:
        System.out.println("Mein erstes Java-Programm laeuft?");

        // ---- Selbsttest (nicht aendern) ----
        pruef("a) begruessung", begruessung("Paul", 22).equals("Hallo Paul, du bist 22 Jahre alt."));
        pruef("b) quadrat(5) == 25", quadrat(5) == 25);
        pruef("b) quadrat(-3) == 9", quadrat(-3) == 9);
        fazit();
    }

    private static int ok = 0, no = 0;
    private static void pruef(String name, boolean bestanden) {
        System.out.println((bestanden ? "[PASS] " : "[FAIL] ") + name);
        if (bestanden) ok++; else no++;
    }
    private static void fazit() { System.out.println("-----  " + ok + " PASS / " + no + " FAIL"); }
}
