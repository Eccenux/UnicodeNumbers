package unicodenumbers;

/**
 * Outputs numbers in a positivie (white/empty) circle.
 * 
 * @author Maciej Nux Jaros
 */
public class PositiveCircleFormatter extends UnicodeNumberFormatter {
	public PositiveCircleFormatter() {
		minNumber = 0;
		maxNumber = 50;
	}

	@Override
	public String format(int number) {
		if (isSingleCharacter(number)) {
			if (number == 0) {
				return "\u24EA";
			} else if (number >= 1 && number <= 20) {
				return unicode(0x2460 + number - 1);
			} else if (number >= 21 && number <= 35) {
				return unicode(0x3251 + number - 21);
			} else if (number >= 36 && number <= 50) {
				return unicode(0x32B1 + number - 36);
			}
		}
		return String.format("%d", number);
	}

}
