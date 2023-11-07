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

public class VistaInsertAsignado_a extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public JButton Guardar; 
	public JTextField textCientifico;
	public JTextField textProyecto;

	public VistaInsertAsignado_a() {
		setTitle("Insertar nuevo científico");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProyecto = new JLabel("proyecto");
		lblProyecto.setForeground(new Color(255, 255, 255));
		lblProyecto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProyecto.setBackground(new Color(25, 25, 112));
		lblProyecto.setBounds(101, 129, 61, 14);
		contentPane.add(lblProyecto);
		
		JLabel labelCientifico = new JLabel("cientifico");
		labelCientifico.setForeground(new Color(255, 255, 255));
		labelCientifico.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelCientifico.setBackground(new Color(25, 25, 112));
		labelCientifico.setBounds(107, 81, 55, 14);
		contentPane.add(labelCientifico);
		
		textProyecto = new JTextField();
		textProyecto.setForeground(new Color(25, 25, 112));
		textProyecto.setColumns(10);
		textProyecto.setBounds(172, 127, 96, 20);
		contentPane.add(textProyecto);
		
		textCientifico = new JTextField();
		textCientifico.setForeground(new Color(25, 25, 112));
		textCientifico.setBounds(172, 79, 96, 20);
		contentPane.add(textCientifico);
		textCientifico.setColumns(10);
		
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