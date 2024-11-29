package de.eldecker.erzeugungsreihenfolge.beispiel2;


class O1 {
	
	public O1() {
		
		System.out.println( "O1" );
	}
}

class O2 {
	
	O1 o1 = new O1();
	
	public O2() {
		
		System.out.println( "O2" );
	}
}


public class Beispiel2 {

	public static void main( String[] args ) {
		
		new O2();
	}
}
