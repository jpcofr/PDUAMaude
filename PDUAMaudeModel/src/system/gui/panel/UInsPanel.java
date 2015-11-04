/**
 * 
 */
package system.gui.panel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import system.model.enumerations.Bit;
import system.model.enumerations.Condition;
import system.model.enumerations.InsNumber;
import system.model.enumerations.Operation;
import system.model.enumerations.Register;
import system.model.enumerations.Shift;

/**
 * @author jpcf
 */
public class UInsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel = null;
	private JPanel jPanel1 = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JComboBox operandoCoBox = null;
	private JComboBox operacionCoBox = null;
	private JComboBox destinoCoBox = null;
	private JComboBox condicionCoBox = null;
	private JComboBox despCoBox = null;
	private JComboBox siginsCoBox = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JCheckBox hfChBox = null;
	private JCheckBox hrChBox = null;
	private JCheckBox marChBox = null;
	private JCheckBox mdrChBox = null;
	private JCheckBox rwChBox = null;
	private JCheckBox iomChBox = null;
	private JCheckBox hriChBox = null;
	private JCheckBox rupcChBox = null;
	private JLabel jLabel6 = null;
	private JComboBox uInsCoBox = null;

	/**
	 * This is the default constructor
	 */
	public UInsPanel() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.setRows(4);
		gridLayout.setColumns(1);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createTitledBorder(null,
				"Microinstrucción", TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));
		this.setSize(new Dimension(300, 350));
		this.setLocation(new Point(0, 0));
		this.setPreferredSize(new Dimension(300, 400));
		this.add(getJPanel(), null);
		this.add(getJPanel1(), null);
		this.setBorder(BorderFactory.createTitledBorder(null,
				"Microinstrucción", TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.fill = GridBagConstraints.BOTH;
			gridBagConstraints21.gridy = 0;
			gridBagConstraints21.weightx = 1.0;
			gridBagConstraints21.gridx = 1;
			GridBagConstraints gridBagConstraints110 = new GridBagConstraints();
			gridBagConstraints110.gridx = 0;
			gridBagConstraints110.gridy = 0;
			jLabel6 = new JLabel();
			jLabel6.setText("uIns no.");
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.fill = GridBagConstraints.BOTH;
			gridBagConstraints8.gridx = 1;
			gridBagConstraints8.gridy = 3;
			gridBagConstraints8.weightx = 1.0;
			GridBagConstraints gridBagConstraints61 = new GridBagConstraints();
			gridBagConstraints61.fill = GridBagConstraints.BOTH;
			gridBagConstraints61.gridy = 6;
			gridBagConstraints61.weightx = 1.0;
			gridBagConstraints61.gridx = 1;
			GridBagConstraints gridBagConstraints51 = new GridBagConstraints();
			gridBagConstraints51.fill = GridBagConstraints.BOTH;
			gridBagConstraints51.gridy = 7;
			gridBagConstraints51.weightx = 1.0;
			gridBagConstraints51.gridx = 1;
			GridBagConstraints gridBagConstraints41 = new GridBagConstraints();
			gridBagConstraints41.fill = GridBagConstraints.BOTH;
			gridBagConstraints41.gridy = 5;
			gridBagConstraints41.weightx = 1.0;
			gridBagConstraints41.gridx = 1;
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.fill = GridBagConstraints.BOTH;
			gridBagConstraints31.gridy = 2;
			gridBagConstraints31.weightx = 1.0;
			gridBagConstraints31.gridx = 1;
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.fill = GridBagConstraints.BOTH;
			gridBagConstraints11.gridy = 1;
			gridBagConstraints11.weightx = 1.0;
			gridBagConstraints11.gridx = 1;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.gridy = 7;
			jLabel5 = new JLabel();
			jLabel5.setText("Despl.");
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 0;
			gridBagConstraints5.gridy = 6;
			jLabel4 = new JLabel();
			jLabel4.setText("Sig. instr.");
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 0;
			gridBagConstraints4.gridy = 5;
			jLabel3 = new JLabel();
			jLabel3.setText("Condición");
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.gridy = 3;
			jLabel2 = new JLabel();
			jLabel2.setText("Destino");
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridy = 2;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 1;
			jLabel = new JLabel();
			jLabel.setText("Operando");
			jPanel = new JPanel();
			jPanel.setLayout(new GridBagLayout());
			jPanel.setPreferredSize(new Dimension(95, 90));
			jPanel.add(jLabel, gridBagConstraints);
			jPanel.add(getJLabel1(), gridBagConstraints1);
			jPanel.add(jLabel2, gridBagConstraints2);
			jPanel.add(jLabel3, gridBagConstraints4);
			jPanel.add(jLabel4, gridBagConstraints5);
			jPanel.add(jLabel5, gridBagConstraints6);
			jPanel.add(getOperandoCoBox(), gridBagConstraints11);
			jPanel.add(getOperacionCoBox(), gridBagConstraints31);
			jPanel.add(getCondicionCoBox(), gridBagConstraints41);
			jPanel.add(getDespCoBox(), gridBagConstraints51);
			jPanel.add(getSiginsCoBox(), gridBagConstraints61);
			jPanel.add(getDestinoCoBox(), gridBagConstraints8);
			jPanel.add(jLabel6, gridBagConstraints110);
			jPanel.add(getUInsCoBox(), gridBagConstraints21);
		}
		return jPanel;
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
			gridBagConstraints25.gridx = 7;
			gridBagConstraints25.gridy = 1;
			GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
			gridBagConstraints24.gridx = 7;
			gridBagConstraints24.gridy = 0;
			GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
			gridBagConstraints23.gridx = 5;
			gridBagConstraints23.gridy = 1;
			GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
			gridBagConstraints22.gridx = 5;
			gridBagConstraints22.gridy = 0;
			GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
			gridBagConstraints20.gridx = 3;
			gridBagConstraints20.gridy = 1;
			GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
			gridBagConstraints19.gridx = 3;
			gridBagConstraints19.gridy = 0;
			GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
			gridBagConstraints18.gridy = 1;
			gridBagConstraints18.gridx = 1;
			GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
			gridBagConstraints17.gridx = 1;
			gridBagConstraints17.gridy = 0;
			GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
			gridBagConstraints16.gridx = 6;
			gridBagConstraints16.gridy = 1;
			GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
			gridBagConstraints15.gridx = 6;
			gridBagConstraints15.gridy = 0;
			GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
			gridBagConstraints14.gridx = 4;
			gridBagConstraints14.gridy = 1;
			GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
			gridBagConstraints13.gridx = 4;
			gridBagConstraints13.gridy = 0;
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			gridBagConstraints12.gridx = 2;
			gridBagConstraints12.gridy = 1;
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints10.gridx = 2;
			gridBagConstraints10.gridy = 0;
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.gridx = 0;
			gridBagConstraints9.gridy = 1;
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 0;
			gridBagConstraints7.gridy = 0;
			jLabel14 = new JLabel();
			jLabel14.setText("RUPC");
			jLabel13 = new JLabel();
			jLabel13.setText("HRI");
			jLabel12 = new JLabel();
			jLabel12.setText("IOM");
			jLabel11 = new JLabel();
			jLabel11.setText("R/W");
			jLabel10 = new JLabel();
			jLabel10.setText("MDR");
			jLabel9 = new JLabel();
			jLabel9.setText("MAR");
			jLabel8 = new JLabel();
			jLabel8.setText("HR");
			jLabel7 = new JLabel();
			jLabel7.setText("HF");
			jPanel1 = new JPanel();
			jPanel1.setLayout(new GridBagLayout());
			jPanel1.setBorder(null);
			jPanel1.setPreferredSize(new Dimension(95, 20));
			jPanel1.add(jLabel7, gridBagConstraints7);
			jPanel1.add(jLabel8, gridBagConstraints9);
			jPanel1.add(jLabel9, gridBagConstraints10);
			jPanel1.add(jLabel10, gridBagConstraints12);
			jPanel1.add(jLabel11, gridBagConstraints13);
			jPanel1.add(jLabel12, gridBagConstraints14);
			jPanel1.add(jLabel13, gridBagConstraints15);
			jPanel1.add(jLabel14, gridBagConstraints16);
			jPanel1.add(getHfChBox(), gridBagConstraints17);
			jPanel1.add(getHrChBox(), gridBagConstraints18);
			jPanel1.add(getMarChBox(), gridBagConstraints19);
			jPanel1.add(getMdrChBox(), gridBagConstraints20);
			jPanel1.add(getRwChBox(), gridBagConstraints22);
			jPanel1.add(getIomChBox(), gridBagConstraints23);
			jPanel1.add(getHriChBox(), gridBagConstraints24);
			jPanel1.add(getRupcChBox(), gridBagConstraints25);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jLabel1
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Operación");
		}
		return jLabel1;
	}

	/**
	 * This method initializes operandoCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getOperandoCoBox() {
		if (operandoCoBox == null) {
			operandoCoBox = new JComboBox();
			operandoCoBox.setEditable(true);
			operandoCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Register r : Register.values()) {
								operandoCoBox.addItem(r.getStr());
							}
						}

						public void ancestorRemoved(
								javax.swing.event.AncestorEvent e) {
						}

						public void ancestorMoved(
								javax.swing.event.AncestorEvent e) {
						}
					});
		}
		return operandoCoBox;
	}

	/**
	 * This method initializes operacionCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getOperacionCoBox() {
		if (operacionCoBox == null) {
			operacionCoBox = new JComboBox();
			operacionCoBox.setEditable(true);
			operacionCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Operation o : Operation.values()) {
								operacionCoBox.addItem(o.getStr());

							}
						}

						public void ancestorRemoved(
								javax.swing.event.AncestorEvent e) {
						}

						public void ancestorMoved(
								javax.swing.event.AncestorEvent e) {
						}
					});
		}
		return operacionCoBox;
	}

	/**
	 * This method initializes destinoCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getDestinoCoBox() {
		if (destinoCoBox == null) {
			destinoCoBox = new JComboBox();
			destinoCoBox.setEditable(true);
			destinoCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Register r : Register.values()) {
								destinoCoBox.addItem(r.getStr());
							}

						}

						public void ancestorRemoved(
								javax.swing.event.AncestorEvent e) {
						}

						public void ancestorMoved(
								javax.swing.event.AncestorEvent e) {
						}
					});
		}
		return destinoCoBox;
	}

	/**
	 * This method initializes condicionCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCondicionCoBox() {
		if (condicionCoBox == null) {
			condicionCoBox = new JComboBox();
			condicionCoBox.setEditable(true);
			condicionCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Condition c : Condition.values()) {
								condicionCoBox.addItem(c.getStr());
							}
						}

						public void ancestorRemoved(
								javax.swing.event.AncestorEvent e) {
						}

						public void ancestorMoved(
								javax.swing.event.AncestorEvent e) {
						}
					});
		}
		return condicionCoBox;
	}

	/**
	 * This method initializes despCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getDespCoBox() {
		if (despCoBox == null) {
			despCoBox = new JComboBox();
			despCoBox.setEditable(true);
			despCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Shift s : Shift.values()) {
								despCoBox.addItem(s.getStr());
							}
						}

						public void ancestorRemoved(
								javax.swing.event.AncestorEvent e) {
						}

						public void ancestorMoved(
								javax.swing.event.AncestorEvent e) {
						}
					});
		}
		return despCoBox;
	}

	/**
	 * This method initializes siginsCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getSiginsCoBox() {
		if (siginsCoBox == null) {
			siginsCoBox = new JComboBox();
			siginsCoBox.setEditable(true);
			siginsCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (InsNumber i : InsNumber.values()) {
								siginsCoBox.addItem(i.getStr());
							}
						}

						public void ancestorRemoved(
								javax.swing.event.AncestorEvent e) {
						}

						public void ancestorMoved(
								javax.swing.event.AncestorEvent e) {
						}
					});
		}
		return siginsCoBox;
	}

	/**
	 * This method initializes hfChBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getHfChBox() {
		if (hfChBox == null) {
			hfChBox = new JCheckBox();
		}
		return hfChBox;
	}

	/**
	 * This method initializes hrChBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getHrChBox() {
		if (hrChBox == null) {
			hrChBox = new JCheckBox();
		}
		return hrChBox;
	}

	/**
	 * This method initializes marChBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getMarChBox() {
		if (marChBox == null) {
			marChBox = new JCheckBox();
		}
		return marChBox;
	}

	/**
	 * This method initializes mdrChBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getMdrChBox() {
		if (mdrChBox == null) {
			mdrChBox = new JCheckBox();
		}
		return mdrChBox;
	}

	/**
	 * This method initializes rwChBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getRwChBox() {
		if (rwChBox == null) {
			rwChBox = new JCheckBox();
		}
		return rwChBox;
	}

	/**
	 * This method initializes iomChBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getIomChBox() {
		if (iomChBox == null) {
			iomChBox = new JCheckBox();
		}
		return iomChBox;
	}

	/**
	 * This method initializes hriChBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getHriChBox() {
		if (hriChBox == null) {
			hriChBox = new JCheckBox();
		}
		return hriChBox;
	}

	/**
	 * This method initializes rupcChBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getRupcChBox() {
		if (rupcChBox == null) {
			rupcChBox = new JCheckBox();
		}
		return rupcChBox;
	}

	/**
	 * Not Autogenerated methods
	 */

	/**
	 * @return
	 */
	public String getOperand() {

		return (String) operandoCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getOperation() {

		return (String) operacionCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getUIns() {

		return (String) uInsCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getCondition() {

		return (String) condicionCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getDesp() {

		return (String) despCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getNextInst() {

		return (String) siginsCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getHf() {

		return hfChBox.isSelected() ? Bit.BIT1.getStr() : Bit.BIT0.getStr();
	}

	/**
	 * @return
	 */
	public String getHr() {

		return hrChBox.isSelected() ? Bit.BIT1.getStr() : Bit.BIT0.getStr();
	}

	/**
	 * @return
	 */
	public String getMdr() {

		return mdrChBox.isSelected() ? Bit.BIT1.getStr() : Bit.BIT0.getStr();
	}

	/**
	 * @return
	 */
	public String getRw() {

		return rwChBox.isSelected() ? Bit.BIT1.getStr() : Bit.BIT0.getStr();

	}

	/**
	 * @return
	 */
	public String getMar() {
		return marChBox.isSelected() ? Bit.BIT1.getStr() : Bit.BIT0.getStr();
	}

	/**
	 * @return
	 */
	public String getIom() {
		return iomChBox.isSelected() ? Bit.BIT1.getStr() : Bit.BIT0.getStr();
	}

	/**
	 * @return
	 */
	public String getRupc() {

		return rupcChBox.isSelected() ? Bit.BIT1.getStr() : Bit.BIT0.getStr();
	}

	/**
	 * @return
	 */
	public String getHri() {

		return hriChBox.isSelected() ? Bit.BIT1.getStr() : Bit.BIT0.getStr();
	}

	/**
	 * @return
	 */
	public String getNumUINS() {

		return (String) uInsCoBox.getSelectedItem();
	}

	/**
	 * This method initializes uInsCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getUInsCoBox() {
		if (uInsCoBox == null) {
			uInsCoBox = new JComboBox();
			uInsCoBox.setEditable(true);
			uInsCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (InsNumber i : InsNumber.values()) {
								uInsCoBox.addItem(i.getStr());
							}
						}

						public void ancestorRemoved(
								javax.swing.event.AncestorEvent e) {
						}

						public void ancestorMoved(
								javax.swing.event.AncestorEvent e) {
						}
					});
		}
		return uInsCoBox;
	}

}
