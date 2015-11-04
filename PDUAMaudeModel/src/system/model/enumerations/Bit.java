/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 11:59:02 AM Jan 2, 2009
 * Author: Juan Pablo Contreras Franco
 * Licensed under Academic Free License ("AFL") v. 3.0 scheme
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
/**
 * 
 */
package system.model.enumerations;

/**
 * @author jpcf
 */
public enum Bit {
	BIT0("0"), BIT1("1");

	private final String strValue;

	Bit(String strValue) {
		this.strValue = strValue;
	}

	public String getStr() {
		return strValue;
	}
}
