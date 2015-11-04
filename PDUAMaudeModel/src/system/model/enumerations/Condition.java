/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 12:13:27 PM Jan 2, 2009
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
public enum Condition {
	UNJ("JU"), NOJ("!J"), ZEJ("JZ"), CAJ("JC"), PAJ("JP"), INJ("JI"), NEJ("JN");

	private final String strValue;

	Condition(String strValue) {
		this.strValue = strValue;
	}

	public String getStr() {
		return strValue;
	}
}
