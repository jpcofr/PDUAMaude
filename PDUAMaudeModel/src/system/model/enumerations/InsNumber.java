/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 11:50:48 AM Jan 2, 2009
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
public enum InsNumber {

	I0("ui0"), I1("ui1"), I2("ui2"), I3("ui3"), I4("ui4"), I5("ui5"), I6("ui6"), I7(
			"ui7");
	private final String strValue;

	InsNumber(String strValue) {
		this.strValue = strValue;
	}

	public String getStr() {
		return strValue;
	}

}
