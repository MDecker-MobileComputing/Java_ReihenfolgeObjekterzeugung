# Reihenfolge bei Objekterzeugung in Java #

<br>

Dieses Repository enthält ein Eclipse-Projekt mit mehreren kleinen Java-Programmen, die die Reihenfolge bei der Objekterzeugung veranschaulichen.

<br>

## Statische Variablen ##

Statische Variablen (Klassenvariablen) werden initialisiert, wenn die Klasse geladen wird.
Wenn die geladene Klasse andere Klassen referenziert (z.B. für die Deklaration einer Objektvariable), dann wird diese Klasse zuerst geladen.
Wenn ein Java-Programm gestartet wird, dann muss dafür natürlich
die Klasse mit der `main`-Methode geladen werden.

Es gibt auch noch statische Initialisierer, welche hier nicht betrachtet werden sollen.

## Objektvariablen ##

Bei der Erzeugung eines Objekts (der Instanz einer Klasse) werden folgende Schritte durchgeführt:

<br>

1. Es werden zunächst die Objektvariablen initialisiert.
   Wenn die Objektvariable durch Konstruktoraufrufe initialisiert werden,
   dann wird zuerst die Objekterzeugung hierfür durchgeführt.

2. Der Konstruktor wird aufgerufen.
   Wenn die erste Anweisung im Konstruktor allerdings nicht der Aufruf eines anderes Konstruktors ist, dann wird automatisch der Super-
   Konstruktor der Oberklasse aufgerufen.
   Wenn die Klasse keine Oberklasse hat (also ohne `extends` deklariert ist), dann wird der Default-Konstruktor der Klasse `java.lang.Objekt`
   aufgerufen.

3. Nachdem der andere Konstruktor abgearbeitet ist wird der Rest des
   Konstruktors des Klasse abgearbeitet.

<br>

Siehe auch: Kapitel 7.4.4 ("Der Mechanismus der Objekterzeugung", S. 241-246) im folgenden Buch:
[Ratz, Schulmeister-Zimolong, Seese, Wiesenberger:
Grundkurs Programmieren in Java (9. Aufgabe).
Hanser-Verlag, 2024.
ISBN: 978-3-446-48122-0.](https://www.grundkurs-java.de/)

<br>

----

## License ##

<br>

See the [LICENSE file](LICENSE.md) for license rights and limitations (BSD 3-Clause License).

<br>