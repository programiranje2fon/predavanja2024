package dvocas13_utorak.zadatak1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dvocas13_utorak.zadatak1.poslovna_logika.Blog;
import dvocas13_utorak.zadatak1.poslovna_logika.BlogPost;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BlogGUI extends JFrame {

	private JPanel contentPane;
	private Blog blog;
	private JTextField putanjaField;
	private JTextField naslovField;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlogGUI frame = new BlogGUI();
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
	public BlogGUI() {
		setTitle("Program za pisanje blog-a");
		blog = new Blog();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(120, 10));
		contentPane.add(panel, BorderLayout.WEST);
		
		JButton btnDodaj = new JButton("Dodaj post");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String naslov = naslovField.getText();
				String sadrzaj = textArea.getText();
				
				try {
					BlogPost post = new BlogPost();
					post.setNaslov(naslov);
					post.setSadrzaj(sadrzaj);
					blog.dodajPost(post);
					naslovField.setText("");
					textArea.setText("");
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(panel, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnDodaj.setPreferredSize(new Dimension(100, 23));
		panel.add(btnDodaj);
		
		JButton btnPrikazi = new JButton("Prikazi sve");
		btnPrikazi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<BlogPost> postovi = blog.getPostovi();
				for(BlogPost post : postovi) {
					textArea.append(post.toString());
				}
				
			}
		});
		btnPrikazi.setPreferredSize(new Dimension(100, 23));
		panel.add(btnPrikazi);
		
		JLabel lblNewLabel = new JLabel("Fajl (putanja):");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel);
		
		putanjaField = new JTextField();
		putanjaField.setPreferredSize(new Dimension(100, 20));
		panel.add(putanjaField);
		putanjaField.setColumns(10);
		
		JComboBox formatComboBox = new JComboBox();
		formatComboBox.setPreferredSize(new Dimension(100, 22));
		formatComboBox.setModel(new DefaultComboBoxModel(new String[] {"TXT", "BINARNI", "JSON"}));
		panel.add(formatComboBox);
		
		JButton btnNewButton = new JButton("Sacuvaj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String putanja = putanjaField.getText();
				String format = formatComboBox.getSelectedItem().toString();
				
				if (format.equals("TXT")) {
					blog.sacuvajBlogTXT(putanja);
				} else if (format.equals("BINARNI")) {
					blog.serijalizujBlog(putanja);
				} else if (format.equals("JSON")) {
					blog.sacuvajBlogJSON(putanja);
				}
				
			}
		});
		btnNewButton.setPreferredSize(new Dimension(100, 23));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Izadji");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int odgovor = JOptionPane.showConfirmDialog(contentPane, "Da li zaista zelite da izadjete iz programa?", "Potvrda", JOptionPane.YES_NO_CANCEL_OPTION);
				if (odgovor == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1.setPreferredSize(new Dimension(100, 23));
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Naslov blog post-a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_1);
		
		naslovField = new JTextField();
		panel_1.add(naslovField);
		naslovField.setColumns(20);
		
		textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
	}
}
