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
import javax.swing.SwingConstants;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnProyectos;
	public JSeparator separator; 
	public JButton btnAsignaciones;
	public JButton btnCientificos;

	public VistaPrincipal() {
		setTitle("Estudios");
		setBounds(550, 300, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		System.out.println(contentPane);
		
		btnCientificos = new JButton("Cientificos");
		btnCientificos.setForeground(new Color(255, 248, 220));
		btnCientificos.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCientificos.setBackground(new Color(25, 25, 112));
		btnCientificos.setBounds(42, 0, 125, 363);
		contentPane.add(btnCientificos);
		
		btnProyectos = new JButton("Proyectos");
		btnProyectos.setForeground(new Color(255, 248, 220));
		btnProyectos.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnProyectos.setBackground(new Color(25, 25, 112));
		btnProyectos.setBounds(233, 0, 125, 363);
		contentPane.add(btnProyectos);
		
		btnAsignaciones = new JButton("Asignaciones");
		btnAsignaciones.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAsignaciones.setForeground(new Color(255, 255, 255));
		btnAsignaciones.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAsignaciones.setBackground(new Color(25, 25, 112));
		btnAsignaciones.setBounds(357, 158, 229, 47);
		contentPane.add(btnAsignaciones);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 44, 586, 32);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 283, 586, 37);
		contentPane.add(panel_1);
	}
}
