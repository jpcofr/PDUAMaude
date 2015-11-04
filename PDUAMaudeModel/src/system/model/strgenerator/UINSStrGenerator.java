/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 12:24:22 PM Dec 31, 2008
 * Author: Juan Pablo Contreras Franco
 * Licensed under Academic Free License ("AFL") v. 3.0 scheme
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package system.model.strgenerator;

public class UINSStrGenerator implements IStringGenerator {
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
	 * Generates the string for a microinstruction.
	 * 
	 * @param uInsNum
	 * uInstruction number.
	 * @param operand
	 * Operand.
	 * @param operation
	 * Operation to be made.
	 * @param destiny
	 * Selects the register where the result is going to be put.
	 * @param condition
	 * Jump condition.
	 * @param nextInst
	 * Next instruction if there where a jump.
	 * @param desp
	 * Shift mode.
	 * @param hf
	 * Flag habilitation.
	 * @param hr
	 * Register habilitation.
	 * @param mar
	 * MAR habilitation.
	 * @param mdr
	 * MDR habilitation.
	 * @param rw
	 * Read/write mode.
	 * @param iom
	 * Periferic/memory selector.
	 * @param hri
	 * Instruction register write habilitation.
	 * @param rupc
	 * Set uInstruction number to 0.
	 * @return The string of a microinstruction in PDUA BNF's model
	 * specification.
	 */
	public static String makeUIns(String uInsNum, String operand,
			String operation, String destiny, String condition,
			String nextInst, String desp, String hf, String hr, String mar,
			String mdr, String rw, String iom, String hri, String rupc) {

		return "uins:" + "[" + UINS + "?(" + uInsNum + ")]" + "[" + OPERANDO
				+ "?(" + operand + ")]" + "[" + OPER + "?(" + operation + ")]"
				+ "[" + DESTINO + "?(" + destiny + ")]" + "[" + COND + "?("
				+ condition + ")]" + "[" + SIGINS + "?(" + nextInst + ")]"
				+ "[" + DESP + "?(" + desp + ")]" + "[" + HF + "?(" + hf + ")]"
				+ "[" + HR + "?(" + hr + ")]" + "[" + MARA + "?(" + mar + ")]"
				+ "[" + MDR + "?(" + mdr + ")]" + "[" + RW + "?(" + rw + ")]"
				+ "[" + IOM + "?(" + iom + ")]" + "[" + HRI + "?(" + hri + ")]"
				+ "[" + RUPC + "?(" + rupc + ")]";

	}
}
