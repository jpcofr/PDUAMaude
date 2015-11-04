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
public class BankPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JCheckBox jCheckBox = null;
	private JCheckBox jCheckBox2 = null;
	private JCheckBox jCheckBox3 = null;
	private JCheckBox jCheckBox4 = null;
	private JCheckBox jCheckBox5 = null;
	private JCheckBox jCheckBox6 = null;
	private JCheckBox jCheckBox7 = null;
	private JCheckBox jCheckBox1 = null;
	private JTextField pcTxt = null;
	private JTextField spTxt = null;
	private JTextField dptrTxt = null;
	private JTextField aTxt = null;
	private JTextField viTxt = null;
	private JTextField tempTxt = null;
	private JTextField accTxt = null;
	private JTextField ctem1Txt = null;
	private JLabel jLabel11 = null;
	private JComboBox activoCBox = null;

	/**
	 * This is the default constructor
	 */
	public BankPanel() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		GridBagConstraints gridBagConstraints110 = new GridBagConstraints();
		gridBagConstraints110.fill = GridBagConstraints.BOTH;
		gridBagConstraints110.gridy = 9;
		gridBagConstraints110.weightx = 1.0;
		gridBagConstraints110.gridwidth = 2;
		gridBagConstraints110.gridx = 1;
		GridBagConstraints gridBagConstraints33 = new GridBagConstraints();
		gridBagConstraints33.gridx = 2;
		gridBagConstraints33.gridy = 9;
		GridBagConstraints gridBagConstraints32 = new GridBagConstraints();
		gridBagConstraints32.gridx = 0;
		gridBagConstraints32.gridwidth = 1;
		gridBagConstraints32.gridy = 9;
		jLabel11 = new JLabel();
		jLabel11.setText("Activo");
		GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
		gridBagConstraints31.fill = GridBagConstraints.BOTH;
		gridBagConstraints31.gridy = 7;
		gridBagConstraints31.weightx = 1.0;
		gridBagConstraints31.gridx = 1;
		GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
		gridBagConstraints30.fill = GridBagConstraints.BOTH;
		gridBagConstraints30.gridy = 8;
		gridBagConstraints30.weightx = 1.0;
		gridBagConstraints30.gridx = 1;
		GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
		gridBagConstraints29.fill = GridBagConstraints.BOTH;
		gridBagConstraints29.gridy = 6;
		gridBagConstraints29.weightx = 1.0;
		gridBagConstraints29.gridx = 1;
		GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
		gridBagConstraints28.fill = GridBagConstraints.BOTH;
		gridBagConstraints28.gridy = 5;
		gridBagConstraints28.weightx = 1.0;
		gridBagConstraints28.gridx = 1;
		GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
		gridBagConstraints27.fill = GridBagConstraints.BOTH;
		gridBagConstraints27.gridy = 4;
		gridBagConstraints27.weightx = 1.0;
		gridBagConstraints27.gridx = 1;
		GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
		gridBagConstraints26.fill = GridBagConstraints.BOTH;
		gridBagConstraints26.gridy = 3;
		gridBagConstraints26.weightx = 1.0;
		gridBagConstraints26.gridx = 1;
		GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
		gridBagConstraints25.fill = GridBagConstraints.BOTH;
		gridBagConstraints25.gridy = 2;
		gridBagConstraints25.weightx = 1.0;
		gridBagConstraints25.gridx = 1;
		GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
		gridBagConstraints19.fill = GridBagConstraints.BOTH;
		gridBagConstraints19.gridy = 1;
		gridBagConstraints19.weightx = 1.0;
		gridBagConstraints19.gridx = 1;
		GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
		gridBagConstraints18.gridx = 2;
		gridBagConstraints18.gridy = 8;
		GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
		gridBagConstraints17.gridx = 2;
		gridBagConstraints17.gridy = 7;
		GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
		gridBagConstraints16.gridx = 2;
		gridBagConstraints16.gridy = 6;
		GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
		gridBagConstraints15.gridx = 2;
		gridBagConstraints15.gridy = 5;
		GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
		gridBagConstraints14.gridx = 2;
		gridBagConstraints14.gridy = 4;
		GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
		gridBagConstraints13.gridx = 2;
		gridBagConstraints13.gridy = 3;
		GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
		gridBagConstraints12.gridx = 2;
		gridBagConstraints12.gridy = 2;
		GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
		gridBagConstraints11.gridx = 2;
		gridBagConstraints11.gridy = 1;
		GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
		gridBagConstraints10.gridx = 0;
		gridBagConstraints10.gridy = 8;
		jLabel10 = new JLabel();
		jLabel10.setText("ACC");
		GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
		gridBagConstraints9.gridx = 0;
		gridBagConstraints9.gridy = 7;
		jLabel9 = new JLabel();
		jLabel9.setText("CTE-1");
		GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
		gridBagConstraints8.gridx = 0;
		gridBagConstraints8.gridy = 6;
		jLabel8 = new JLabel();
		jLabel8.setText("TEMP");
		GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
		gridBagConstraints7.gridx = 2;
		gridBagConstraints7.gridy = 0;
		jLabel7 = new JLabel();
		jLabel7.setText("Constante");
		GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
		gridBagConstraints6.gridx = 0;
		gridBagConstraints6.gridy = 5;
		jLabel6 = new JLabel();
		jLabel6.setText("VI");
		GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
		gridBagConstraints5.gridx = 0;
		gridBagConstraints5.gridy = 0;
		jLabel5 = new JLabel();
		jLabel5.setText("Registro");
		GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
		gridBagConstraints4.gridx = 0;
		gridBagConstraints4.gridy = 4;
		jLabel4 = new JLabel();
		jLabel4.setText("A");
		GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
		gridBagConstraints3.gridx = 0;
		gridBagConstraints3.gridy = 3;
		jLabel3 = new JLabel();
		jLabel3.setText("DPTR");
		GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
		gridBagConstraints2.gridx = 0;
		gridBagConstraints2.gridy = 2;
		jLabel2 = new JLabel();
		jLabel2.setText("SP");
		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
		gridBagConstraints1.gridx = 0;
		gridBagConstraints1.gridy = 1;
		jLabel1 = new JLabel();
		jLabel1.setText("PC");
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		jLabel = new JLabel();
		jLabel.setText("Contenido");
		this.setSize(300, 300);
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createTitledBorder(null,
				"Banco de registros", TitledBorder.DEFAULT_JUSTIFICATION,
				TitledBorder.DEFAULT_POSITION, null, null));
		this.add(jLabel, gridBagConstraints);
		this.add(jLabel1, gridBagConstraints1);
		this.add(jLabel2, gridBagConstraints2);
		this.add(jLabel3, gridBagConstraints3);
		this.add(jLabel4, gridBagConstraints4);
		this.add(jLabel5, gridBagConstraints5);
		this.add(jLabel6, gridBagConstraints6);
		this.add(jLabel7, gridBagConstraints7);
		this.add(jLabel8, gridBagConstraints8);
		this.add(jLabel9, gridBagConstraints9);
		this.add(jLabel10, gridBagConstraints10);
		this.add(getJCheckBox(), gridBagConstraints11);
		this.add(getJCheckBox2(), gridBagConstraints12);
		this.add(getJCheckBox3(), gridBagConstraints13);
		this.add(getJCheckBox4(), gridBagConstraints14);
		this.add(getJCheckBox5(), gridBagConstraints15);
		this.add(getJCheckBox6(), gridBagConstraints16);
		this.add(getJCheckBox7(), gridBagConstraints17);
		this.add(getJCheckBox1(), gridBagConstraints18);
		this.add(getPcTxt(), gridBagConstraints19);
		this.add(getSpTxt(), gridBagConstraints25);
		this.add(getDptrTxt(), gridBagConstraints26);
		this.add(getATxt(), gridBagConstraints27);
		this.add(getViTxt(), gridBagConstraints28);
		this.add(getTempTxt(), gridBagConstraints29);
		this.add(getAccTxt(), gridBagConstraints30);
		this.add(getCtem1Txt(), gridBagConstraints31);
		this.add(jLabel11, gridBagConstraints32);
		this.add(getActivoCBox(), gridBagConstraints110);
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
	 * This method initializes jCheckBox2
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getJCheckBox2() {
		if (jCheckBox2 == null) {
			jCheckBox2 = new JCheckBox();
		}
		return jCheckBox2;
	}

	/**
	 * This method initializes jCheckBox3
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getJCheckBox3() {
		if (jCheckBox3 == null) {
			jCheckBox3 = new JCheckBox();
		}
		return jCheckBox3;
	}

	/**
	 * This method initializes jCheckBox4
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getJCheckBox4() {
		if (jCheckBox4 == null) {
			jCheckBox4 = new JCheckBox();
		}
		return jCheckBox4;
	}

	/**
	 * This method initializes jCheckBox5
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getJCheckBox5() {
		if (jCheckBox5 == null) {
			jCheckBox5 = new JCheckBox();
		}
		return jCheckBox5;
	}

	/**
	 * This method initializes jCheckBox6
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getJCheckBox6() {
		if (jCheckBox6 == null) {
			jCheckBox6 = new JCheckBox();
		}
		return jCheckBox6;
	}

	/**
	 * This method initializes jCheckBox7
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getJCheckBox7() {
		if (jCheckBox7 == null) {
			jCheckBox7 = new JCheckBox();
		}
		return jCheckBox7;
	}

	/**
	 * This method initializes jCheckBox1
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getJCheckBox1() {
		if (jCheckBox1 == null) {
			jCheckBox1 = new JCheckBox();
		}
		return jCheckBox1;
	}

	/**
	 * This method initializes pcTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getPcTxt() {
		if (pcTxt == null) {
			pcTxt = new JTextField();
		}
		return pcTxt;
	}

	/**
	 * This method initializes spTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getSpTxt() {
		if (spTxt == null) {
			spTxt = new JTextField();
		}
		return spTxt;
	}

	/**
	 * This method initializes dptrTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getDptrTxt() {
		if (dptrTxt == null) {
			dptrTxt = new JTextField();
		}
		return dptrTxt;
	}

	/**
	 * This method initializes aTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getATxt() {
		if (aTxt == null) {
			aTxt = new JTextField();
		}
		return aTxt;
	}

	/**
	 * This method initializes viTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getViTxt() {
		if (viTxt == null) {
			viTxt = new JTextField();
		}
		return viTxt;
	}

	/**
	 * This method initializes tempTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTempTxt() {
		if (tempTxt == null) {
			tempTxt = new JTextField();
		}
		return tempTxt;
	}

	/**
	 * This method initializes accTxt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getAccTxt() {
		if (accTxt == null) {
			accTxt = new JTextField();
		}
		return accTxt;
	}

	/**
	 * This method initializes ctem1Txt
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getCtem1Txt() {
		if (ctem1Txt == null) {
			ctem1Txt = new JTextField();
		}
		return ctem1Txt;
	}

	/**
	 * This method initializes activoCBox
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getActivoCBox() {
		if (activoCBox == null) {
			activoCBox = new JComboBox();
			activoCBox.setEditable(true);
			activoCBox
					.addAncestorListener(new javax.swing.event.AncestorListener() {
						public void ancestorAdded(
								javax.swing.event.AncestorEvent e) {
							for (Bit b : Bit.values()) {
								activoCBox.addItem(b.getStr());
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
		return activoCBox;
	}

	/**
	 * @return
	 */
	public String getActive() {

		return accTxt.getText();
	}

	/**
	 * @return
	 */
	public String getSpVal() {

		return spTxt.getText();
	}

	/**
	 * @return
	 */
	public String getPcVal() {

		return pcTxt.getText();
	}

	/**
	 * @return
	 */
	public String getDptrval() {

		return dptrTxt.getText();
	}

	/**
	 * @return
	 */
	public String getAVal() {

		return aTxt.getText();
	}

	/**
	 * @return
	 */
	public String getViVal() {

		return viTxt.getText();
	}

	/**
	 * @return
	 */
	public String getTempVal() {

		return tempTxt.getText();
	}

	/**
	 * @return
	 */
	public String getCtenVal() {

		return ctem1Txt.getText();
	}

	/**
	 * @return
	 */
	public String accVal() {
		return accTxt.getText();
	}

}
