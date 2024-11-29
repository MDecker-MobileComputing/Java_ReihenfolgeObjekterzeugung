package de.eldecker.erzeugungsreihenfolge.beispiel1;


class S1 {
	
	public S1() {
		
		System.out.println( "S1" );
	}
}


class S2 {
	
	static S1 s1 = new S1();
	
	public S2() {
		
		System.out.println( "S2" );
	}
}


public class Beispiel1 {

	static S2 s2 = new S2(); 
	
	public static void main( String[] args ) {
		
		System.out.println( "Main" );
	}
	
}
