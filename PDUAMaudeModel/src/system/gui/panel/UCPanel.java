/**
 * 
 */
package system.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import system.model.enumerations.Bit;
import system.model.enumerations.Condition;
import system.model.enumerations.InsNumber;

/**
 * @author jpcf
 */
public class UCPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JTextField inshTxt = null;
	private JCheckBox jCheckBox = null;
	private JComboBox uinstCoBox = null;
	private JComboBox resetCoBox = null;
	private JComboBox iomCoBox = null;
	private JComboBox rwCoBox = null;
	private JComboBox intCoBox = null;
	private JComboBox jevCoBox = null;

	/**
	 * This is the default constructor
	 */
	public UCPanel() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
		gridBagConstraints14.fill = GridBagConstraints.BOTH;
		gridBagConstraints14.gridy = 6;
		gridBagConstraints14.weightx = 1.0;
		gridBagConstraints14.gridwidth = 2;
		gridBagConstraints14.gridx = 1;
		GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
		gridBagConstraints13.fill = GridBagConstraints.BOTH;
		gridBagConstraints13.gridy = 5;
		gridBagConstraints13.weightx = 1.0;
		gridBagConstraints13.gridwidth = 2;
		gridBagConstraints13.gridx = 1;
		GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
		gridBagConstraints12.fill = GridBagConstraints.BOTH;
		gridBagConstraints12.gridy = 4;
		gridBagConstraints12.weightx = 1.0;
		gridBagConstraints12.gridwidth = 2;
		gridBagConstraints12.gridx = 1;
		GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
		gridBagConstraints11.fill = GridBagConstraints.BOTH;
		gridBagConstraints11.gridy = 3;
		gridBagConstraints11.weightx = 1.0;
		gridBagConstraints11.gridwidth = 2;
		gridBagConstraints11.gridx = 1;
		GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
		gridBagConstraints10.fill = GridBagConstraints.BOTH;
		gridBagConstraints10.gridy = 2;
		gridBagConstraints10.weightx = 1.0;
		gridBagConstraints10.gridwidth = 2;
		gridBagConstraints10.gridx = 1;
		GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
		gridBagConstraints9.fill = GridBagConstraints.BOTH;
		gridBagConstraints9.gridy = 1;
		gridBagConstraints9.weightx = 1.0;
		gridBagConstraints9.gridwidth = 2;
		gridBagConstraints9.gridx = 1;
		GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
		gridBagConstraints8.gridx = 2;
		gridBagConstraints8.gridy = 0;
		GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
		gridBagConstraints7.gridx = 0;
		gridBagConstraints7.gridy = 6;
		GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
		gridBagConstraints6.fill = GridBagConstraints.BOTH;
		gridBagConstraints6.gridy = 0;
		gridBagConstraints6.weightx = 1.0;
		gridBagConstraints6.gridx = 1;
		GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
		gridBagConstraints5.gridx = 0;
		gridBagConstraints5.gridy = 5;
		jLabel6 = new JLabel();
		jLabel6.setText("Interrupcion");
		GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
		gridBagConstraints4.gridx = 0;
		gridBagConstraints4.gridy = 4;
		jLabel5 = new JLabel();
		jLabel5.setText("R/W");
		GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
		gridBagConstraints3.gridx = 0;
		gridBagConstraints3.gridy = 3;
		jLabel3 = new JLabel();
		jLabel3.setText("IOM");
		GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
		gridBagConstraints2.gridx = 0;
		gridBagConstraints2.gridy = 2;
		jLabel2 = new JLabel();
		jLabel2.setText("Reset");
		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
		gridBagConstraints1.gridx = 0;
		gridBagConstraints1.gridy = 1;
		jLabel1 = new JLabel();
		jLabel1.setText("uInst");
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jLabel = new JLabel();
		jLabel.setText("InsH");
		this.setSize(300, 200);
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createTitledBorder(null,
				"Unidad de control", TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION,
				new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
		this.add(jLabel, gridBagConstraints);
		this.add(jLabel1, gridBagConstraints1);
		this.add(jLabel2, gridBagConstraints2);
		this.add(jLabel3, gridBagConstraints3);
		this.add(jLabel5, gridBagConstraints4);
		this.add(jLabel6, gridBagConstraints5);
		this.add(getInshTxt(), gridBagConstraints6);
		this.add(getJLabel4(), gridBagConstraints7);
		this.add(getJCheckBox(), gridBagConstraints8);
		this.add(getUinstCoBox(), gridBagConstraints9);
		this.add(getResetCoBox(), gridBagConstraints10);
		this.add(getIomCoBox(), gridBagConstraints11);
		this.add(getRwCoBox(), gridBagConstraints12);
		this.add(getIntCoBox(), gridBagConstraints13);
		this.add(getJevCoBox(), gridBagConstraints14);
	}

	/**
	 * This method initializes jLabel4
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("JEV");
		}
		return jLabel4;
	}

	/**
	 * This method initializes inshTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getInshTxt() {
		if (inshTxt == null) {
			inshTxt = new JTextField();
		}
		return inshTxt;
	}

	/**
	 * This method initializes jCheckBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getJCheckBox() {
		if (jCheckBox == null) {
			jCheckBox = new JCheckBox();
		}
		return jCheckBox;
	}

	/**
	 * This method initializes uinstCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getUinstCoBox() {
		if (uinstCoBox == null) {
			uinstCoBox = new JComboBox();
			uinstCoBox.setEditable(true);
			uinstCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (InsNumber i : InsNumber.values()) {
								uinstCoBox.addItem(i.getStr());
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
		return uinstCoBox;
	}

	/**
	 * This method initializes resetCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getResetCoBox() {
		if (resetCoBox == null) {
			resetCoBox = new JComboBox();
			resetCoBox.setEditable(true);
			resetCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Bit b : Bit.values()) {
								resetCoBox.addItem(b.getStr());
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
		return resetCoBox;
	}

	/**
	 * This method initializes iomCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getIomCoBox() {
		if (iomCoBox == null) {
			iomCoBox = new JComboBox();
			iomCoBox.setEditable(true);
			iomCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Bit b : Bit.values()) {
								iomCoBox.addItem(b.getStr());
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
		return iomCoBox;
	}

	/**
	 * This method initializes rwCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getRwCoBox() {
		if (rwCoBox == null) {
			rwCoBox = new JComboBox();
			rwCoBox.setEditable(true);
			rwCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Bit b : Bit.values()) {
								rwCoBox.addItem(b.getStr());
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
		return rwCoBox;
	}

	/**
	 * This method initializes intCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getIntCoBox() {
		if (intCoBox == null) {
			intCoBox = new JComboBox();
			intCoBox.setEditable(true);
			intCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Bit b : Bit.values()) {
								intCoBox.addItem(b.getStr());

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
		return intCoBox;
	}

	/**
	 * This method initializes jevCoBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getJevCoBox() {
		if (jevCoBox == null) {
			jevCoBox = new JComboBox();
			jevCoBox.setEditable(true);
			jevCoBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Condition c : Condition.values()) {
								jevCoBox.addItem(c.getStr());
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
		return jevCoBox;
	}

	/**
	 * @return
	 */
	public String getUPC() {

		return (String) uinstCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getReset() {

		return (String) resetCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getInsHeader() {

		return inshTxt.getText();
	}

	/**
	 * @return
	 */
	public String getRw() {

		return (String) rwCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getIom() {

		return (String) iomCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getInter() {

		return (String) intCoBox.getSelectedItem();
	}

	/**
	 * @return
	 */
	public String getJev() {

		return (String) jevCoBox.getSelectedItem();
	}

}
