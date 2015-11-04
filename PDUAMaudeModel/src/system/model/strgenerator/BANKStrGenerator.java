/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 12:27:37 PM Dec 31, 2008
 * Author: Juan Pablo Contreras Franco
 * Licensed under Academic Free License ("AFL") v. 3.0 scheme
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package system.model.strgenerator;

/**
 * This class constructs the strings that make the register's bank.
 * 
 * @author jpcf
 */
public class BANKStrGenerator implements IStringGenerator {
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
	 * Creates a string representing the state of a register' bank. Each
	 * register on the PDUA is represented with a string with its state.
	 * 
	 * @param size
	 * Size of each register.
	 * @param active
	 * Shows if the bank can be written.
	 * @param pcVal
	 * Value of the program counter.
	 * @param spVal
	 * Value of the stack pointer.
	 * @param dptrVal
	 * Value of the data pointer.
	 * @param aVal
	 * Value of A (register).
	 * @param viVal
	 * Value of the interruption vector register.
	 * @param tempVal
	 * Value of the temporal register.
	 * @param ctenVal
	 * Value of the ever-constant register.
	 * @param accVal
	 * Value of the accumulator.
	 * @return The string with the state of the register.
	 * @throws StringGeneratorException
	 */
	public static String makeBankInstance(int size, boolean active, int pcVal,
			int spVal, int dptrVal, int aVal, int viVal, int tempVal,
			int ctenVal, int accVal) throws StringGeneratorException {
		String bit = "";

		if (active) {
			bit = BIT0;
		} else {
			bit = BIT1;
		}

		return HR + ":" + bit + " " + PC
				+ REGStrGenerator.makeRegister(size, pcVal) + " " + SP
				+ REGStrGenerator.makeRegister(size, spVal) + " " + DPTR
				+ REGStrGenerator.makeRegister(size, dptrVal) + " " + A
				+ REGStrGenerator.makeRegister(size, aVal) + " " + VI
				+ REGStrGenerator.makeRegister(size, viVal) + " " + TEMP
				+ REGStrGenerator.makeRegister(size, tempVal) + " " + CTEM1
				+ REGStrGenerator.makeRegister(size, ctenVal) + " " + ACC
				+ REGStrGenerator.makeRegister(size, accVal);
	}

	public static String makeBankGeneric(String active, String pcVal,
			String spVal, String dptrVal, String aVal, String viVal,
			String tempVal, String ctenVal, String accVal) {

		return "banco:" + "[" + HR + "?(" + active + ")]" + "[" + PC + "?("
				+ pcVal + ")]" + "[" + SP + "?(" + spVal + ")]" + "[" + DPTR
				+ "?(" + dptrVal + ")]" + "[" + A + "?(" + aVal + ")]" + "["
				+ VI + "?(" + viVal + ")]" + "[" + TEMP + "?(" + tempVal + ")]"
				+ "[" + CTEM1 + "?(" + ctenVal + ")]" + "[" + ACC + "?("
				+ accVal + ")]";
	}
}
