/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 11:40:48 AM Jan 2, 2009
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
public enum Register {
	PC("PC"), SP("SP"), DPTR("DPTR"), A("A"), VI("VI"), TEMP("TEMP"), ACC("ACC"), CTEM1(
			"CTE-1");
	public final String strValue;

	Register(String strValue) {
		this.strValue = strValue;
	}

	public String getStr() {
		return strValue;
	}

}
