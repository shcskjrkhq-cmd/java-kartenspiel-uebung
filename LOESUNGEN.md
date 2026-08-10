# Musterlösungen

Erst **selbst** versuchen! Hier nur reinschauen, wenn du wirklich feststeckst — es geht ums Lernen, nicht ums Abschreiben. Gezeigt ist jeweils nur der Teil, den du ausfüllen musstest.

## Übung 1 · HalloJava
```java
static String begruessung(String name, int alter) {
    return "Hallo " + name + ", du bist " + alter + " Jahre alt.";
}
static int quadrat(int x) {
    return x * x;
}
```

## Übung 2 · Rechner
```java
static int addiere(int a, int b)       { return a + b; }
static int subtrahiere(int a, int b)   { return a - b; }
static int multipliziere(int a, int b) { return a * b; }

static int dividiere(int a, int b) {
    if (b == 0) return 0;
    return a / b;
}
static boolean istGerade(int n) {
    return n % 2 == 0;
}
static int groesserVon(int a, int b) {
    return a > b ? a : b;          // oder: if (a > b) return a; else return b;
}
```

## Übung 3 · Schleifen
```java
static int summeBis(int n) {
    int summe = 0;
    for (int i = 1; i <= n; i++) summe += i;
    return summe;
}
static long fakultaet(int n) {
    long f = 1;
    for (int i = 2; i <= n; i++) f *= i;
    return f;
}
static String fizzbuzz(int n) {
    if (n % 15 == 0) return "FizzBuzz";   // durch 3 UND 5 -> zuerst prüfen!
    if (n % 3 == 0)  return "Fizz";
    if (n % 5 == 0)  return "Buzz";
    return "" + n;                        // Zahl in Text umwandeln
}
```

## Übung 4 · Wuerfel
```java
static int wuerfle(Random r) {
    return r.nextInt(6) + 1;      // nextInt(6) gibt 0..5 -> +1 = 1..6
}
static int[] haeufigkeiten(int[] wuerfe) {
    int[] h = new int[7];
    for (int w : wuerfe) h[w]++;  // die Augenzahl ist der Index
    return h;
}
```

## Übung 5 · Karte
```java
private final Farbe farbe;
private final Wert wert;

public Karte(Farbe farbe, Wert wert) {
    this.farbe = farbe;
    this.wert = wert;
}
public Farbe getFarbe() { return farbe; }
public Wert getWert()   { return wert; }

@Override
public String toString() {
    return wert + " " + farbe;   // enum wird automatisch zu seinem Namen, z.B. "DAME KARO"
}
public boolean istHoeherAls(Karte andere) {
    return this.wert.getRang() > andere.wert.getRang();
}
```

## Übung 6 · Deck
```java
public Deck() {
    for (Farbe f : Farbe.values())
        for (Wert w : Wert.values())
            karten.add(new Karte(f, w));   // 4 Farben x 13 Werte = 52
}
public int anzahl()      { return karten.size(); }
public boolean istLeer() { return karten.isEmpty(); }
public void mischen()    { Collections.shuffle(karten); }

public Karte ziehen() {
    if (karten.isEmpty()) return null;
    return karten.remove(karten.size() - 1);   // letzte Karte = "oben"
}
```

## Übung 7 · Spieler
```java
public void nimmKarte(Karte k) {
    hand.add(k);
}
public int handGroesse() {
    return hand.size();
}
public Karte legeObersteAb() {
    if (hand.isEmpty()) return null;
    return hand.remove(hand.size() - 1);
}
public int punkte() {
    int summe = 0;
    for (Karte k : hand) summe += k.getWert().getRang();
    return summe;
}
```

## Übung 8 · MiniSpiel
```java
static void austeilen(Deck deck, Spieler s1, Spieler s2) {
    boolean anS1 = true;
    while (!deck.istLeer()) {
        Karte k = deck.ziehen();
        if (anS1) s1.nimmKarte(k);
        else      s2.nimmKarte(k);
        anS1 = !anS1;             // abwechselnd
    }
}
static Spieler rundenGewinner(Karte a, Karte b, Spieler sa, Spieler sb) {
    if (a.istHoeherAls(b)) return sa;
    if (b.istHoeherAls(a)) return sb;
    return null;                  // Gleichstand
}
```
