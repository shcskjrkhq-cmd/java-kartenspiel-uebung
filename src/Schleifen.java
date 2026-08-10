/* =====================================================================
 *  LEVEL 1 - Uebung 3: Schleifen               (for, while, Bedingungen)
 * =====================================================================
 *  Ziel: Wiederholungen mit Schleifen steuern.
 *
 *  a) summeBis(n): 1 + 2 + ... + n
 *  b) fakultaet(n): n! = 1 * 2 * ... * n   (fakultaet(0) == 1)
 *  c) fizzbuzz(n): "Fizz" wenn durch 3 teilbar, "Buzz" wenn durch 5,
 *     "FizzBuzz" wenn durch beide, sonst die Zahl als Text (z.B. "7").
 *
 *  Ersetze jedes "// TODO" und druecke RUN. Loesung: LOESUNGEN.md
 * ===================================================================== */

public class Schleifen {

    static int summeBis(int n) {
        // TODO a: mit einer for- oder while-Schleife aufsummieren
        return 0;
    }

    static long fakultaet(int n) {
        // TODO b
        return 0;
    }

    static String fizzbuzz(int n) {
        // TODO c
        return "";
    }

    public static void main(String[] args) {
        pruef("summeBis(10)==55",      summeBis(10) == 55);
        pruef("summeBis(1)==1",        summeBis(1) == 1);
        pruef("fakultaet(5)==120",     fakultaet(5) == 120);
        pruef("fakultaet(0)==1",       fakultaet(0) == 1);
        pruef("fizzbuzz(3)==Fizz",     "Fizz".equals(fizzbuzz(3)));
        pruef("fizzbuzz(5)==Buzz",     "Buzz".equals(fizzbuzz(5)));
        pruef("fizzbuzz(15)==FizzBuzz","FizzBuzz".equals(fizzbuzz(15)));
        pruef("fizzbuzz(7)==7",        "7".equals(fizzbuzz(7)));
        fazit();
    }

    private static int ok = 0, no = 0;
    private static void pruef(String name, boolean b) { System.out.println((b ? "[PASS] " : "[FAIL] ") + name); if (b) ok++; else no++; }
    private static void fazit() { System.out.println("-----  " + ok + " PASS / " + no + " FAIL"); }
}
