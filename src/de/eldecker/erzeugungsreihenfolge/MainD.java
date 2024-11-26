package de.eldecker.erzeugungsreihenfolge;


class D1 {
	
	public D1() { System.out.println( "D1" ); }
}

class D2 {
	
	public D2() { System.out.println( "D2" ); }
}

class D3 {
	
	D1 d1 = new D1();
	
	public D3() { System.out.println( "D3" ); } 
}


class D4 extends D3 {
	
	D2 d2 = new D2();
	
	public D4() { System.out.println( "D4" ); } 
}



public class MainD {

	public static void main( String[] args ) {
		
		new D4();
	}
}
