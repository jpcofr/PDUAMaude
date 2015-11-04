/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 9:19:38 PM Nov 3, 2008 Author: Juan Pablo Contreras Franco
 * Licensed under Academic Free License ("AFL") v. 3.0 scheme
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package system.model.strgenerator;

import system.model.enumerations.Bit;
import system.model.enumerations.Operation;

//TODO set the specification of this class
/**
 * This class knows how to write all the strings for the ALU's operations.
 * Moreover.....
 * 
 * @author jpcf
 */

public class ALUStrGenerator implements IStringGenerator {

	/*
	 * public static void main(String[] args) { new ALUStrGenerator(); try { /
	 * sg.generateTestString(8, 8, 4, ORNEG, NULL_PARAMETER);
	 * sg.generateTestString(5, 10, 4, ORNEG, NULL_PARAMETER);
	 * sg.generateTestString(0, 0, 4, ORNEG, NULL_PARAMETER); /
	 * sg.generateTestString(5, 5, 4, ORZERO, NULL_PARAMETER);
	 */

	/*
	 * System.out.println("JMP:   		 	" + REGStrGenerator.makeRegister(5, 10));
	 * System.out.println("JZ:    		 	" + REGStrGenerator.makeRegister(5, 11));
	 * System.out.println("FETCH: 		 	" + REGStrGenerator.makeRegister(5, 0));
	 * System.out.println("AND ACC,A:	 	" + REGStrGenerator.makeRegister(5, 8));
	 * System.out.println("ADD ACC,A: 	 	" + REGStrGenerator.makeRegister(5,
	 * 9)); System.out.println("MOV A,ACC: 	 	" +
	 * REGStrGenerator.makeRegister(5, 2)); System.out.println("MOV ACC,CTE: 	"
	 * + REGStrGenerator.makeRegister(5, 3));
	 * System.out.println("MOV ACC,A:   	" + REGStrGenerator.makeRegister(5,
	 * 1)); System.out.println("JN DIR: 	 	" + REGStrGenerator.makeRegister(5,
	 * 12)); System.out.println("JC DIR: 	 	" + REGStrGenerator.makeRegister(5,
	 * 13)); System.out.println("MOV [DPTR],ACC: " +
	 * REGStrGenerator.makeRegister(5, 6)); System.out.println("INV ACC:		" +
	 * REGStrGenerator.makeRegister(5, 7));
	 * System.out.println("MOV ACC,[DPTR]: " + REGStrGenerator.makeRegister(5,
	 * 4)); System.out.println("MOV DPTR,ACC:  	" +
	 * REGStrGenerator.makeRegister(5, 5)); System.out.println("CALL DIR: 		" +
	 * REGStrGenerator.makeRegister(5, 14)); System.out .println("RET: 			" +
	 * REGStrGenerator.makeRegister(5, 15)); } catch (StringGeneratorException
	 * exception) { System.out.println(exception.getMessage());
	 * exception.printStackTrace(); } }
	 */

	// -----------------------------------------------------------------
	// Constructors
	// -----------------------------------------------------------------
	public ALUStrGenerator() {
	}

