/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 12:24:56 PM Dec 31, 2008
 * Author: Juan Pablo Contreras Franco
 * Licensed under Academic Free License ("AFL") v. 3.0 scheme
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package system.model.strgenerator;

import system.model.enumerations.Bit;

/**
 * This class constructs the strings of the MAR.
 * 
 * @author jpcf
 */
public class MARStrGenerator implements IStringGenerator {
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
	 * Generates a string of a MAR in accordance with the specified BNF.
	 * 
	 * @param active
	 * Sets as active or inactive the MAR in the sense of de PDUA's BNF. If
	 * active is true, then the value on the MAR string is '1', '0' otherwise.
	 * @param addressSize
	 * Size of the addressable space written as the number of bits in the
	 * address bus.
	 * @param address
	 * A number in the range of the addressable memory space.
	 * @return The MAR string as specified in the BNF.
	 * @throws StringGeneratorException
	 */
	public static String makeMARInstance(Bit active, int addressSize,
			int address) throws StringGeneratorException {

		return HAB + ":" + active.getStr() + " " + DIRECCION + ":"
				+ REGStrGenerator.makeRegister(addressSize, address);

	}

	/**
	 * Generates a generic MAR, i.e. a MAR that has its states generalized or
	 * specified as variables, not constants.
	 * 
	 * @param active
	 * A string that represents a MAUDE variable.
	 * @param address
	 * A string that represents a MAUDE variable.
	 * @return A generic MAR.
	 */
	public static String makeMARGeneric(String active, String address) {
		return "mar:" + "[" + HAB + "?(" + active + ")]" + "[" + DIRECCION
				+ "?(" + address + ")]";

	}

}
