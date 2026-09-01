public class hello {

	public static void main(String[] args) {
		int num1=9;
		byte by=127;
		short sh=558;
		long l=5854l;
		
		float f=5.8f;
		double d=5.8;
		
		char c='k';
		
		boolean b=true;

	}

}


/*
| Data Type |                              Size | Range / Values                      |
| --------- | --------------------------------: | ----------------------------------- |
| `boolean` | **Not precisely defined by Java** | `true` / `false`   Not 0 or 1       |
| `byte`    |               **1 byte (8 bits)** | -128 to 127                         |

| `short`   |             **2 bytes (16 bits)** | -32,768 to 32,767                   |
| `char`    |             **2 bytes (16 bits)** | `'\u0000'` to `'\uffff'` (0–65,535) |

| `int`     |             **4 bytes (32 bits)** | -2³¹ to 2³¹ - 1                     |
| `long`    |             **8 bytes (64 bits)** | -2⁶³ to 2⁶³ - 1                     |
| `float`   |             **4 bytes (32 bits)** | ~6–7 decimal digits                 |
| `double`  |             **8 bytes (64 bits)** | ~15–16 decimal digits               |
*/