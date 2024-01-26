package systems;

public class OctalToDecimal {
	static int multiply(int n) {
		int mul = 1;
		if(n==0) {
			return 1;
		}
		for(int i=0;i<n;i++) {
			mul*=8;
		}
		return mul;
	}
	public static void main(String[] args) {
		int octal = 130;
		int temp = octal;
		int sum = 0;
		int exponent = 0;
		while(octal!=0) {
			int r = octal%10;
			sum+=r*multiply(exponent);
			exponent++;
			octal/=10;
		}
		System.out.println("Decimal value of "+temp+" is "+sum);
	}
}
