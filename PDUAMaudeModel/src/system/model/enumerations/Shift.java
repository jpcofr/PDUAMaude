/**
 * 
 */
package system.model.enumerations;

/**
 * @author jpcf
 */
public enum Shift {
	NSH("IZ"), SHR("NO"), SHL("DE");

	private final String strValue;

	Shift(String strValue) {
		this.strValue = strValue;
	}

	public String getStr() {
		return strValue;
	}

}
