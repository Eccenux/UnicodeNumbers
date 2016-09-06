package unicodenumbers;

/**
 * Just a testing area.
 *
 * @author Maciej Nux Jaros
 */
public class UnicodeNumbers {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		PositiveCircleFormatter formatter = new PositiveCircleFormatter();

		System.out.println(formatter.isSingleCharacter(10));
		System.out.println(formatter.isSingleCharacter(45));
		System.out.println(formatter.format(10));
	}

}
