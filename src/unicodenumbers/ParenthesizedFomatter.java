package unicodenumbers;

/**
 * Outputs numbers in parentheses.
 * 
 * @author Maciej Nux Jaros
 */
public class ParenthesizedFomatter extends PositiveCircleFormatter {
	@Override
	public String format(int number) {
		if (isSingleCharacter(number)) {
			if (number >= 1 && number <= 20) {
				return unicode(0x2474 + number - 1);
			}
		}

		return String.format("%d", number);
	}

}
