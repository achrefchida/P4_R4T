package smarthome;

/**
 * Class User
 * 
 * @author Achref Chida
 * @version 26.09.2022
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


@SuppressWarnings("serial")
public class User extends JPanel implements Benutzer {

	private String name;
	private String handy;
	private String adresse;
//	private File pathOfUser;

	/**
	 * Create the frame.
	 */
	public User() {
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(21, 47, 46, 14);
		lblName.setBackground(new Color(255, 255, 255));
		lblName.setForeground(new Color(51, 51, 102));

		JTextField nameJ = new JTextField();
		nameJ.setBounds(77, 47, 137, 20);
		nameJ.setColumns(10);

		JLabel lblHandy = new JLabel("Handy");
		lblHandy.setBounds(21, 175, 46, 14);
		lblHandy.setForeground(new Color(51, 51, 102));

		JTextField handyJ = new JTextField();
		handyJ.setBounds(77, 172, 137, 20);
		handyJ.setColumns(10);

		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(21, 204, 67, 14);
		lblAdresse.setForeground(new Color(51, 51, 102));

		JTextField adresseJ = new JTextField();
		adresseJ.setBounds(77, 201, 137, 20);
		adresseJ.setColumns(10);

		JTextArea txtrInDemFall = new JTextArea();
		txtrInDemFall.setBounds(21, 133, 193, 30);
		txtrInDemFall.setBackground(new Color(238, 238, 238));
		txtrInDemFall.setFont(new Font("Arial", Font.PLAIN, 11));
		txtrInDemFall.setText("In dem Fall neue User: \r\nBitte Ihre Handy und Adreese geben.");

		JTextPane txtpnBiiteIhreName = new JTextPane();
		txtpnBiiteIhreName.setBounds(21, 11, 193, 20);
		txtpnBiiteIhreName.setBackground(new Color(238, 238, 238));
		txtpnBiiteIhreName.setText("Biite Ihre Name geben");

		JButton btnNewButton_1 = new JButton("Neue User");
		btnNewButton_1.setBounds(107, 230, 107, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				neueUserEinfuegen(nameJ.getText(), handyJ.getText(), adresseJ.getText());
			}
		});

		JButton btnNewButton_2 = new JButton("Daten Aktualisieren");
		btnNewButton_2.setBounds(69, 79, 145, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datenaktualisieren(nameJ.getText());
			}
		});
		setLayout(null);
		add(txtpnBiiteIhreName);
		add(lblName);
		add(nameJ);
		add(btnNewButton_2);
		add(txtrInDemFall);
		add(lblHandy);
		add(handyJ);
		add(lblAdresse);
		add(adresseJ);
		add(btnNewButton_1);
	}

	public void datenaktualisieren(String name) {
		this.name = name;
		this.setVisible(false);
//		System.out.println("Working Directory = " + System.getProperty("user.dir"));
//		this.pathOfUser = new File(System.getProperty("user.dir") + "\\" + name + ".txt");
//		try {
//			Scanner myReader = new Scanner(this.pathOfUser);
//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println(data);
//			}
//			myReader.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("An error occurred. Kein User ist mit der Name " + name + " gefunden: " + this.pathOfUser);
//			e.printStackTrace();
//		}
	}

	public void neueUserEinfuegen(String name, String handy, String adresse) {
		this.name = name;
		this.handy = handy;
		this.adresse = adresse;
		this.setVisible(false);
//		this.pathOfUser = new File(System.getProperty("user.dir") + "\\" + name + ".txt");
//		try {
//			if (this.pathOfUser.createNewFile()) {
//				System.out.println("File created: " + this.pathOfUser.getName());
//			} else {
//				System.out.println("File already exists.");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	public String getname() {
		return this.name ;
	}
	
	public String handy() {
		return this.handy ;
	}
	
	public String adresse() {
		return this.adresse ;
	}
}
