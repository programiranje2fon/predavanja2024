package dvocas12_utorak.zadatak1.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dvocas12_utorak.zadatak1.poslovna_logika.Osoba;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImenikGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField poljeIme;
	private JTextField poljeAdresa;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField poljePrezime;
	private JTextField poljeTelefon;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JScrollPane scrollPane;
	private JTextArea editor;
	
	private List<Osoba> osobe = new ArrayList<Osoba>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImenikGUI frame = new ImenikGUI();
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
	public ImenikGUI() {
		setResizable(false);
		setTitle("Telefonski imenik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getPoljeIme());
		contentPane.add(getPoljeAdresa());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getPoljePrezime());
		contentPane.add(getPoljeTelefon());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getScrollPane());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Ime");
			lblNewLabel.setBounds(10, 10, 96, 13);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Adresa");
			lblNewLabel_1.setBounds(138, 10, 96, 13);
		}
		return lblNewLabel_1;
	}
	private JTextField getPoljeIme() {
		if (poljeIme == null) {
			poljeIme = new JTextField();
			poljeIme.setBounds(10, 33, 96, 19);
			poljeIme.setColumns(10);
		}
		return poljeIme;
	}
	private JTextField getPoljeAdresa() {
		if (poljeAdresa == null) {
			poljeAdresa = new JTextField();
			poljeAdresa.setBounds(138, 33, 96, 19);
			poljeAdresa.setColumns(10);
		}
		return poljeAdresa;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Prezime");
			lblNewLabel_2.setBounds(10, 62, 96, 13);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Telefon");
			lblNewLabel_3.setBounds(138, 62, 96, 13);
		}
		return lblNewLabel_3;
	}
	private JTextField getPoljePrezime() {
		if (poljePrezime == null) {
			poljePrezime = new JTextField();
			poljePrezime.setBounds(10, 85, 96, 19);
			poljePrezime.setColumns(10);
		}
		return poljePrezime;
	}
	private JTextField getPoljeTelefon() {
		if (poljeTelefon == null) {
			poljeTelefon = new JTextField();
			poljeTelefon.setBounds(138, 85, 96, 19);
			poljeTelefon.setColumns(10);
		}
		return poljeTelefon;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String ime = poljeIme.getText();
						String prezime = poljePrezime.getText();
						String adresa = poljeAdresa.getText();
						int telefon = Integer.parseInt( poljeTelefon.getText() );
						
						Osoba o = new Osoba();
						o.setIme(ime);
						o.setPrezime(prezime);
						o.setTelefon(telefon);
						o.setAdresa(adresa);
						
						osobe.add(o);
						
						poljeIme.setText(null);
						poljePrezime.setText(null);
						poljeAdresa.setText(null);
						poljeTelefon.setText(null);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(contentPane,
								e1.getMessage(), 
								"Greska: " + e1.getClass(),
								JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnNewButton.setBounds(10, 127, 96, 21);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Obrisi");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					poljeIme.setText(null);
					poljePrezime.setText(null);
					poljeAdresa.setText(null);
					poljeTelefon.setText(null);
					editor.setText(null);
				}
			});
			btnNewButton_1.setBounds(138, 127, 96, 21);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Prikazi");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					editor.setText(null);
					
					for(Osoba os: osobe)
						editor.append(os.toString() + System.lineSeparator());
				}
			});
			btnNewButton_2.setBounds(10, 158, 96, 21);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("Izadji");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton_3.setBounds(138, 158, 96, 21);
		}
		return btnNewButton_3;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(267, 10, 300, 181);
			scrollPane.setViewportView(getEditor());
		}
		return scrollPane;
	}
	private JTextArea getEditor() {
		if (editor == null) {
			editor = new JTextArea();
		}
		return editor;
	}
}
