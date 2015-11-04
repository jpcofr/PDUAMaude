/**
 * 
 */
package system.gui.panel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import system.model.enumerations.Bit;
import system.model.enumerations.Operation;

/**
 * @author jpcf
 */
public class ALUPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JComboBox habilitadoCoBox = null;
	private JComboBox selopCoBox = null;
	private JComboBox carryCoBox = null;
	private JComboBox negativeCoBox = null;
	private JComboBox parityCoBox = null;
	private JComboBox zeroCoBox = null;
	private JTextField outputTxt = null;

	/**
	 * This is the default constructor
	 */
	public ALUPanel() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
		gridBagConstraints21.fill = GridBagConstraints.BOTH;
		gridBagConstraints21.gridy = 6;
		gridBagConstraints21.weightx = 1.0;
		gridBagConstraints21.gridx = 1;
		GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
		gridBagConstraints19.fill = GridBagConstraints.BOTH;
		gridBagConstraints19.gridy = 5;
		gridBagConstraints19.weightx = 1.0;
		gridBagConstraints19.gridx = 1;
		GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
		gridBagConstraints18.fill = GridBagConstraints.BOTH;
		gridBagConstraints18.gridy = 4;
		gridBagConstraints18.weightx = 1.0;
		gridBagConstraints18.gridx = 1;
		GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
		gridBagConstraints17.fill = GridBagConstraints.BOTH;
		gridBagConstraints17.gridy = 3;
		gridBagConstraints17.weightx = 1.0;
		gridBagConstraints17.gridx = 1;
		GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
		gridBagConstraints16.fill = GridBagConstraints.BOTH;
		gridBagConstraints16.gridy = 2;
		gridBagConstraints16.weightx = 1.0;
		gridBagConstraints16.gridx = 1;
		GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
		gridBagConstraints15.fill = GridBagConstraints.BOTH;
		gridBagConstraints15.gridy = 1;
		gridBagConstraints15.weightx = 1.0;
		gridBagConstraints15.gridx = 1;
		GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
		gridBagConstraints14.fill = GridBagConstraints.BOTH;
		gridBagConstraints14.gridy = 0;
		gridBagConstraints14.weightx = 1.0;
		gridBagConstraints14.gridx = 1;
		GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
		gridBagConstraints12.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints12.gridy = 4;
		gridBagConstraints12.weightx = 1.0;
		gridBagConstraints12.gridx = 2;
		new GridBagConstraints();
		GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
		gridBagConstraints9.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints9.gridx = 2;
		GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
		gridBagConstraints6.gridx = 0;
		gridBagConstraints6.gridy = 6;
		jLabel6 = new JLabel();
		jLabel6.setText("Output");
		GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
		gridBagConstraints5.gridx = 0;
		gridBagConstraints5.gridy = 5;
		jLabel5 = new JLabel();
		jLabel5.setText("Zero");
		GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
		gridBagConstraints4.gridx = 0;
		gridBagConstraints4.gridy = 4;
		jLabel4 = new JLabel();
		jLabel4.setText("Parity");
		GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
		gridBagConstraints3.gridx = 0;
		gridBagConstraints3.gridy = 3;
		jLabel3 = new JLabel();
		jLabel3.setText("Negative");
		GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
		gridBagConstraints2.gridx = 0;
		gridBagConstraints2.gridy = 2;
		jLabel2 = new JLabel();
		jLabel2.setText("Carry");
		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
		gridBagConstraints1.gridx = 0;
		gridBagConstraints1.gridy = 1;
		jLabel1 = new JLabel();
		jLabel1.setText("SELOP");
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jLabel = new JLabel();
		jLabel.setText("Habilitado");
		this.setSize(413, 200);
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createTitledBorder(null, "ALU",
				TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));
		this.add(jLabel, gridBagConstraints);
		this.add(jLabel1, gridBagConstraints1);
		this.add(jLabel2, gridBagConstraints2);
		this.add(jLabel3, gridBagConstraints3);
		this.add(jLabel4, gridBagConstraints4);
		this.add(jLabel5, gridBagConstraints5);
		this.add(jLabel6, gridBagConstraints6);
		this.add(getHabilitadoCoBox(), gridBagConstraints14);
		this.add(getSelopCoBox(), gridBagConstraints15);
		this.add(getCarryCoBox(), gridBagConstraints16);
		this.add(getNegativeCoBox(), gridBagConstraints17);
		this.add(getParityCoBox(), gridBagConstraints18);
		this.add(getZeroCoBox(), gridBagConstraints19);
		this.add(getOutputTxt(), gridBagConstraints21);
	}

	/**
	 * This method initializes habilitadoCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getHabilitadoCoBox() {
		if (habilitadoCoBox == null) {
			habilitadoCoBox = new JComboBox();
			habilitadoCoBox.setEditable(true);
			habilitadoCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {

							for (Bit b : Bit.values()) {
								habilitadoCoBox.addItem(b.getStr());
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
		return habilitadoCoBox;
	}

	/**
	 * This method initializes selopCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getSelopCoBox() {
		if (selopCoBox == null) {
			selopCoBox = new JComboBox();
			selopCoBox.setEditable(true);
			selopCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Operation o : Operation.values()) {
								selopCoBox.addItem(o.getStr());
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
		return selopCoBox;
	}

	/**
	 * This method initializes carryCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCarryCoBox() {
		if (carryCoBox == null) {
			carryCoBox = new JComboBox();
			carryCoBox.setEditable(true);
			carryCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Bit b : Bit.values()) {
								carryCoBox.addItem(b.getStr());
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
		return carryCoBox;
	}

	/**
	 * This method initializes negativeCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getNegativeCoBox() {
		if (negativeCoBox == null) {
			negativeCoBox = new JComboBox();
			negativeCoBox.setEditable(true);
			negativeCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Bit b : Bit.values()) {
								negativeCoBox.addItem(b.getStr());
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
		return negativeCoBox;
	}

	/**
	 * This method initializes parityCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getParityCoBox() {
		if (parityCoBox == null) {
			parityCoBox = new JComboBox();
			parityCoBox.setEditable(true);
			parityCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Bit b : Bit.values()) {
								parityCoBox.addItem(b.getStr());
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
		return parityCoBox;
	}

	/**
	 * This method initializes zeroCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getZeroCoBox() {
		if (zeroCoBox == null) {
			zeroCoBox = new JComboBox();
			zeroCoBox.setEditable(true);
			zeroCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Bit b : Bit.values()) {
								zeroCoBox.addItem(b.getStr());
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
		return zeroCoBox;
	}

	/**
	 * This method initializes outputTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getOutputTxt() {
		if (outputTxt == null) {
			outputTxt = new JTextField();
		}
		return outputTxt;
	}

	/**
	 * @return
	 */
	public String getActive() {

		return (String) habilitadoCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getOperation() {

		return (String) selopCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getCarry() {

		return (String) carryCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getNegative() {

		return (String) negativeCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getParity() {

		return (String) parityCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getOutput() {

		return outputTxt.getText();
	}

	/**
	 * @return
	 */
	public String getZero() {

		return (String) zeroCoBox.getSelectedItem();
	}

} // @jve:decl-index=0:visual-constraint="10,10"
