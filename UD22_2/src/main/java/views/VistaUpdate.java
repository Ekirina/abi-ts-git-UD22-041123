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

public class VistaUpdate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public JButton Guardar; 
	public JTextField textID;
	public JTextField textNombre;
	public JTextField textApellido;
	public JTextField textDireccion;
	public JTextField textDNI;
	public JTextField textFecha;
	private JLabel lblDireccion;
	private JLabel lblDni;
	private JLabel lblFecha;
	private JLabel lblEnunciado;

	public VistaUpdate() {
		setTitle("Modificar Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEnunciado = new JLabel("Elige la ID a modificar:");
		lblEnunciado.setForeground(new Color(105, 105, 105));
		lblEnunciado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnunciado.setBackground(new Color(216, 191, 216));
		lblEnunciado.setBounds(40, 46, 155, 14);
		contentPane.add(lblEnunciado);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(Color.GRAY);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFecha.setBackground(new Color(221, 160, 221));
		lblFecha.setBounds(239, 159, 41, 14);
		contentPane.add(lblFecha);
		
		lblDni = new JLabel("DNI");
		lblDni.setForeground(Color.GRAY);
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDni.setBackground(new Color(221, 160, 221));
		lblDni.setBounds(248, 122, 25, 14);
		contentPane.add(lblDni);
		
		lblDireccion = new JLabel("Dirección");
		lblDireccion.setForeground(Color.GRAY);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDireccion.setBackground(new Color(221, 160, 221));
		lblDireccion.setBounds(218, 91, 62, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setForeground(Color.GRAY);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellido.setBackground(new Color(221, 160, 221));
		lblApellido.setBounds(36, 158, 53, 14);
		contentPane.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.GRAY);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBackground(new Color(221, 160, 221));
		lblNombre.setBounds(41, 122, 48, 14);
		contentPane.add(lblNombre);
		
		JLabel labelID = new JLabel("ID");
		labelID.setForeground(new Color(128, 128, 128));
		labelID.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelID.setBackground(new Color(221, 160, 221));
		labelID.setBounds(257, 45, 23, 14);
		contentPane.add(labelID);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(290, 156, 96, 20);
		contentPane.add(textFecha);
		
		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBounds(290, 120, 96, 20);
		contentPane.add(textDNI);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(290, 89, 96, 20);
		contentPane.add(textDireccion);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(99, 155, 96, 20);
		contentPane.add(textApellido);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(99, 119, 96, 20);
		contentPane.add(textNombre);
		
		textID = new JTextField();
		textID.setFont(new Font("Tahoma", Font.BOLD, 12));
		textID.setForeground(new Color(255, 255, 255));
		textID.setBackground(new Color(105, 105, 105));
		textID.setBounds(290, 43, 96, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		Guardar = new JButton("Guardar");
		Guardar.setForeground(new Color(105, 105, 105));
		Guardar.setFont(new Font("Tahoma", Font.BOLD, 12));
		Guardar.setBackground(new Color(216, 191, 216));
		Guardar.setBounds(140, 201, 155, 23);
		contentPane.add(Guardar);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setBackground(new Color(220, 220, 220));
		table.setBounds(10, 24, 416, 214);
		contentPane.add(table);
		
	}
}
