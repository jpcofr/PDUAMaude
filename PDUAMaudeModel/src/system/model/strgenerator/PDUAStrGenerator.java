/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 4:14:33 PM Dec 31, 2008
 * Author: Juan Pablo Contreras Franco
 * Licensed under Academic Free License ("AFL") v. 3.0 scheme
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package system.model.strgenerator;

/**
 * The methods provided here help to construct complete strings to represent the
 * state of a PDUA device.
 * 
 * @author jpcf
 */
public class PDUAStrGenerator implements IStringGenerator {
	// -----------------------------------------------------------------
	// Attributes
	// -----------------------------------------------------------------

	// -----------------------------------------------------------------
	// Constructors
	// -----------------------------------------------------------------
	/**
 * 
 */
	public PDUAStrGenerator() {
		System.out.println("Constructor listo\n");
	}

	// -----------------------------------------------------------------
	// Methods
	// -----------------------------------------------------------------

	/**
	 * Generates a PDUA string with the strings given as parameters.
	 * 
	 * @param uInsNumUIns
	 * uInstruction parameter.
	 * @param operandUIns
	 * uInstruction parameter.
	 * @param operationUIns
	 * uInstruction parameter.
	 * @param destinyUIns
	 * uInstruction parameter.
	 * @param conditionUIns
	 * uInstruction parameter.
	 * @param nextInstUIns
	 * uInstruction parameter.
	 * @param despUIns
	 * uInstruction parameter.
	 * @param hfUIns
	 * uInstruction parameter.
	 * @param hrUIns
	 * uInstruction parameter.
	 * @param marUIns
	 * uInstruction parameter.
	 * @param mdrUIns
	 * uInstruction parameter.
	 * @param rwUIns
	 * uInstruction parameter.
	 * @param iomUIns
	 * uInstruction parameter.
	 * @param hriUIns
	 * uInstruction parameter.
	 * @param rupcUIns
	 * uInstruction parameter.
	 * @param insHeaderUC
	 * Control unit parameter.
	 * @param uPCUC
	 * Control unit parameter.
	 * @param resetUC
	 * Control unit parameter.
	 * @param iomUC
	 * Control unit parameter.
	 * @param rwUC
	 * Control unit parameter.
	 * @param interUC
	 * Control unit parameter.
	 * @param jevUC
	 * Control unit parameter.
	 * @param activeALU
	 * ALU parameter.
	 * @param operationALU
	 * ALU parameter.
	 * @param carryALU
	 * ALU parameter.
	 * @param negativeALU
	 * ALU parameter.
	 * @param parityALU
	 * ALU parameter.
	 * @param zeroALU
	 * ALU parameter.
	 * @param outputALU
	 * ALU parameter.
	 * @param activeBANK
	 * BANK parameter.
	 * @param pcValBANK
	 * BANK parameter.
	 * @param spValBANK
	 * BANK parameter.
	 * @param dptrValBANK
	 * BANK parameter.
	 * @param aValBANK
	 * BANK parameter.
	 * @param viValBANK
	 * BANK parameter.
	 * @param tempValBANK
	 * BANK parameter.
	 * @param ctenValBANK
	 * BANK parameter.
	 * @param accValBANK
	 * BANK parameter.
	 * @param activeMAR
	 * BANK parameter.
	 * @param addressMAR
	 * BANK parameter.
	 * @param activeMDR
	 * BANK parameter.
	 * @param dataInMDR
	 * BANK parameter.
	 * @param dataOutMDR
	 * BANK parameter.
	 * @return The string of a PDUA as specified in the BNF.
	 */
	public static String makePDUAGeneric(String uInsNumUIns,
			String operandUIns, String operationUIns, String destinyUIns,
			String conditionUIns, String nextInstUIns, String despUIns,
			String hfUIns, String hrUIns, String marUIns, String mdrUIns,
			String rwUIns, String iomUIns, String hriUIns, String rupcUIns,
			String insHeaderUC, String uPCUC, String resetUC, String iomUC,
			String rwUC, String interUC, String jevUC, String activeALU,
			String operationALU, String carryALU, String negativeALU,
			String parityALU, String zeroALU, String outputALU,
			String activeBANK, String pcValBANK, String spValBANK,
			String dptrValBANK, String aValBANK, String viValBANK,
			String tempValBANK, String ctenValBANK, String accValBANK,
			String activeMAR, String addressMAR, String activeMDR,
			String dataInMDR, String dataOutMDR) {

		return "< T : Pdua | "
				+ UINSStrGenerator.makeUIns(uInsNumUIns, operandUIns,
						operationUIns, destinyUIns, conditionUIns,
						nextInstUIns, despUIns, hfUIns, hrUIns, marUIns,
						mdrUIns, rwUIns, iomUIns, hriUIns, rupcUIns)
				+ ", "
				+ UCStrGenerator.makeUCGeneric(insHeaderUC, uPCUC, resetUC,
						iomUC, rwUC, interUC, jevUC)
				+ ", "
				+ ALUStrGenerator.makeALUGeneric(activeALU, operationALU,
						carryALU, negativeALU, parityALU, zeroALU, outputALU)
				+ ", "
				+ BANKStrGenerator.makeBankGeneric(activeBANK, pcValBANK,
						spValBANK, dptrValBANK, aValBANK, viValBANK,
						tempValBANK, ctenValBANK, accValBANK)
				+ ", "
				+ MARStrGenerator.makeMARGeneric(activeMAR, addressMAR)
				+ ", "
				+ MDRStrGenerator.makeMDRGeneric(activeMDR, dataInMDR,
						dataOutMDR) + " >";

	}
}
