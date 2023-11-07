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

public class VistaUpdateAsignado_a extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public JButton Guardar; 
	public JTextField textCientifico;
	public JTextField textProyecto;
	private JLabel lblEnunciado;

	public VistaUpdateAsignado_a() {
		setTitle("Modificar proyecto asignado");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEnunciado = new JLabel("Elige el científico asignado a modificar:");
		lblEnunciado.setForeground(new Color(255, 255, 255));
		lblEnunciado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnunciado.setBackground(new Color(25, 25, 112));
		lblEnunciado.setBounds(106, 49, 258, 14);
		contentPane.add(lblEnunciado);
		
		JLabel lblProyecto = new JLabel("Proyecto");
		lblProyecto.setForeground(new Color(255, 255, 255));
		lblProyecto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProyecto.setBackground(new Color(25, 25, 112));
		lblProyecto.setBounds(106, 140, 64, 14);
		contentPane.add(lblProyecto);
		
		JLabel labelCientifico = new JLabel("Cientifico");
		labelCientifico.setForeground(new Color(255, 255, 255));
		labelCientifico.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelCientifico.setBackground(new Color(25, 25, 112));
		labelCientifico.setBounds(106, 97, 68, 14);
		contentPane.add(labelCientifico);
		
		textProyecto = new JTextField();
		textProyecto.setForeground(new Color(25, 25, 112));
		textProyecto.setColumns(10);
		textProyecto.setBounds(184, 138, 96, 20);
		contentPane.add(textProyecto);
		
		textCientifico = new JTextField();
		textCientifico.setFont(new Font("Tahoma", Font.BOLD, 12));
		textCientifico.setForeground(new Color(25, 25, 112));
		textCientifico.setBackground(new Color(255, 255, 255));
		textCientifico.setBounds(184, 94, 96, 20);
		contentPane.add(textCientifico);
		textCientifico.setColumns(10);
		
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