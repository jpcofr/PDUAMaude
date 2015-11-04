/**
 * 
 */
package system.gui.frame;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import system.gui.panel.ALUPanel;
import system.gui.panel.BankPanel;
import system.gui.panel.MARPanel;
import system.gui.panel.MDRPanel;
import system.gui.panel.UCPanel;
import system.gui.panel.UInsPanel;
import system.model.strgenerator.PDUAStrGenerator;

/**
 * @author jpcf
 */
public class Initial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel = null;
	private ALUPanel ALUPanel = null;
	private BankPanel bankPanel = null;
	private MARPanel MARPanel = null;
	private MDRPanel MDRPanel = null;
	private UCPanel UCPanel = null;
	private UInsPanel uInsPanel = null;
	private JButton genCadenaBtn = null;

	/**
	 * This is the default constructor
	 */
	public Initial() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(800, 618);
		this.setResizable(false);
		this.setPreferredSize(new Dimension(300, 543));
		this.setContentPane(getJPanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setName("frame");
		this.setTitle("PDUA System");
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.fill = GridBagConstraints.BOTH;
			gridBagConstraints6.gridwidth = 3;
			gridBagConstraints6.gridy = 3;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = GridBagConstraints.BOTH;
			gridBagConstraints5.gridy = 2;
			gridBagConstraints5.gridx = 1;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridy = 2;
			gridBagConstraints4.gridx = 0;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 2;
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridy = 1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 1;
			gridBagConstraints2.fill = GridBagConstraints.BOTH;
			gridBagConstraints2.gridy = 1;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 1;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 2;
			gridBagConstraints.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints.gridy = 2;
			jPanel = new JPanel();
			jPanel.setLayout(new GridBagLayout());
			jPanel.add(getALUPanel(), gridBagConstraints);
			jPanel.add(getBankPanel(), gridBagConstraints1);
			jPanel.add(getMARPanel(), gridBagConstraints4);
			jPanel.add(getMDRPanel(), gridBagConstraints5);
			jPanel.add(getUCPanel(), gridBagConstraints3);
			jPanel.add(getUInsPanel(), gridBagConstraints2);
			jPanel.add(getGenCadenaBtn(), gridBagConstraints6);
		}
		return jPanel;
	}

	/**
	 * This method initializes ALUPanel
	 * 
	 * @return system.gui.panel.ALUPanel
	 */
	private ALUPanel getALUPanel() {
		if (ALUPanel == null) {
			ALUPanel = new ALUPanel();
			ALUPanel.setPreferredSize(new Dimension(200, 188));
		}
		return ALUPanel;
	}

	/**
	 * This method initializes bankPanel
	 * 
	 * @return system.gui.panel.BankPanel
	 */
	private BankPanel getBankPanel() {
		if (bankPanel == null) {
			bankPanel = new BankPanel();
		}
		return bankPanel;
	}

	/**
	 * This method initializes MARPanel
	 * 
	 * @return system.gui.panel.MARPanel
	 */
	private MARPanel getMARPanel() {
		if (MARPanel == null) {
			MARPanel = new MARPanel();
		}
		return MARPanel;
	}

	/**
	 * This method initializes MDRPanel
	 * 
	 * @return system.gui.panel.MDRPanel
	 */
	private MDRPanel getMDRPanel() {
		if (MDRPanel == null) {
			MDRPanel = new MDRPanel();
		}
		return MDRPanel;
	}

	/**
	 * This method initializes UCPanel
	 * 
	 * @return system.gui.panel.UCPanel
	 */
	private UCPanel getUCPanel() {
		if (UCPanel == null) {
			UCPanel = new UCPanel();
			UCPanel.setPreferredSize(new Dimension(200, 190));
		}
		return UCPanel;
	}

	/**
	 * This method initializes uInsPanel
	 * 
	 * @return system.gui.panel.UInsPanel
	 */
	private UInsPanel getUInsPanel() {
		if (uInsPanel == null) {
			uInsPanel = new UInsPanel();
			uInsPanel.setPreferredSize(new Dimension(200, 300));
		}
		return uInsPanel;
	}

	/**
	 * This method initializes genCadenaBtn
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getGenCadenaBtn() {
		if (genCadenaBtn == null) {
			genCadenaBtn = new JButton();
			genCadenaBtn.setText("Generar estado");
			genCadenaBtn.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

					// Cadenas del panel de microinstrucciones.
					String uInsNumUIns = uInsPanel.getNumUINS();
					String operandUIns = uInsPanel.getOperand();
					String operationUIns = uInsPanel.getOperation();
					String destinyUIns = uInsPanel.getUIns();
					String conditionUIns = uInsPanel.getCondition();
					String nextInstUIns = uInsPanel.getNextInst();
					String despUIns = uInsPanel.getDesp();
					String hfUIns = uInsPanel.getHf();
					String hrUIns = uInsPanel.getHr();
					String marUIns = uInsPanel.getMar();
					String mdrUIns = uInsPanel.getMdr();
					String rwUIns = uInsPanel.getRw();
					String iomUIns = uInsPanel.getIom();
					String hriUIns = uInsPanel.getHri();
					String rupcUIns = uInsPanel.getRupc();

					// Cadenas del panel de la unidad de control.
					String insHeaderUC = UCPanel.getInsHeader();
					String uPCUC = UCPanel.getUPC();
					String resetUC = UCPanel.getReset();
					String iomUC = UCPanel.getIom();
					String rwUC = UCPanel.getRw();
					String interUC = UCPanel.getInter();
					String jevUC = UCPanel.getJev();

					// Cadenas del panel de la ALU.
					String activeALU = ALUPanel.getActive();
					String operationALU = ALUPanel.getOperation();
					String carryALU = ALUPanel.getCarry();
					String negativeALU = ALUPanel.getNegative();
					String parityALU = ALUPanel.getParity();
					String zeroALU = ALUPanel.getZero();
					String outputALU = ALUPanel.getOutput();

					// Cadenas del panel BANK
					String activeBANK = bankPanel.getActive();
					String pcValBANK = bankPanel.getPcVal();
					String spValBANK = bankPanel.getSpVal();
					String dptrValBANK = bankPanel.getDptrval();
					String aValBANK = bankPanel.getAVal();
					String viValBANK = bankPanel.getViVal();
					String tempValBANK = bankPanel.getTempVal();
					String ctenValBANK = bankPanel.getCtenVal();
					String accValBANK = bankPanel.accVal();

					// Cadenas del panel MAR
					String activeMAR = MARPanel.getActive();
					String addressMAR = MARPanel.getAddress();

					// Cadenas del panel MDR
					String activeMDR = MDRPanel.getActive();
					String dataInMDR = MDRPanel.getDataIn();
					String dataOutMDR = MDRPanel.getDataOut();

					System.out.println(PDUAStrGenerator.makePDUAGeneric(
							uInsNumUIns, operandUIns, operationUIns,
							destinyUIns, conditionUIns, nextInstUIns, despUIns,
							hfUIns, hrUIns, marUIns, mdrUIns, rwUIns, iomUIns,
							hriUIns, rupcUIns, insHeaderUC, uPCUC, resetUC,
							iomUC, rwUC, interUC, jevUC, activeALU,
							operationALU, carryALU, negativeALU, parityALU,
							zeroALU, outputALU, activeBANK, pcValBANK,
							spValBANK, dptrValBANK, aValBANK, viValBANK,
							tempValBANK, ctenValBANK, accValBANK, activeMAR,
							addressMAR, activeMDR, dataInMDR, dataOutMDR));
				}
			});
		}
		return genCadenaBtn;
	}

	/**
	 * Non-automatic inserted method.
	 */

	private static Initial fr;

	public static void main(String[] args) {

		fr = new Initial();
		fr.setVisible(true);
	}
} // @jve:decl-index=0:visual-constraint="10,10"
