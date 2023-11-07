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

public class VistaUpdateProyecto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public JButton Guardar; 
	public JTextField textID;
	public JTextField textNombre;
	public JTextField textHoras;
	private JLabel lblHoras;
	private JLabel lblEnunciado;

	public VistaUpdateProyecto() {
		setTitle("Modificar Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEnunciado = new JLabel("Elige la ID a modificar:");
		lblEnunciado.setForeground(new Color(255, 255, 255));
		lblEnunciado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnunciado.setBackground(new Color(25, 25, 112));
		lblEnunciado.setBounds(68, 45, 155, 14);
		contentPane.add(lblEnunciado);
		
		lblHoras = new JLabel("Horas");
		lblHoras.setForeground(new Color(255, 255, 255));
		lblHoras.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHoras.setBackground(new Color(25, 25, 112));
		lblHoras.setBounds(136, 138, 41, 14);
		contentPane.add(lblHoras);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBackground(new Color(25, 25, 112));
		lblNombre.setBounds(126, 107, 48, 14);
		contentPane.add(lblNombre);
		
		JLabel labelID = new JLabel("ID");
		labelID.setForeground(new Color(255, 255, 255));
		labelID.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelID.setBackground(new Color(25, 25, 112));
		labelID.setBounds(257, 45, 23, 14);
		contentPane.add(labelID);
		
		textHoras = new JTextField();
		textHoras.setForeground(new Color(25, 25, 112));
		textHoras.setColumns(10);
		textHoras.setBounds(184, 136, 96, 20);
		contentPane.add(textHoras);
		
		textNombre = new JTextField();
		textNombre.setForeground(new Color(25, 25, 112));
		textNombre.setColumns(10);
		textNombre.setBounds(184, 105, 96, 20);
		contentPane.add(textNombre);
		
		textID = new JTextField();
		textID.setFont(new Font("Tahoma", Font.BOLD, 12));
		textID.setForeground(new Color(25, 25, 112));
		textID.setBackground(new Color(255, 255, 255));
		textID.setBounds(290, 43, 96, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		Guardar = new JButton("Guardar");
		Guardar.setForeground(new Color(25, 25, 112));
		Guardar.setFont(new Font("Tahoma", Font.BOLD, 12));
		Guardar.setBackground(new Color(255, 255, 255));
		Guardar.setBounds(147, 187, 155, 23);
		contentPane.add(Guardar);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setBackground(new Color(25, 25, 112));
		table.setBounds(10, 24, 416, 214);
		contentPane.add(table);
		
	}
}