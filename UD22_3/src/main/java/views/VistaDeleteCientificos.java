package views;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VistaDeleteCientificos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public JButton eliminar; 
	public JTextField textDNI;
	private JLabel lblEnunciado;

	public VistaDeleteCientificos() {
		setTitle("Eliminar cientifico");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEnunciado = new JLabel("Introduce el DNI a eliminar:");
		lblEnunciado.setForeground(new Color(255, 255, 255));
		lblEnunciado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnunciado.setBackground(new Color(25, 25, 112));
		lblEnunciado.setBounds(49, 107, 171, 14);
		contentPane.add(lblEnunciado);
		
		JLabel labelID = new JLabel("DNI");
		labelID.setForeground(new Color(255, 255, 255));
		labelID.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelID.setBackground(new Color(25, 25, 112));
		labelID.setBounds(237, 107, 32, 14);
		contentPane.add(labelID);
		
		textDNI = new JTextField();
		textDNI.setFont(new Font("Tahoma", Font.BOLD, 12));
		textDNI.setForeground(new Color(25, 25, 112));
		textDNI.setBackground(new Color(255, 255, 255));
		textDNI.setBounds(279, 104, 96, 20);
		contentPane.add(textDNI);
		textDNI.setColumns(10);
		
		eliminar = new JButton("Eliminar");
		eliminar.setForeground(new Color(25, 25, 112));
		eliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		eliminar.setBackground(new Color(255, 255, 255));
		eliminar.setBounds(141, 175, 155, 23);
		contentPane.add(eliminar);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setBackground(new Color(25, 25, 112));
		table.setBounds(10, 24, 416, 214);
		contentPane.add(table);
		
	}
}
