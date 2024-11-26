package de.eldecker.erzeugungsreihenfolge;


class B1 {
	
	public B1() {
		
		System.out.println( "B1" );
	}
}

class B2 {
	
	B1 b1 = new B1();
	
	public B2() {
		
		System.out.println( "B2" );
	}
}


public class MainB {

	public static void main( String[] args ) {
		
		new B2();
	}
}
