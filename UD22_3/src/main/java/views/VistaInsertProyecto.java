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

public class VistaInsertProyecto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public JButton Guardar; 
	public JTextField textId;
	public JTextField textNombre;
	public JTextField textHoras;

	public VistaInsertProyecto() {
		setTitle("Insertar nuevo proyecto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHoras = new JLabel("horas");
		lblHoras.setForeground(Color.WHITE);
		lblHoras.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHoras.setBackground(new Color(25, 25, 112));
		lblHoras.setBounds(121, 124, 41, 14);
		contentPane.add(lblHoras);
		
		textHoras = new JTextField();
		textHoras.setForeground(new Color(25, 25, 112));
		textHoras.setColumns(10);
		textHoras.setBounds(172, 121, 96, 20);
		contentPane.add(textHoras);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBackground(new Color(25, 25, 112));
		lblNombre.setBounds(108, 88, 54, 14);
		contentPane.add(lblNombre);
		
		JLabel labelID = new JLabel("ID");
		labelID.setForeground(new Color(255, 255, 255));
		labelID.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelID.setBackground(new Color(25, 25, 112));
		labelID.setBounds(132, 57, 30, 14);
		contentPane.add(labelID);
		
		textNombre = new JTextField();
		textNombre.setForeground(new Color(25, 25, 112));
		textNombre.setColumns(10);
		textNombre.setBounds(172, 86, 96, 20);
		contentPane.add(textNombre);
		
		textId = new JTextField();
		textId.setForeground(new Color(25, 25, 112));
		textId.setBounds(172, 55, 96, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
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