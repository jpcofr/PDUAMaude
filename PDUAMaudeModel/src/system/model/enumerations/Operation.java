/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 11:57:43 AM Jan 2, 2009
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
public enum Operation {
	ID("i"), NOT("!"), AND("&"), OR("|"), XOR("#"), ADD("+"), INC("?"), COM("%");
	private final String strValue;

	Operation(String strValue) {
		this.strValue = strValue;
	}

	public String getStr() {
		return strValue;
	}
}
