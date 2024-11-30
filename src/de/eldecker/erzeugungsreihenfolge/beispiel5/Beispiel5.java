package de.eldecker.erzeugungsreihenfolge.beispiel5;


class O1 {
	
	public O1() { System.out.println( "O1" ); }
}

class O2 {
	
	public O2() { System.out.println( "O2" ); }
}

class O3 {
	
	public O3() { System.out.println( "O3" ); }
}

class O4 {
		
	public O4() { System.out.println( "O4" ); }
}

class O5 {
	
	public O5() { System.out.println( "O5" ); }
}


// ----------------------------------------------------------

class Oberklasse {
	
	static O1 o1 = new O1();
	
	O2 o2 = new O2();
	
	O3 o3 = null;

	public Oberklasse() { 
		
		o3 = new O3();
		
		System.out.println( "Oberklasse" ); 
	}
}

class Unterklasse extends Oberklasse {
	
	static O4 o4 = new O4();
	
	O5 o5 = new O5();
		
	public Unterklasse() {
		
		System.out.println( "\no1=" + o1 + 
				            "\no2=" + o2 + 
				            "\no3=" + o3 + 
				            "\no4=" + o4 +
				            "\no5=" + o5 );
	}
}


//----------------------------------------------------------
	
public class Beispiel5 {

	public static void main( String[] args ) {
		
		new Unterklasse();
	}

}
