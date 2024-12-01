package de.eldecker.erzeugungsreihenfolge.beispiel4;


class S1 {
	
	public S1() { System.out.println( "S1" ); }
}

class S2 {
		
	public S2() { System.out.println( "S2" ); }
}

class S3 {
		
	public S3() { System.out.println( "S3" ); } 
}

//----------------------------------------------------------

class O1 {
		
	public O1() { System.out.println( "O1" ); } 
}

class O2 {
	
	public O2() { System.out.println( "O2" ); } 
}

class O3 {
	
	public O3() { System.out.println( "O3" ); } 
}

//----------------------------------------------------------

class Ober {
			
	static S3 s3 = new S3();
	
	O3 o3 = new O3();
	
	public Ober() { System.out.println( "Ober" ); } 
}

class Unter extends Ober {
	
	static S2 s2 = new S2();
	
	O2 o2 = new O2();
	
	public Unter() { System.out.println( "Unter" ); } 
}

//----------------------------------------------------------

public class Beispiel4 {

	static S1 s1 = new S1();
	
	O1 o1 = new O1();
	
	public static void main( String[] args ) {
		
		new Unter();
	}
}
