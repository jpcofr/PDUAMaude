/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 12:25:46 PM Dec 31, 2008
 * Author: Juan Pablo Contreras Franco
 * Licensed under Academic Free License ("AFL") v. 3.0 scheme
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package system.model.strgenerator;

/**
 * This class constructs the strings of the MDR.
 * 
 * @author jpcf
 */
public class MDRStrGenerator implements IStringGenerator {
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
	 * Generates an MDR with the given values as its state.
	 * 
	 * @param active
	 * String with the semantics specified for the model.
	 * @param dataIn
	 * String with the semantics specified for the model.
	 * @param dataOut
	 * String with the semantics specified for the model.
	 * @return A MDR compliant with the given BNF.
	 */
	public static String makeMDRGeneric(String active, String dataIn,
			String dataOut) {
		return "mdr:" + "[" + HAB + "?(" + active + ")]" + "[" + DATAIN + "?("
				+ dataIn + ")]" + "[" + DATAOUT + "?(" + dataOut + ")]";
	}
}
