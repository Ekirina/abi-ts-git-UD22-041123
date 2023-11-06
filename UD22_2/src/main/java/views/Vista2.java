package views;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import controllers.Controlador;
import models.Cliente;
import models.Videos;


public class Vista2 extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private String usuario;
	private String pass;
	private String bbdd;
	private String sql;
	public JButton btnInsert;
	public JButton btnUpdate;
	public JButton btnEliminar;
	public JButton btnVerCliente;

	DefaultTableModel model = new DefaultTableModel();                    

	ArrayList<Videos> listaVideos;																											
	public Vista2() {
		listaVideos=Controlador.mostrarTablaVideos();	

		setTitle("Videoclub");
		setBounds(550, 300, 600, 380);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		System.out.println(contentPane);

		//ConexionSQL con = new ConexionSQL.mySQLConnection();

		table = new JTable();
		table.setForeground(new Color(255, 255, 255));
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setBackground(new Color(105, 105, 105));
		table.setBounds(36, 58, 515, 229);
		contentPane.add(table);


		model.addColumn("id");
		model.addColumn("title");
		model.addColumn("director");
		model.addColumn("cli_id");

		table.setModel(model);
		for (int i = 0; i < listaVideos.size(); i++) {
			model.addRow(listaVideos.get(i).devolverArray());
		}

		btnInsert = new JButton("Insertar");
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInsert.setForeground(new Color(105, 105, 105));
		btnInsert.setBackground(new Color(216, 191, 216));
		btnInsert.setBounds(36, 24, 134, 23);
		contentPane.add(btnInsert);

		btnUpdate = new JButton("Modificar");
		btnUpdate.setBackground(new Color(216, 191, 216));
		btnUpdate.setForeground(new Color(105, 105, 105));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdate.setBounds(228, 24, 134, 23);
		contentPane.add(btnUpdate);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(216, 191, 216));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminar.setForeground(new Color(105, 105, 105));
		btnEliminar.setBounds(417, 24, 134, 23);
		contentPane.add(btnEliminar);
		
		btnVerCliente = new JButton("Ver clientes");
		btnVerCliente.setForeground(new Color(105, 105, 105));
		btnVerCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerCliente.setBackground(new Color(216, 191, 216));
		btnVerCliente.setBounds(228, 311, 134, 23);
		contentPane.add(btnVerCliente);
		
		
	}
	public void refrescar() {
		listaVideos.clear();
		listaVideos=Controlador.mostrarTablaVideos();	
		for (int i = model.getRowCount()-1; i >= 0; i--) {
			model.removeRow(i);
		}
		for (int i = 0; i < listaVideos.size(); i++) {
			model.addRow(listaVideos.get(i).devolverArray());
		}
	}
}
