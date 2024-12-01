/**
 * Ausgabe des Programms in diesem Paket:
 * 
 * <pre>
 * O1
 * O3
 * O2
 * O4
 * </pre>
 * <br>
 * 
 * An diesem Beispiel sieht man, dass zuerst die Objektvariablen vor dem
 * "Haupt-Teil" des Konstruktors abgearbeitet werden ({@code O1} wird
 * vor {@code O3} ausgegeben, {@code O2} vor {@code O4}).
 * <br>
 * 
 * Außerdem sieht man, dass zuerst die Objektvariablen der Oberklasse
 * initialisiert werden, dann der "Haupt-Teil" des Konstruktors der
 * Oberklasse, bevor dann die Objektvariablen der Unterklasse initialisiert
 * werden.
 */
package de.eldecker.erzeugungsreihenfolge.beispiel3;