/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 4:26:59 PM Dec 31, 2008
 * Author: Juan Pablo Contreras Franco
 * Licensed under Academic Free License ("AFL") v. 3.0 scheme
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package system.model.strgenerator;

public class UCStrGenerator implements IStringGenerator {
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
	 * Generates an string representing a control unit.
	 * 
	 * @param insHeader
	 * String for instruction header.
	 * @param uPC
	 * String for microprogram counter.
	 * @param reset
	 * String for reset.
	 * @param iom
	 * String for IO or periferic selection.
	 * @param rw
	 * String for read/write mode.
	 * @param inter
	 * String for interruption.
	 * @param jev
	 * String for jump evaluation module.
	 * @return Returns a string representing the control unit of a PDUA in
	 * accordance to BNF's specification.
	 */
	public static String makeUCGeneric(String insHeader, String uPC,
			String reset, String iom, String rw, String inter, String jev) {
		return "uc:" + "[" + INSH + "?(" + insHeader + ")]" + "[" + UPC + "?("
				+ uPC + ")]" + "[" + RST + "?(" + reset + ")]" + "[" + IOM
				+ "?(" + iom + ")]" + "[" + RW + "?(" + rw + ")]" + "[" + INTER
				+ "?(" + inter + ")]" + "[" + JEV + "?(" + jev + ")]";

	}

}
