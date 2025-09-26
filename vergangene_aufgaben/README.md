# Aufgaben - Objektorientierte Programmierung

## Aufgabe 1
Erstellen Sie eine Klasse Student. Ein Student besitzt einen Namen und eine Matrikelnummer und einen Notendurschnitt. Wähle geeignete Datentypen. Erstellen Sie den Konstruktor sowie Zugriffsmethoden für die Attribute. Die Matrikelnummer darf nicht größer als 666 sein.

## Aufgabe 2
Erstellen Sie eine Klasse Universität. Diese besitzt einen Standort sowie 3 Studierende (Student1, Student2, Student3). Erstellen Sie den Konstruktor sowie die Zugriffsmethoden für die Attribute

### Anmerkung
Normalerweise würde man eine Liste verwenden in die alle Studierenden gespeichert werden. Da wir das noch nicht machen arbeiten wir erstmal nur mit drei Studierenden pro Uni.

## Aufgabe 3
Erstelle eine Methode `public double berechneNotenschnitt()`, welche den Durschnitt aller Studenten zurück gibt.

## Aufgabe 4
Erweitere die Klasse Student um das Attribut `bestanden` als Integer. Die Zahlen sind wie folgt definiert:
* 1 = er hat bestanden
* 2 = er hat nicht bestanden
* 3 = er studiert noch

Erweiter den Konstruktor. Gehe davon aus, dass alle neu erstellten Studenten gerade am studieren sind.

## Aufgabe 5
Erweitere die Klasse Studen um die Methode `public boolean beendeStudium()`. Ist der Notendurschnitt des Studierenden größer als 4.0 ist das Studium nicht bestanden. Passe entsprechend der Definition aus Aufgabe 4 das Attribut `bestanden` an und gebe entsprechend seines Notendurschnitts eine der folgenden Meldungen aus:
"Student Janna (MatrikelNr: 666) => bestanden"
"Student Janna (MatrikelNr: 666) => nicht bestanden"


Hinweis:
Habe es extra so "doof" wie in der Übungsklausur geschrieben. Janna und die MatrikelNr 666 sind natürlich nur beispielhafte Werte. Da könnte auch Matthias mit der MatrikelNr 665 stehen.


## Aufgabe 6 - knifflig
Bislang haben wir nur die Info in der Universitäts-Klasse, welche Studenten sie hat. Der Student weiß allerdings nicht in welcher Uni er studiert. Füge dem Studenten das Attribut Universität hinzu. Erstelle die Zugriffsmethoden für dieses Attribut. Sobald eine Universität erstellt wird, soll in der Studenten-Klasse auch das `Universitäts`-Attribut gesetzt werden. 




## Inhaltliche Fragen an Janna
* Hattet ihr Enums?
* Habt ihr euch mit dem Schlüsselwort `static` beschäftigt?
* @Override sollten wir uns nochmal angucken bzw. dieses `toString()`