	// -----------------------------------------------------------------
	// Methods
	// -----------------------------------------------------------------
	/**
	 * Generates the string being selected.
	 * 
	 * @param firstOperandValue
	 * First register.
	 * @param secondOperandValue
	 * Second register (if it is necessary for the completion of the operation).
	 * @param registerLength
	 * length of the register.
	 * @param operation
	 * Operation code.
	 * @param operationParamenter
	 * Parameter given to the selected operator if applicable.
	 * @throws StringGeneratorException
	 * Exception thrown whenever there is a problem with the basic operation
	 * definitions.
	 */
	public void generateTestString(int firstOperandValue,
			int secondOperandValue, int registerLength, int operation,
			int operationParamenter) throws StringGeneratorException {
		int a = firstOperandValue;
		int b = secondOperandValue;
		int pr = operationParamenter;
		int length = registerLength;
		String out = "";
		String term = "";
		try {
			switch (operation) {
			case ACT:
				term = makeACT(REGStrGenerator.makeRegister(length, a), pr);
				break;
			case MREG:
				term = makeMREG(REGStrGenerator.makeRegister(length, a));
				break;
			case ANDREG:
				term = makeANDREG(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ANDPAR:
				term = makeANDPAR(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ANDZERO:
				term = makeANDZERO(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ANDNEG:
				term = makeANDNEG(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ORREG:
				term = makeORREG(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ORZERO:
				term = makeORZERO(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ORPAR:
				term = makeORPAR(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ORNEG:
				term = makeORNEG(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case NOTREG:
				term = makeNOTREG(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case NOTZERO:
				term = makeNOTZERO(REGStrGenerator.makeRegister(length, a),
						length);
			case NOTPAR:
				term = makeNOTPAR(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case NOTNEG:
				term = makeNOTNEG(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case XORREG:
				term = makeXORREG(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case XORPAR:
				term = makeXORPAR(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case XORZERO:
				term = makeXORZERO(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case XORNEG:
				term = makeXORNEG(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case IDREG:
				term = makeIDREG(REGStrGenerator.makeRegister(length, a));
				break;
			case IDPAR:
				term = makeIDPAR(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case IDNEG:
				term = makeIDNEG(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case IDZERO:
				term = makeIDZERO(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case SHLREG:
				term = makeSHLREG(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case SHLZERO:
				term = makeSHLZERO(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case SHLPAR:
				term = makeSHLPAR(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case SHLNEG:
				term = makeSHLNEG(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case ADDCAR:
				term = makeADDCAR(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ADDREG:
				term = makeADDREG(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ADDZERO:
				term = makeADDZERO(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ADDPAR:
				term = makeADDPAR(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case ADDNEG:
				term = makeADDNEG(REGStrGenerator.makeRegister(length, a),
						REGStrGenerator.makeRegister(length, b), length);
				break;
			case SHRPAR:
				term = makeSHRPAR(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case SHRREG:
				term = makeSHRREG(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			case SHRZERO:
				term = makeSHRZERO(REGStrGenerator.makeRegister(length, a),
						length);
				break;
			default:
				out = "There is no operation matching your selection.";
			}
		} catch (StringGeneratorException exception) {
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
		if (out.equals("")) {
			out = makeReductionString(REGISTER, term);
		}
		System.out.println(out + "\n");
	}

	/**
	 * Generates the position projection function string.
	 * 
	 * @param register
	 * The register to be projected.
	 * @param position
	 * The position of the register being projected. Position has to be a
	 * natural number > 0.
	 * @return The entire function.
	 */
	public String makeACT(String register, int position) {
		position--;
		return "act(" + register + ", " + position + ")";
	}

	/**
	 * Calculates the string to execute the carry of an ADD operation.
	 * 
	 * @param firstOperand
	 * @param secondOperand
	 * @param registerLength
	 * @return The string representing the carry of an ADD operation
	 * calculation.
	 */
	public String makeADDCAR(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "addcar(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Calculates the string to execute the negative flag of an ADD operation.
	 * 
	 * @param firstOperand
	 * @param secondOperand
	 * @param registerLength
	 * @return The string representing a negative flag calculation for an ADD.
	 */
	public String makeADDNEG(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "addneg(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Calculates the string to execute the parity flag of an ADD operation.
	 * 
	 * @param firstOperand
	 * @param secondOperand
	 * @param registerLength
	 * @return The string representing a zero flag calculation for an ADD.
	 */
	public String makeADDPAR(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "addpar(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Calculates the string to execute an ADD operation.
	 * 
	 * @param firstOperand
	 * @param secondOperand
	 * @param registerLength
	 * @return The string representing an ADD operation.
	 */
	public String makeADDREG(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "addreg(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Calculates the string to execute the zero flag of an ADD operation.
	 * 
	 * @param firstOperand
	 * @param secondOperand
	 * @param registerLength
	 * @return The string representing an zero flag calculation for an ADD.
	 */
	public String makeADDZERO(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "addzero(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string of an AND negative flag operation calculus.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an AND negative calculation.
	 */
	public String makeANDNEG(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "andneg(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string of an AND parity flag operation calculus.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an AND parity calculation.
	 */
	public String makeANDPAR(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "andpar(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string of an AND operation.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an AND operation.
	 */
	public String makeANDREG(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "andreg(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string of an AND zero flag operation calculus.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an AND zero calculation.
	 */
	public String makeANDZERO(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "andzero(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the String for an ID negative flag calculation.
	 * 
	 * @param firstOperand
	 * @param registerLength
	 * @return The String for an ID negative flag calculation.
	 */
	public String makeIDNEG(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "idneg(" + a + ", " + length + ")";
	}

	/**
	 * Generates the string for a ID parity flag operation calculus.
	 * 
	 * @param firstOperand
	 * @param registerLength
	 * @return The string of an ID parity calculation.
	 */
	public String makeIDPAR(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "idpar(" + a + ", " + length + ")";
	}

	/**
	 * Register identity operation
	 * 
	 * @param firstOperand
	 * @return The string representing a idreg calculation.
	 */
	public String makeIDREG(String firstOperand) {
		String a = firstOperand;
		return "idreg(" + a + ")";
	}

	/**
	 * Generates the String for an ID zero flag calculation.
	 * 
	 * @param firstOperand
	 * @param registerLength
	 * @return The String for an ID zero flag calculation.
	 */
	public String makeIDZERO(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "idzero(" + a + ", " + length + ")";
	}

	/**
	 * Generates the string for the register projection.
	 * 
	 * @param register
	 * String of the register to be projected.
	 * @return The mreg projection function over a register string.
	 */
	public String makeMREG(String register) {
		return "mreg(" + register + ")";
	}

	/**
	 * Generates the string for the signature of a not negative flag.
	 * 
	 * @param firstOperand
	 * @param registerLength
	 * @return The string for a not negative flag.
	 */
	public String makeNOTNEG(String firstOperand, int registerLength) {
		String a = firstOperand;
		registerLength = registerLength - 1;
		return "notneg(" + a + ", " + registerLength + ")";
	}

	/**
	 * Generates the string for the signature of a not parity flag.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param registerLength
	 * length of the operand.
	 * @return The signature with its arguments as given by the parameters.
	 */
	public String makeNOTPAR(String firstOperand, int registerLength) {
		String a = firstOperand;
		registerLength = registerLength - 1;
		return "notpar(" + a + ", " + registerLength + ")";
	}

	/**
	 * Generates the string of an NOT operation.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an NOT calculation.
	 */
	public String makeNOTREG(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "notreg(" + a + ", " + length + ")";
	}

	/**
	 * Generates the string for the signature of a not zero flag.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param registerLength
	 * length of the operand.
	 * @return The signature with its arguments as given by the parameters.
	 */
	public String makeNOTZERO(String firstOperand, int registerLength) {
		String a = firstOperand;
		registerLength = registerLength - 1;
		return "notzero(" + a + ", " + registerLength + ")";
	}

	/**
	 * Generates the string of an OR negative flag operation calculus.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an OR negative calculation.
	 */
	public String makeORNEG(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "orneg(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string of an OR parity flag operation calculus.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an OR parity calculation.
	 */
	public String makeORPAR(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "orpar(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string of a OR operation.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of a OR operation.
	 */
	public String makeORREG(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "orreg(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string of an OR zero flag operation calculus.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an OR zero calculation.
	 */
	public String makeORZERO(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "orzero(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates a string ready to be used in Maude's interpreter.
	 * 
	 * @param moduleName
	 * The name of the module which is going to be used for the reduction of the
	 * given term.
	 * @param term
	 * The term to be reduced."
	 * @return A string ready to be used in Maude's interpreter.
	 */
	public String makeReductionString(String moduleName, String term) {
		return "reduce in " + moduleName + " : " + term + " .";
	}

	/**
	 * Generates the string for the calculation of the negative flag in a left
	 * shift operation.
	 * 
	 * @param firstOperand
	 * @param registerLength
	 * @return The string for the calculation of the negative flag on a shift
	 * left operation.
	 */
	public String makeSHLNEG(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "shlneg(" + a + ", " + length + ")";
	}

	/**
	 * Generates the string for the calculation of the parity flag in a left
	 * shift operation.
	 * 
	 * @param firstOperand
	 * @param registerLength
	 * @return the string for the calculation of the parity flag on a shift left
	 * operation.
	 */
	public String makeSHLPAR(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "shlpar(" + a + ", " + length + ", " + length + ")";
	}

	/**
	 * Generates the string for the calculation of a left shift.
	 * 
	 * @param firstOperand
	 * @param registerLength
	 * @return The string for a shlreg calculation.
	 */
	public String makeSHLREG(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "shlreg(" + a + ", " + length + ", " + length + ")";
	}

	/**
	 * Generates the string for the calculation of the zero flag in a left shift
	 * operation.
	 * 
	 * @param firstOperand
	 * @param registerLength
	 * @return the string for the calculation of the zero flag on a shift left
	 * operation.
	 */
	public String makeSHLZERO(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "shlzero(" + a + ", " + length + ", " + length + ")";
	}

	/**
	 * Creates the string for the calculation of the parity in a SHR operation.
	 * 
	 * @param firstOperand
	 * @param registerLength
	 * @return The string to calculate the parity of a right shift.
	 */
	public String makeSHRPAR(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "shrpar(" + a + ", " + length + ")";
	}

	/**
	 * Creates the string for the right shift calculation.
	 * 
	 * @param firstOperand
	 * @param registerLength
	 * @return the string to calculate the right shift
	 */
	public String makeSHRREG(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "shrreg(" + a + ", " + length + ", " + length + ")";
	}

	/**
	 * @param makeRegister
	 * @param length
	 * @return
	 */
	public String makeSHRZERO(String firstOperand, int registerLength) {
		String a = firstOperand;
		int length = registerLength - 1;
		return "shrzero(" + a + ", " + length + ")";
	}

	/**
	 * Generates the string of an XOR negative flag operation calculus.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an XOR negative calculation.
	 */
	public String makeXORNEG(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "xorneg(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string of an XOR parity flag operation calculus.
	 * 
	 * @param firstOperand
	 * @param secondOperand
	 * @param registerLength
	 * @return The string for a XOR parity calculation.
	 */
	public String makeXORPAR(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "xorpar(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string of an XOR operation calculus.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an XOR calculation.
	 */
	public String makeXORREG(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "xorreg(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string of an XOR zero flag operation calculus.
	 * 
	 * @param firstOperand
	 * String for the first operand.
	 * @param secondOperand
	 * String for the second operand.
	 * @param registerLength
	 * Length of both registers.
	 * @return The string of an AND negative calculation.
	 */
	public String makeXORZERO(String firstOperand, String secondOperand,
			int registerLength) {
		String a = firstOperand;
		String b = secondOperand;
		int length = registerLength - 1;
		return "xorzero(" + a + ", " + b + ", " + length + ")";
	}

	/**
	 * Generates the string for an instance of an ALU with specific values.
	 * 
	 * @param size
	 * Register's size.
	 * @param active
	 * Are the flags changeable?
	 * @param operation
	 * The operation that the ALU has to execute.
	 * @param carry
	 * Carry flag.
	 * @param negative
	 * Negative flag.
	 * @param parity
	 * Parity flag.
	 * @param zero
	 * Zero flag.
	 * @param output
	 * Output string in register's format as specified in the BNF.
	 * @return Returns the string of a specific ALU state.
	 * @throws StringGeneratorException
	 */
	public static String makeALUInstance(int size, Bit active,
			Operation operation, Bit carry, Bit negative, Bit parity, Bit zero,
			int output) throws StringGeneratorException {

		String stringOutput = REGStrGenerator.makeRegister(size, output);

		return HF + ":" + active + " " + SELOP + ":" + operation + " " + CF
				+ ":" + carry + " " + NF + ":" + negative + " " + PF + ":"
				+ parity + " " + ZF + ":" + zero + " " + OUTPUT + ":"
				+ stringOutput;

	}

	// TODO Es necesario que en los generadores de cadenas genéricas se
	// especifique que los parámetros son cadenas de caracteres porque van a
	// estar recibiendo literales y no cadenas puntuales de simbolos de la ALU.
	/**
	 * Generates an ALU with abstract values on its state elements.
	 * 
	 * @param active
	 * String variable with the expected semantics for the ALU.
	 * @param operation
	 * String variable with the expected semantics for the ALU.
	 * @param carry
	 * String variable with the expected semantics for the ALU.
	 * @param negative
	 * String variable with the expected semantics for the ALU.
	 * @param parity
	 * String variable with the expected semantics for the ALU.
	 * @param zero
	 * String variable with the expected semantics for the ALU.
	 * @param output
	 * String variable with the expected semantics for the ALU.
	 * @return A generic ALU with the given variables as its state.
	 */
	public static String makeALUGeneric(String active, String operation,
			String carry, String negative, String parity, String zero,
			String output) {
		return "alu:" + "[" + HF + "?(" + active + ")]" + "[" + SELOP + "?("
				+ operation + ")]" + "[" + CF + "?(" + carry + ")]" + "[" + NF
				+ "?(" + negative + ")]" + "[" + PF + "?(" + parity + ")]"
				+ "[" + ZF + "?(" + zero + ")]" + "[" + OUTPUT + "?(" + output
				+ ")]";
	}
}
