package systems;

public class HexadecimalToDecimal {
	static int multiply(int n) {
		int mul = 1;
		if(n==0) {
			return 1;
		}
		for(int i=0;i<n;i++) {
			mul*=16;
		}
		return mul;
	}
	public static void main(String[] args) {
		int hexa = 59;
		int temp = hexa;
		int sum = 0;
		int exponent = 0;
		while(hexa!=0) {
			int r = hexa%10;
			sum+=r*multiply(exponent);
			exponent++;
			hexa/=10;
		}
		System.out.println("Decimal value of "+temp+" is "+sum);
	}

}
