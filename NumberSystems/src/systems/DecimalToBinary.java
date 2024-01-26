package systems;

public class DecimalToBinary {
	public static void main(String[] args) {
		int d = 567;
		int temp = d;
		//1000110111
		String b = "";
		while(d!=0) {
			int r = d%2;
			b = r+b;
			d/=2;
		}
		System.out.println("Binary value of "+temp+" is "+b);
	}
}
