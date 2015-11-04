/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 12:04:26 PM Dec 31, 2008
 * Author: Juan Pablo Contreras Franco
 * Licensed under Academic Free License ("AFL") v. 3.0 scheme
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package system.model.strgenerator;

public class REGStrGenerator {
	// -----------------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------------

	// -----------------------------------------------------------------
	// Constructors
	// -----------------------------------------------------------------

	// -----------------------------------------------------------------
	// Methods
	// -----------------------------------------------------------------
	/**
	 * Generates a map.
	 * 
	 * @param cardinality
	 * It has to be enough to represent the value. The Map being generated
	 * represents the value in little endian format. A map has the signature
	 * map{Nat,BIT}.
	 * @param value
	 * Initial value of the register. It has to be positive.
	 * @return A string in Maude's Map normal form with the specified size and
	 * value. The indexing of the map is given in little endian.
	 */
	public static String makeMAP(int cardinality, int value)
			throws StringGeneratorException {
		String map;
		int bit;
		if (cardinality == 0) {
			// Sets the first index of the Register
			bit = value & 1;
			return "insert(0, " + bit + ", empty)";
		}
		bit = (value & (1 << cardinality)) / (1 << cardinality);
		map = "insert(" + String.valueOf(cardinality) + ", "
				+ String.valueOf(bit) + ", " + makeMAP(cardinality - 1, value)
				+ ")";
		return map;
	}

	/**
	 * Encloses the map generator to create a register.
	 * 
	 * @param length
	 * Number of places in a register.
	 * @param value
	 * Initial value of the register
	 * @return The string representing the register.
	 * @throws StringGeneratorException
	 */
	public static String makeRegister(int length, int value)
			throws StringGeneratorException {
		length++;
		if (value > Math.pow(2, length)) {
			throw new StringGeneratorException(
					"Number representation exceeds register capacity.");
		} else if (length < 1) {
			throw new StringGeneratorException(
					"Cannot make register. Lenght too small.");

		}

		length = length - 2;
		return "reg(" + makeMAP(length, value) + ")";
	}

}
