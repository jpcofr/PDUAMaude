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
public class MARPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JComboBox habilitadoCoBox = null;
	private JTextField direccionTxt = null;
	private JCheckBox jCheckBox = null;

	/**
	 * This is the default constructor
	 */
	public MARPanel() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
		gridBagConstraints4.gridx = 2;
		gridBagConstraints4.gridy = 2;
		GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
		gridBagConstraints3.fill = GridBagConstraints.BOTH;
		gridBagConstraints3.gridy = 2;
		gridBagConstraints3.weightx = 1.0;
		gridBagConstraints3.gridx = 1;
		GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
		gridBagConstraints11.fill = GridBagConstraints.BOTH;
		gridBagConstraints11.gridy = 1;
		gridBagConstraints11.weightx = 1.0;
		gridBagConstraints11.gridwidth = 2;
		gridBagConstraints11.gridx = 1;
		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
		gridBagConstraints1.gridx = 0;
		gridBagConstraints1.gridy = 2;
		jLabel1 = new JLabel();
		jLabel1.setText("Dirección");
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		jLabel = new JLabel();
		jLabel.setText("Habilitado");
		this.setSize(300, 60);
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createTitledBorder(null, "MAR",
				TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));
		this.add(jLabel, gridBagConstraints);
		this.add(jLabel1, gridBagConstraints1);
		this.add(getHabilitadoCoBox(), gridBagConstraints11);
		this.add(getDireccionTxt(), gridBagConstraints3);
		this.add(getJCheckBox(), gridBagConstraints4);
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
	 * This method initializes direccionTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getDireccionTxt() {
		if (direccionTxt == null) {
			direccionTxt = new JTextField();
		}
		return direccionTxt;
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
	 * State of the active combo box.
	 * 
	 * @return The state of the combo box: '1', '0' or any other string
	 * representing a MAUDE variable.
	 */
	public String getActive() {
		return ((String) habilitadoCoBox.getSelectedItem()).trim();
	}

	/**
	 * State of the active combo box.
	 * 
	 * @return The state of the combo box: a constant written as a register in
	 * mode BNF sense or a MAUDE variable.
	 */
	public String getAddress() {

		return direccionTxt.getText().trim();
	}

}
