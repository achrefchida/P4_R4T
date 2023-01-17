package smarthome;

/**
 * Class GebaeudeOberflaesche
 * 
 * @author Achref Chida
 * @version 26.09.2022
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;

@SuppressWarnings("serial")
public class GebaeudeOberflaesche extends JFrame implements Gebaeude {

	private JPanel contentPane;
	
	private String flaeche;
	private String adresse;
	private int etagen;
	private int anzahlRaum;
	private boolean zustandSys;
	
	private User userGUI = new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GebaeudeOberflaesche frame = new GebaeudeOberflaesche();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GebaeudeOberflaesche() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		userGUI.setBounds(0, 0, 450, 300);
		contentPane.add(userGUI);

		JLabel lblNewLabel = new JLabel("Raum");
		lblNewLabel.setForeground(new Color(0, 51, 102));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(297, 66, 46, 14);
		contentPane.add(lblNewLabel);

		JSpinner anzahlRaumJ = new JSpinner();
		anzahlRaumJ.setBounds(353, 64, 56, 20);
		contentPane.add(anzahlRaumJ);

		JLabel lblFlche = new JLabel("Fl\u00E4che");
		lblFlche.setForeground(new Color(0, 51, 102));
		lblFlche.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFlche.setBounds(29, 66, 46, 14);
		contentPane.add(lblFlche);

		JTextField flaecheJ = new JTextField();
		flaecheJ.setBounds(85, 64, 86, 20);
		contentPane.add(flaecheJ);
		flaecheJ.setColumns(10);

		JLabel lblEtage = new JLabel("Etage");
		lblEtage.setForeground(new Color(0, 51, 102));
		lblEtage.setFont(new Font("Dialog", Font.BOLD, 12));
		lblEtage.setBounds(29, 97, 46, 14);
		contentPane.add(lblEtage);

		JTextField adresseJ = new JTextField();
		adresseJ.setColumns(10);
		adresseJ.setBounds(85, 129, 86, 20);
		contentPane.add(adresseJ);

		JSpinner etagenJ = new JSpinner();
		etagenJ.setBounds(85, 95, 46, 20);
		contentPane.add(etagenJ);

		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setForeground(new Color(0, 51, 102));
		lblAdresse.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAdresse.setBounds(29, 131, 56, 14);
		contentPane.add(lblAdresse);

		JLabel lblGebude = new JLabel("Geb\u00E4ude");
		lblGebude.setForeground(new Color(0, 51, 102));
		lblGebude.setFont(new Font("Dialog", Font.BOLD, 15));
		lblGebude.setBounds(29, 11, 80, 30);
		contentPane.add(lblGebude);

		JButton btnNewButton = new JButton("Wünschwerte");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				setparam((Integer)anzahlRaumJ.getValue(),(Integer)etagenJ.getValue(),flaecheJ.getText(),adresseJ.getText());
				RaumO[] raeume = new RaumO[anzahlRaum];
				wunschwerte(raeume);
			}
		});
		btnNewButton.setBounds(293, 97, 116, 23);
		contentPane.add(btnNewButton);
		
		Component horizontalStrut = Box.createHorizontalStrut(100);
		horizontalStrut.setForeground(new Color(0, 0, 0));
		horizontalStrut.setBackground(new Color(0, 0, 0));
		horizontalStrut.setBounds(0, 175, 442, 27);
		contentPane.add(horizontalStrut);
		
		JButton btnNewButton_1 = new JButton("System starten");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sysEin();
			}
		});
		btnNewButton_1.setBounds(54, 213, 154, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("System runterfahren");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sysAus();
			}
		});
		btnNewButton_2.setBounds(235, 213, 185, 23);
		contentPane.add(btnNewButton_2);
	}
	
	public void sysAus() {		
		this.zustandSys = false;
	}

	public void sysEin() {
		this.zustandSys = true;
	}
	
	public boolean getzustandSys () {
		return zustandSys;
	}
	
	@Override
	public void wunschwerte(RaumO[] raeume) {
		for (int i = 0; i < this.anzahlRaum; i++) {
		raeume[i] = new RaumO();
		raeume[i].setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		raeume[i].setVisible(true);
		}
	}
	

	private void setparam(int anzahlRaumJ, int etagenJ , String flaecheJ , String adresseJ) {
		this.setFlaeche(flaecheJ);
		this.setAdresse(adresseJ);
		this.setEtagen(etagenJ);
		this.setAnzahlRaum(anzahlRaumJ);		
	}

	public String getFlaeche() {
		return flaeche;
	}

	public void setFlaeche(String flaeche) {
		this.flaeche = flaeche;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getEtagen() {
		return etagen;
	}

	public void setEtagen(int etagen) {
		this.etagen = etagen;
	}

	public int getAnzahlRaum() {
		return anzahlRaum;
	}

	public void setAnzahlRaum(int anzahlRaum) {
		this.anzahlRaum = anzahlRaum;
	}


	
}
