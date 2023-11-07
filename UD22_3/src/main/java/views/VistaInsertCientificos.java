package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VistaInsertCientificos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public JButton Guardar; 
	public JTextField textDNI;
	public JTextField textNom_apels;

	public VistaInsertCientificos() {
		setTitle("Insertar nuevo científico");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom_apels = new JLabel("nom_apels");
		lblNom_apels.setForeground(new Color(255, 255, 255));
		lblNom_apels.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNom_apels.setBackground(new Color(25, 25, 112));
		lblNom_apels.setBounds(93, 129, 69, 14);
		contentPane.add(lblNom_apels);
		
		JLabel labelDNI = new JLabel("DNI");
		labelDNI.setForeground(new Color(255, 255, 255));
		labelDNI.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelDNI.setBackground(new Color(25, 25, 112));
		labelDNI.setBounds(132, 81, 30, 14);
		contentPane.add(labelDNI);
		
		textNom_apels = new JTextField();
		textNom_apels.setForeground(new Color(25, 25, 112));
		textNom_apels.setColumns(10);
		textNom_apels.setBounds(172, 127, 96, 20);
		contentPane.add(textNom_apels);
		
		textDNI = new JTextField();
		textDNI.setForeground(new Color(25, 25, 112));
		textDNI.setBounds(172, 79, 96, 20);
		contentPane.add(textDNI);
		textDNI.setColumns(10);
		
		Guardar = new JButton("Guardar");
		Guardar.setForeground(new Color(25, 25, 112));
		Guardar.setFont(new Font("Tahoma", Font.BOLD, 12));
		Guardar.setBackground(new Color(255, 255, 255));
		Guardar.setBounds(140, 176, 155, 23);
		contentPane.add(Guardar);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setBackground(new Color(25, 25, 112));
		table.setBounds(10, 24, 416, 214);
		contentPane.add(table);
		
	}
}