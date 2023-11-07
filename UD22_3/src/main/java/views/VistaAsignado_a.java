package views;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controllers.Controlador;
import models.Asignado_a;
import models.Proyecto;

public class VistaAsignado_a extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private String usuario;
	private String pass;
	private String bbdd;
	private String sql;
	public JButton btnInsert;
	public JButton btnUpdate;
	public JButton btnVolver;
	public JButton btnEliminar;
	
	DefaultTableModel model = new DefaultTableModel();   

	ArrayList<Asignado_a> listaAsignado_a;																											
	
	public VistaAsignado_a() {
		listaAsignado_a=Controlador.mostrarTablaAsignado_a();	

		setTitle("Proyectos asignados");
		setBounds(550, 300, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		System.out.println(contentPane);

		btnInsert = new JButton("Insertar");
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInsert.setForeground(new Color(255, 255, 255));
		btnInsert.setBackground(new Color(25, 25, 112));
		btnInsert.setBounds(36, 24, 134, 23);
		contentPane.add(btnInsert);

		btnUpdate = new JButton("Modificar");
		btnUpdate.setBackground(new Color(25, 25, 112));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdate.setBounds(228, 24, 134, 23);
		contentPane.add(btnUpdate);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(25, 25, 112));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminar.setForeground(new Color(255, 255, 255));
		btnEliminar.setBounds(417, 24, 134, 23);
		contentPane.add(btnEliminar);

		btnVolver = new JButton("Volver");
		btnVolver.setForeground(new Color(25, 25, 112));
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVolver.setBackground(new Color(255, 255, 255));
		btnVolver.setBounds(228, 311, 134, 23);
		contentPane.add(btnVolver);

		//ConexionSQL con = new ConexionSQL.mySQLConnection();

		table = new JTable();
		table.setForeground(new Color(255, 255, 224));
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setBackground(new Color(25, 25, 112));
		table.setBounds(0, 58, 586, 229);
		contentPane.add(table);


		model.addColumn("cientifico");
		model.addColumn("proyecto");

		table.setModel(model);
		for (int i = 0; i < listaAsignado_a.size(); i++) {
			model.addRow(listaAsignado_a.get(i).devolverArray());
		}

	}
	public void refrescar() {
		listaAsignado_a.clear();
		listaAsignado_a=Controlador.mostrarTablaAsignado_a();	
		for (int i = model.getRowCount()-1; i >= 0; i--) {
			model.removeRow(i);
		}
		for (int i = 0; i < listaAsignado_a.size(); i++) {
			model.addRow(listaAsignado_a.get(i).devolverArray());
		}
	}
}
