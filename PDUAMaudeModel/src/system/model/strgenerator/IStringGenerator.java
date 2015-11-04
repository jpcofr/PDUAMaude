/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * PDUAMaudeModel, 12:04:37 PM Dec 31, 2008
 * Author: Juan Pablo Contreras Franco
 * Licensed under Academic Free License ("AFL") v. 3.0 scheme
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package system.model.strgenerator;

/**
 * Some of this constants have been defined on enumerations. They are, howerver,
 * deliberately stated here for the purpose of being reference.
 * 
 * @author jpcf
 */
public interface IStringGenerator {

	// TODO Hacer los comentarios. Poco urgente.
	// -----------------------------------------------------------------
	// Constants
	// -----------------------------------------------------------------
	/**
	 * Register's values
	 */
	final String BIT0 = "0";

	final String BIT1 = "1";

	/**
	 * String constants for the ALU's operations
	 */
	final String REGISTER = "REGISTER";

	final int ACT = 0;

	final int MREG = 1;

	final int ANDREG = 2;

	final int ANDPAR = 3;

	final int ANDZERO = 4;

	final int ANDNEG = 5;

	final int NULL_PARAMETER = 6;

	final int ORREG = 7;

	final int ORZERO = 8;

	final int ORPAR = 9;

	final int ORNEG = 10;

	final int NOTREG = 11;

	final int NOTZERO = 12;

	final int NOTPAR = 13;

	final int NOTNEG = 14;

	final int XORREG = 15;

	final int XORPAR = 16;

	final int XORZERO = 17;

	final int XORNEG = 18;

	final int IDREG = 19;

	final int IDPAR = 20;

	final int IDNEG = 21;

	final int IDZERO = 22;

	final int SHLREG = 23;

	final int SHLZERO = 24;

	final int SHLPAR = 25;

	final int SHLNEG = 26;

	final int ADDCAR = 27;

	final int ADDREG = 28;

	final int ADDZERO = 29;

	final int ADDPAR = 30;

	final int ADDNEG = 31;

	final int SHRPAR = 32;

	final int SHRREG = 33;

	final int SHRZERO = 34;

	final String HF = "HF";

	final String DESP = "DESP";

	final String SELOP = "SELOP";

	final String ZF = "Z";

	final String CF = "C";

	final String NF = "N";

	final String PF = "P";

	final String OUTPUT = "OUTPUT";

	/**
	 * Strings to represent conditions
	 */
	final String UNJ = "JU";

	final String NOJ = "!J";

	final String ZEJ = "JZ";

	final String CAJ = "JC";

	final String PAJ = "JP";

	final String INJ = "JI";

	final String NEJ = "JN";

	/**
	 * Strings for MAR
	 */

	final String HAB = "HABILITADO";

	final String DIRECCION = "DIRECCION";

	/**
	 * Strings for the register's bank.
	 */

	final String HR = "HR";

	final String PC = "PC";

	final String SP = "SP";

	final String DPTR = "DPTR";

	final String A = "A";

	final String VI = "VI";

	final String TEMP = "TEMP";

	final String ACC = "ACC";

	final String CTEM1 = "CTE-1";

	/**
	 * Strings for MDR
	 */

	final String DATAIN = "DATAIN";

	final String DATAOUT = "DATAOUT";

	final String MDR = "MDR";

	/**
	 * Strings for the UC
	 */
	final String INSH = "INSH";

	final String UPC = "UPC";

	final String RST = "RST";

	final String IOM = "IOM";

	final String RW = "RW";

	final String INTER = "INTER";

	final String JEV = "JEV";

	/**
	 * Strings for uInstructions
	 */

	final String UINS = "UINS";

	final String OPERANDO = "OPERANDO";

	final String OPER = "OPERACION";

	final String DESTINO = "DESTINO";

	final String COND = "CONDICION";

	final String SIGINS = "SIGINS";

	final String MARA = "MAR";

	final String HRI = "HRI";

	final String RUPC = "RUPC";

	// -----------------------------------------------------------------
	// Signatures
	// -----------------------------------------------------------------

};
