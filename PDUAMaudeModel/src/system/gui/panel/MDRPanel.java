/**
 * 
 */
package system.gui.panel;

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

/**
 * @author jpcf
 */
public class MDRPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField dataInTxt = null;
	private JCheckBox dataInCteChBox = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JCheckBox dataOutCteChBox = null;
	private JTextField dataOutTxt = null;
	private JComboBox habilitadoCoBox = null;

	/**
	 * This is the default constructor
	 */
	public MDRPanel() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
		gridBagConstraints5.fill = GridBagConstraints.BOTH;
		gridBagConstraints5.gridy = 4;
		gridBagConstraints5.weightx = 1.0;
		gridBagConstraints5.gridwidth = 2;
		gridBagConstraints5.gridx = 1;
		GridBagConstraints gridBagConstraints51 = new GridBagConstraints();
		gridBagConstraints51.fill = GridBagConstraints.BOTH;
		gridBagConstraints51.gridy = 3;
		gridBagConstraints51.weightx = 1.0;
		gridBagConstraints51.gridx = 1;
		GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
		gridBagConstraints31.gridx = 2;
		gridBagConstraints31.gridy = 3;
		GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
		gridBagConstraints21.gridx = 0;
		gridBagConstraints21.gridy = 3;
		jLabel3 = new JLabel();
		jLabel3.setText("DATAOUT");
		GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
		gridBagConstraints11.gridx = 2;
		gridBagConstraints11.gridy = 1;
		jLabel2 = new JLabel();
		jLabel2.setText("Constante");
		GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
		gridBagConstraints4.gridx = 2;
		gridBagConstraints4.gridy = 2;
		GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
		gridBagConstraints3.fill = GridBagConstraints.BOTH;
		gridBagConstraints3.gridy = 2;
		gridBagConstraints3.weightx = 1.0;
		gridBagConstraints3.gridx = 1;
		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
		gridBagConstraints1.gridx = 0;
		gridBagConstraints1.gridy = 2;
		jLabel1 = new JLabel();
		jLabel1.setText("DATAIN");
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		jLabel = new JLabel();
		jLabel.setText("Habilitado");
		this.setSize(300, 110);
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createTitledBorder(null, "MDR",
				TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));
		this.add(jLabel, gridBagConstraints);
		this.add(jLabel1, gridBagConstraints1);
		this.add(getDataInTxt(), gridBagConstraints3);
		this.add(getDataInCteChBox(), gridBagConstraints4);
		this.add(jLabel2, gridBagConstraints11);
		this.add(jLabel3, gridBagConstraints21);
		this.add(getDataOutCteChBox(), gridBagConstraints31);
		this.add(getDataOutTxt(), gridBagConstraints51);
		this.add(getHabilitadoCoBox(), gridBagConstraints5);
	}

	/**
	 * This method initializes dataInTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getDataInTxt() {
		if (dataInTxt == null) {
			dataInTxt = new JTextField();
		}
		return dataInTxt;
	}

	/**
	 * This method initializes dataInCteChBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getDataInCteChBox() {
		if (dataInCteChBox == null) {
			dataInCteChBox = new JCheckBox();
		}
		return dataInCteChBox;
	}

	/**
	 * This method initializes dataOutCteChBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getDataOutCteChBox() {
		if (dataOutCteChBox == null) {
			dataOutCteChBox = new JCheckBox();
		}
		return dataOutCteChBox;
	}

	/**
	 * This method initializes dataOutTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getDataOutTxt() {
		if (dataOutTxt == null) {
			dataOutTxt = new JTextField();
		}
		return dataOutTxt;
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
	 * @return
	 */
	public String getDataOut() {

		return dataOutTxt.getText();
	}

	/**
	 * @return
	 */
	public String getDataIn() {

		return dataInTxt.getText();
	}

	/**
	 * @return
	 */
	public String getActive() {

		return (String) habilitadoCoBox.getSelectedItem();
	}

}
