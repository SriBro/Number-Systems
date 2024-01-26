package systems;

public class DecimalToOctal {

	public static void main(String[] args) {
		int decimal = 532;
		int temp = decimal;
		String octal = "";
		while(decimal!=0) {
			int r = decimal%8;
			octal = r+octal;
			decimal/=8;
		}
		System.out.println("Octal value of "+temp+" is "+octal);
	}

}
