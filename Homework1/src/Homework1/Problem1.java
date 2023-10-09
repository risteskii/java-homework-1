package Homework1;

public class Problem1 { //MathCalc
	
	public static double calculateVolume(double diameter) {
		double radius = diameter / 2;
		double volume = 4*Math.PI*Math.pow(radius, 3)/3;
		
		return volume;
	}
	
	public static void main(String[] args)
	{
		int sunDiameter = 865000;
		int earthDiameter = 7600;
		
		double earthVolume = calculateVolume(earthDiameter);
		double sunVolume = calculateVolume(sunDiameter);
		double sunEarthRatio = sunVolume / earthVolume;

		System.out.printf("The volume of the Earth is %.3f cubic miles,\nthe volume of the"
				+ " Sun is %.3f cubic miles,\nand the ratio of the volume of the Sun to the volume of the Earth is %.3f.\n",
				earthVolume, sunVolume , sunEarthRatio);
	// I get slightly different values on my scientific calculator, but it seems that i need to use the BigDecimal class, and also define PI
	// because java counts it as a 16 digit variable and rounds it up, while my PC calculator sees PI as a 32 digit variable.
	// if needed, I can define the values with BigDecimal
	}
}	