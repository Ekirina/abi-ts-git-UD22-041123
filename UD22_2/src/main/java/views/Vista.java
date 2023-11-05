package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import controllers.ConexionSQL;


public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_c;
	private String usuario;
	private String pass;
	private String bbdd;
	private String sql;
	private JTable table_v;
																												
		public Vista() {
		setTitle("Videoclub");
		setBounds(650, 300, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		System.out.println(contentPane);
		
		//ConexionSQL con = new ConexionSQL.mySQLConnection();

		table_c = new JTable();
		table_c.setFont(new Font("Tahoma", Font.BOLD, 13));
		table_c.setBackground(new Color(216, 191, 216));
		table_c.setBounds(36, 58, 515, 120);
		contentPane.add(table_c);
		
		DefaultTableModel model_c = new DefaultTableModel();                    
		
		model_c.addColumn("id");
		model_c.addColumn("nombre");
		model_c.addColumn("apellido");
		model_c.addColumn("direccion");
		model_c.addColumn("dni");
		model_c.addColumn("fecha");
		
		table_c.setModel(model_c);
		//falta hacer el array

		JButton insert = new JButton("Insertar");
		insert.setFont(new Font("Tahoma", Font.BOLD, 12));
		insert.setForeground(new Color(216, 191, 216));
		insert.setBackground(new Color(105, 105, 105));
		insert.setBounds(36, 24, 134, 23);
		contentPane.add(insert);
		
		JButton btnUpdate = new JButton("Actualizar");
		btnUpdate.setBackground(new Color(105, 105, 105));
		btnUpdate.setForeground(new Color(216, 191, 216));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdate.setBounds(228, 24, 134, 23);
		contentPane.add(btnUpdate);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(105, 105, 105));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminar.setForeground(new Color(216, 191, 216));
		btnEliminar.setBounds(417, 24, 134, 23);
		contentPane.add(btnEliminar);
		
		table_v = new JTable();
		table_v.setFont(new Font("Tahoma", Font.BOLD, 13));
		table_v.setBackground(new Color(216, 191, 216));
		table_v.setBounds(36, 206, 515, 120);
		contentPane.add(table_v);
		
		DefaultTableModel model_v= new DefaultTableModel();                    
		
		model_v.addColumn("id");
		model_v.addColumn("title");
		model_v.addColumn("director");
		model_v.addColumn("cli_id");
		
		table_v.setModel(model_v);
	
	}
}
