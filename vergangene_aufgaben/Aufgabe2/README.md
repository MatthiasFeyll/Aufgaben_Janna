# Aufgaben - Recap Functions

## Aufgabe eins

Welche Ausgabe hat dieses Programm?

```java
public class AufgabeEins {
    public static String makeGreeting(String name, int repeat) {
        String message = "";
        for (int i = 0; i < repeat; i++) {
            message += "Hello " + name + "! ";
        }
        return message;
    }

    public static void main(String[] args){
        String greetings = makeGreeting("Janna", 3);
        System.out.println(greetings);
    }
}

```

## Aufgabe zwei

Aliens sind auf die Erde gekommen und haben alle Variablen und Funktionnamen unkenntlich gemacht. Versuche dennoch zu erkennen was das Programm macht.

```java
public class XorblinQap {

    public static int vrakTuld(int mip) {
        return mip * 3600;
    }

    public static int glonSpiv(int ner) {
        return ner * 60;
    }

    public static int frabZint(int mip, int ner, int zol) {
        int quib = vrakTuld(mip);
        int snok = glonSpiv(ner);

        int blim = quib + snok + zol;
        return blim;
    }

    public static void main(String[] args) {
        int mip = 1;
        int ner = 30;
        int zol = 45;

        int blim = frabZint(mip, ner, zol);
        System.out.println("Zlorg vreeb: " + blim);
    }
}

```
