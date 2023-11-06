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

public class VistaVideosInsert extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public JButton Guardar; 
	public JTextField textID;
	public JTextField textTitle;
	public JTextField textDirector;
	public JTextField textCli_id;
	private JLabel lblCli_id;

	public VistaVideosInsert() {
		setTitle("Insertar nuevo video");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(1200, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCli_id = new JLabel("Cli_id");
		lblCli_id.setForeground(new Color(255, 255, 255));
		lblCli_id.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCli_id.setBackground(new Color(221, 160, 221));
		lblCli_id.setBounds(45, 122, 41, 14);
		contentPane.add(lblCli_id);
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setForeground(new Color(255, 255, 255));
		lblDirector.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDirector.setBackground(new Color(221, 160, 221));
		lblDirector.setBounds(224, 122, 53, 14);
		contentPane.add(lblDirector);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setBackground(new Color(221, 160, 221));
		lblTitle.setBounds(244, 82, 33, 14);
		contentPane.add(lblTitle);
		
		JLabel labelID = new JLabel("ID");
		labelID.setForeground(new Color(255, 255, 255));
		labelID.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelID.setBackground(new Color(221, 160, 221));
		labelID.setBounds(63, 82, 23, 14);
		contentPane.add(labelID);
		
		textCli_id = new JTextField();
		textCli_id.setColumns(10);
		textCli_id.setBounds(96, 120, 96, 20);
		contentPane.add(textCli_id);
		
		textDirector = new JTextField();
		textDirector.setColumns(10);
		textDirector.setBounds(287, 120, 96, 20);
		contentPane.add(textDirector);
		
		textTitle = new JTextField();
		textTitle.setColumns(10);
		textTitle.setBounds(287, 80, 96, 20);
		contentPane.add(textTitle);
		
		textID = new JTextField();
		textID.setBounds(96, 80, 96, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		Guardar = new JButton("Guardar");
		Guardar.setForeground(new Color(105, 105, 105));
		Guardar.setFont(new Font("Tahoma", Font.BOLD, 12));
		Guardar.setBackground(new Color(255, 255, 255));
		Guardar.setBounds(139, 179, 155, 23);
		contentPane.add(Guardar);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setBackground(new Color(105, 105, 105));
		table.setBounds(10, 24, 416, 214);
		contentPane.add(table);
		
	}
}
