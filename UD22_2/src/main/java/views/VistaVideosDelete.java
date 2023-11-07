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

public class VistaVideosDelete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public JButton eliminar; 
	public JTextField textID;
	private JLabel lblEnunciado;

	public VistaVideosDelete() {
		setTitle("Eliminar video");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(1200, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEnunciado = new JLabel("Elige la ID a eliminar:");
		lblEnunciado.setForeground(new Color(255, 255, 255));
		lblEnunciado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnunciado.setBackground(new Color(216, 191, 216));
		lblEnunciado.setBounds(65, 107, 155, 14);
		contentPane.add(lblEnunciado);
		
		JLabel labelID = new JLabel("ID");
		labelID.setForeground(new Color(255, 255, 255));
		labelID.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelID.setBackground(new Color(221, 160, 221));
		labelID.setBounds(246, 107, 23, 14);
		contentPane.add(labelID);
		
		textID = new JTextField();
		textID.setFont(new Font("Tahoma", Font.BOLD, 12));
		textID.setForeground(new Color(105, 105, 105));
		textID.setBackground(new Color(255, 255, 255));
		textID.setBounds(279, 104, 96, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		
		eliminar = new JButton("Eliminar");
		eliminar.setForeground(new Color(105, 105, 105));
		eliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		eliminar.setBackground(new Color(255, 255, 255));
		eliminar.setBounds(141, 175, 155, 23);
		contentPane.add(eliminar);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setBackground(new Color(105, 105, 105));
		table.setBounds(10, 24, 416, 214);
		contentPane.add(table);
		
	}
}
