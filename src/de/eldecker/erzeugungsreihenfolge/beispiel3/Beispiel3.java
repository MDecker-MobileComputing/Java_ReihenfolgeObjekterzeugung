package de.eldecker.erzeugungsreihenfolge.beispiel3;


class O1 {
	
	public O1() { System.out.println( "O1" ); }
}

class O2 {
	
	public O2() { System.out.println( "O2" ); }
}

class O3 {
		
	O1 o1 = new O1();
	
	public O3() { System.out.println( "O3" ); } 
}

class O4 extends O3 {
	
	O2 o2 = new O2();
	
	public O4() { System.out.println( "O4" ); } 
}



public class Beispiel3 {

	public static void main( String[] args ) {
		
		new O4();
	}
}
