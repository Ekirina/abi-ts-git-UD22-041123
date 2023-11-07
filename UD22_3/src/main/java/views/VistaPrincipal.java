package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnProyectos;
	public JSeparator separator; 
	public JButton btnAsignaciones;
	public JButton btnCientificos;

	public VistaPrincipal() {
		setTitle("Estudios");
		setBounds(650, 300, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		System.out.println(contentPane);
		
		btnProyectos = new JButton("Proyectos");
		btnProyectos.setForeground(new Color(255, 248, 220));
		btnProyectos.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnProyectos.setBackground(new Color(25, 25, 112));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 100, 566, 0);
		contentPane.add(separator);
		btnProyectos.setBounds(233, 0, 125, 363);
		contentPane.add(btnProyectos);
		
		btnAsignaciones = new JButton("Asignaciones");
		btnAsignaciones.setForeground(new Color(255, 248, 220));
		btnAsignaciones.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAsignaciones.setBackground(new Color(25, 25, 112));
		btnAsignaciones.setBounds(419, 0, 125, 363);
		contentPane.add(btnAsignaciones);
		
		btnCientificos = new JButton("Cientificos");
		btnCientificos.setForeground(new Color(255, 248, 220));
		btnCientificos.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCientificos.setBackground(new Color(25, 25, 112));
		btnCientificos.setBounds(42, 0, 125, 363);
		contentPane.add(btnCientificos);
	}
}
