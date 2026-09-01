public class hello {

	public static void main(String[] args) {
	int num1=0b101;   // 0b101 = 5
	System.out.println(num1);
	
	int num2=0x7E;   // 0x7E = 126
	System.out.println(num2);
	
	int num3=10_00_00_000;
	System.out.println(num3);
	
	float num4=56;
	System.out.println(num4);
	
	double num5=56;
	System.out.println(num5);
	
	double num6=12e9;    // 12 * 10^9 = 12000000000.0
	System.out.println(num6);
	
	boolean num7= 1;   // error because boolean can only be true or false
	System.out.println(num7);
	
	char c='a';
	System.out.println(c);
	c++;      // c = c + 1 = 'b'
	
	char c1='a';
	c1++;
	System.out.println(c1);
	}

}
