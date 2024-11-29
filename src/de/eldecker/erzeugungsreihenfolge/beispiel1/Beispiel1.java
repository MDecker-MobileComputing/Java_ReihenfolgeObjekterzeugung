package de.eldecker.erzeugungsreihenfolge.beispiel1;

class S1 {
	
	public S1() {
		
		System.out.println( "S1" );
	}
}


public class Beispiel1 {

	static S1 s1 = new S1(); 
	
	public static void main( String[] args ) {
		
		System.out.println( "Main" );
	}
	
}
