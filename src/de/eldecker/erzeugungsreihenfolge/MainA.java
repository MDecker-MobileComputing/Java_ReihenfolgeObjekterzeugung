package de.eldecker.erzeugungsreihenfolge;


class A1 {
	
	public A1() {
		
		System.out.println( "A1" );
	}
}


public class MainA {

	static A1 a1 = new A1(); 
	
	public static void main( String[] args ) {
		
		System.out.println( "Main" );
	}
	
}
