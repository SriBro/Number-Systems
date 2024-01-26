package systems;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		int decimal = 532;
		int temp = decimal;
		String hexa = "";
		while(decimal!=0) {
			int r = decimal%16;
			hexa = r+hexa;
			decimal/=16;
		}
		System.out.println("HexaDecimal value of "+temp+" is "+hexa);
	}
}
