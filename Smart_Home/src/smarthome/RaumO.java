package smarthome;

/**
 * Class RaumO
 * 
 * @author Achref Chida
 * @version 26.09.2022
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class RaumO extends JDialog implements Raum {

	private final JPanel contentPanel = new JPanel();	
	private String flaeche;
	private String wuenschTemperatur;
//	private Fenster fenster = new Fenster();
//	private Heizung heizung = new Heizung();
	
	/**
	 * Create the dialog.
	 */
	public RaumO() {
		setBounds(100, 100, 458, 196);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextField wuenschTemperaturJ = new JTextField();
		contentPanel.add(wuenschTemperaturJ);
		wuenschTemperaturJ.setBounds(128, 101, 86, 20);
		wuenschTemperaturJ.setColumns(10);
		
		JLabel lblWunschTemp = new JLabel("W\u00FCnsch Temperatur");
		contentPanel.add(lblWunschTemp);
		lblWunschTemp.setBounds(10, 104, 160, 14);
		
		JTextField flaecheJ = new JTextField();
		contentPanel.add(flaecheJ);
		flaecheJ.setBounds(128, 73, 86, 20);
		flaecheJ.setColumns(10);
		//		setLayout(null);
				
				JLabel lblFlaeche = new JLabel("Fl\u00E4che");
				contentPanel.add(lblFlaeche);
				lblFlaeche.setBounds(10, 76, 46, 14);
				
				JLabel lblNewLabel = new JLabel("Raum");
				contentPanel.add(lblNewLabel);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblNewLabel.setBounds(25, 11, 46, 14);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						flaeche = flaecheJ.getText();
						wuenschTemperatur = wuenschTemperaturJ.getText();
						setParam(flaeche, wuenschTemperatur);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void setParam(String flaecheJ, String wuenschTemperaturJ) {
		this.flaeche = flaecheJ;
		this.wuenschTemperatur = wuenschTemperaturJ;	
	}

	public void getRaumTemp(Heizung heizung) {		
		
	}
	
}
