## Aufgaben
Hey hier ein paar Aufgaben an denen du nochmal dein Wissen festigen kannst <3


Die Aufgaben sind maximal 10 Zeilen Code. Ich empfehle dir entweder die Auto-Completion auszuschalten (Aus einem Reddit Forum Go to File Settings , then Editor > General > Inline completion , and then disable "Enable local Full Line completion suggestions)

Alternativ gibt es online einfache compiler die nur syntax highlighting haben. Hier der Link: [Programmiz]{https://www.programiz.com/java-programming/online-compiler/}

### Aufgabe 0 - Methoden - [Link zu der Lösung](./loesungen/Aufgabe1.java)
Erstelle eine Methode die zwei Parameter x und y vom Typ int besitzt. Gebe die Summe der beiden Parameter zurück. Überprüfe deine Lösung durch eine entsprechende Ausgabe (Mit `System.out.printl()`)

<details>
<summary>
Tipp
</summary>
Die Methode sieht ungefähr so aus:

```java
public static int summe(int x, int y) {

}
```
</details>



<hr>

### Aufgabe 2 - Konstruktor- [Link zu der Lösung](./loesungen/Aufgabe2.java)

Erweiter folgende Klasse um ein Konstruktor. Dem Konstruktor sollen alle in der Klasse enthaltenen Attribute als Parameter übergeben werden. Eine Person kann maximal 99 Jahre alt werden. Erstelle ein Objekt der Klasse Person.

```java
public class Person {
    private String name;
    private int alter;
}
``` 

<details>
<summary>Kleiner Tipp</summary>

Hab mich extra etwas komplizierter ausgedrückt. "Alle in der Klasse enthaltenen Attribute" sind `name` und `alter`. 

</details>


<br>
<details>
<summary>
Weiterer Tipp
</summary>


```java
public class Person {
    private String name;
    private int alter;

    public Person(String name, int alter) {

    }
}
```
</details>
<hr>

### Aufgabe 3 - Listen [Link zu der Lösung](./loesungen/Aufgabe3.java)
Erstelle eine Liste die Integer-Werte beinhalten soll. Füge zwei Werte deiner Wahl in die Liste hinzu. Gebe anschließend den ersten Wert in der Liste aus.

<details>
<summary>
Tipp
</summary>

Mit `add()` und `get()` kannst du Elemente der Liste hinzufügen und holen. 


 - `Add` bekommt als Parameter den Wert der hinzugefügt werden soll. 
 - `Get` bekommt als Paramter den Index mitgegeben welches Element zurückgegeben werden soll.


</details>