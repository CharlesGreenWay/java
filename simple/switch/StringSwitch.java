
public class StringSwitch {

	public static void main(String ...args) {
		int colorCode = getColorCode("red");
		System.out.printf("%X\n", colorCode);
	}
	
	/**
	 * Method to convert a String value like "Red", "Green" or "Blue" to the correpsonding 
	 * HTML color code. 
	 * @param color the color name
	 * @return the html color code
	 */
	static int getColorCode(String color) {
		int colorCode = 0x0;
		if (color == null) {
			return colorCode;
		}
		switch (color.toLowerCase()) {
		case "red":
			colorCode = 0xFF0000;
			break;
		case "green":
			colorCode = 0x00FF00;
			break;
		case "blue":
			colorCode = 0x0000FF;
			break;
		default:
			colorCode = 0x0;
		}
		return colorCode;
	}
}
