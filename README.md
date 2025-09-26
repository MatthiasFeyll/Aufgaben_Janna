# Aufgabe 1 - Happy Coding <3
a) Erstelle eine Klasse Busfahrt. Diese hat ein Start und ein End-Zeit. Die Zeiten sind relativ zu 0 Uhr in Minuten. Bspw. Der Wert 480 ist 8 Uhr morgens da 480 / 60 = 8. 
Die Endzeit soll beim Erstellen auf -1 gesetzt werden. Erstelle einen entsprechenden Konstruktor und die Zugriffsmethoden.

b) Erweitere den Setter der End-Zeit. Der neu gesetzte Wert soll immer positiv sein. Darüber hinaus muss die End-Zeit nach der Start-Zeit sein.

c) Überschreibe die `toString()` Methode. Diese soll folgende Ausgabe haben:
```
Der Bus fährt um 8:42 Uhr und endet um Uhr 15:20 Uhr.
```
Falls das Ende noch nicht gesetzt ist soll folgender Text ausgegeben werden
```
Der Bus fährt um 8:42 Uhr los.
```

d) Schreibe eine weitere Methode `public int getDauer(){}`, welche die Dauer der Fahrt zurück gibt. Falls das Ende noch nicht gesetzt ist soll -1 zurückgegeben werden.

e) Schreibe eine Funktion in einer Main Methode, welche alle Busfahrten in einer neuen Liste zurück gibt. Diese Liste soll nur Busfahrten entahlten bei der die Dauer in dem geschlossenen Intervall liegt.

Beispiel: 

Interval-Start = 20

Interval-Ende = 100

Es wird nur das Busfahrt-Objekt der Variable b3 zurück gegeben.


```java
public class Main {
	public static void main(String[] args) {
	    ArrayList<Busfahrt> busfahrten = new ArrayList<Busfahrt>();
	    
        // Dauer 10 Minuten
	    Busfahrt b1 = new Busfahrt(240);
	    b1.setEnde(250);
	    busfahrten.add(b1);
	    
        // Dauer 120 Minuten
	    Busfahrt b2 = new Busfahrt(480);
	    b2.setEnde(600);
	    busfahrten.add(b2);
	    
        // Dauer 100 Minuten
	    Busfahrt b3 = new Busfahrt(800);
	    b3.setEnde(900);
	    busfahrten.add(b3);
	}
	
	public static ArrayList<Busfahrt> getIntervalDauer(int start, int ende) {
	    
	}
}
``` 
