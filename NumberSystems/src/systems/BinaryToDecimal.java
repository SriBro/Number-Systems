package systems;

public class BinaryToDecimal {
	static int multiply(int n) {
		int sum = 1;
		if(n==0) {
			sum=1;
		}
		for(int i=0;i<n;i++) {
			sum*=2;
		}
		return sum;
	}
	public static void main(String[] args) {
		String b = "1010";
		String rev = "";
		int d = 0;
		for(int i=b.length()-1;i>=0;i--) {
			rev+=b.charAt(i);
		}
		for(int i=0;i<rev.length();i++) {
			if(rev.charAt(i)=='1') {
				int temp =multiply(i);
				d = temp+d;
			}
		}
		System.out.println("Decimal value of "+b+" is "+d);
	}
}
