public class hello {

	public static void main(String[] args) {
		byte b=127;
		int a=b;
		System.out.println(b);
		System.out.println(a);
		
		byte b1=125;
		int a0=b1;
		System.out.println(b1);
		System.out.println(a0);
		
		int aa=257;
		byte k=(byte)aa;  // 257 % 256 = 1
		
		float f=5.6f;
		int t=(int)f;  // 5.6 is converted to 5
		
		int a2=2567;
		byte b2=(byte)a;  // 2567 % 256 = 15
		System.out.println(k);
		
		byte a3=10;
		byte b4=20;
		int t=a*b;
		System.out.println(t);
	
	}

}


/**
 *  int i=12;
 *  byte b= i;
 * This gives an error because Java does not automatically convert an int variable to byte,
 * even if the value 12 can fit inside the byte range.
 * You need to convert explicitly to byte using a type cast like this:
 * byte b= (byte)i;
 */
