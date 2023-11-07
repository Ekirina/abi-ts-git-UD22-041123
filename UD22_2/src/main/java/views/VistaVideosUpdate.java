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

public class VistaVideosUpdate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public JButton Guardar; 
	public JTextField textID;
	public JTextField textDirector;
	public JTextField textCli_id;
	public JTextField textTitle;
	private JLabel lblTitle;
	private JLabel lblEnunciado;

	public VistaVideosUpdate() {
		setTitle("Modificar Video");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(1200, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEnunciado = new JLabel("Elige la ID a modificar:");
		lblEnunciado.setForeground(new Color(255, 255, 255));
		lblEnunciado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnunciado.setBackground(new Color(216, 191, 216));
		lblEnunciado.setBounds(40, 46, 155, 14);
		contentPane.add(lblEnunciado);
		
		lblTitle = new JLabel("Title");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setBackground(new Color(221, 160, 221));
		lblTitle.setBounds(142, 91, 33, 14);
		contentPane.add(lblTitle);
		
		JLabel lblCli_id = new JLabel("Cli_id");
		lblCli_id.setForeground(new Color(255, 255, 255));
		lblCli_id.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCli_id.setBackground(new Color(221, 160, 221));
		lblCli_id.setBounds(135, 158, 40, 14);
		contentPane.add(lblCli_id);
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setForeground(new Color(255, 255, 255));
		lblDirector.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDirector.setBackground(new Color(221, 160, 221));
		lblDirector.setBounds(122, 126, 49, 14);
		contentPane.add(lblDirector);
		
		JLabel labelID = new JLabel("ID");
		labelID.setForeground(new Color(255, 255, 255));
		labelID.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelID.setBackground(new Color(221, 160, 221));
		labelID.setBounds(257, 45, 23, 14);
		contentPane.add(labelID);
		
		textTitle = new JTextField();
		textTitle.setColumns(10);
		textTitle.setBounds(184, 89, 96, 20);
		contentPane.add(textTitle);
		
		textCli_id = new JTextField();
		textCli_id.setColumns(10);
		textCli_id.setBounds(184, 156, 96, 20);
		contentPane.add(textCli_id);
		
		textDirector = new JTextField();
		textDirector.setColumns(10);
		textDirector.setBounds(184, 124, 96, 20);
		contentPane.add(textDirector);
		
		textID = new JTextField();
		textID.setFont(new Font("Tahoma", Font.BOLD, 12));
		textID.setForeground(new Color(105, 105, 105));
		textID.setBackground(new Color(255, 255, 255));
		textID.setBounds(290, 43, 96, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		Guardar = new JButton("Guardar");
		Guardar.setForeground(new Color(105, 105, 105));
		Guardar.setFont(new Font("Tahoma", Font.BOLD, 12));
		Guardar.setBackground(new Color(255, 255, 255));
		Guardar.setBounds(140, 201, 155, 23);
		contentPane.add(Guardar);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setBackground(new Color(105, 105, 105));
		table.setBounds(10, 24, 416, 214);
		contentPane.add(table);
		
	}
}
