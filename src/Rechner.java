/* =====================================================================
 *  LEVEL 0 - Uebung 2: Rechner        (Methoden, if/else, boolean, Rueckgabe)
 * =====================================================================
 *  Ziel: Methoden mit Parametern und Rueckgabewerten, Entscheidungen treffen.
 *
 *  a) addiere, subtrahiere, multipliziere (je zwei int)
 *  b) dividiere(a, b): Ganzzahldivision; falls b == 0 -> gib 0 zurueck
 *  c) istGerade(n): true, wenn n gerade ist (Tipp: Modulo %)
 *  d) groesserVon(a, b): die groessere der beiden Zahlen
 *
 *  Ersetze jedes "// TODO" und druecke RUN. Loesung: LOESUNGEN.md
 * ===================================================================== */

public class Rechner {

    static int addiere(int a, int b)      { return 0; /* TODO a */ }
    static int subtrahiere(int a, int b)  { return 0; /* TODO a */ }
    static int multipliziere(int a, int b){ return 0; /* TODO a */ }

    static int dividiere(int a, int b) {
        // TODO b: bei b == 0 -> 0 zurueckgeben, sonst a / b
        return 0;
    }

    static boolean istGerade(int n) {
        // TODO c
        return false;
    }

    static int groesserVon(int a, int b) {
        // TODO d
        return 0;
    }

    public static void main(String[] args) {
        pruef("addiere(2,3)==5",        addiere(2, 3) == 5);
        pruef("subtrahiere(9,4)==5",    subtrahiere(9, 4) == 5);
        pruef("multipliziere(6,7)==42", multipliziere(6, 7) == 42);
        pruef("dividiere(10,2)==5",     dividiere(10, 2) == 5);
        pruef("dividiere(5,0)==0",      dividiere(5, 0) == 0);
        pruef("istGerade(4)==true",     istGerade(4));
        pruef("istGerade(7)==false",    !istGerade(7));
        pruef("groesserVon(3,8)==8",    groesserVon(3, 8) == 8);
        pruef("groesserVon(8,3)==8",    groesserVon(8, 3) == 8);
        fazit();
    }

    private static int ok = 0, no = 0;
    private static void pruef(String name, boolean b) { System.out.println((b ? "[PASS] " : "[FAIL] ") + name); if (b) ok++; else no++; }
    private static void fazit() { System.out.println("-----  " + ok + " PASS / " + no + " FAIL"); }
}
