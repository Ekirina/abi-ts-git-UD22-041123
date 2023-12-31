package controllers;
import views.Vista;
import views.VistaDelete;
import views.VistaInsert;
import views.VistaUpdate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controllers.ConexionSQL;
import models.Cliente;

public class Controlador {
	String db = "";
	String name = "";
	String sentencia = "";
	Connection conexion;
	Vista vista;
	
	public Controlador(Vista vista) {
		this.vista = vista;
		vista.btnEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VistaDelete vistaDelete = new VistaDelete();
				vistaDelete.setVisible(true);
				vistaDelete.eliminar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String id = vistaDelete.textID.getText();
						sentencia = "WHERE id = "+id+";";
						ConexionSQL.deleteData("videoclub", "Cliente", sentencia);
						vista.refrescar();
					}		
				});
			}	
		});
		vista.btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VistaUpdate vistaUpdate = new VistaUpdate();
				vistaUpdate.setVisible(true);
				vistaUpdate.Guardar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String id = vistaUpdate.textID.getText();
						String nombre = vistaUpdate.textNombre.getText();
						String apellido = vistaUpdate.textApellido.getText();
						String direccion = vistaUpdate.textDireccion.getText();
						String dni = vistaUpdate.textDNI.getText();
						String fecha = vistaUpdate.textFecha.getText();
						
						sentencia = "SET nombre = '"+nombre+"', apellido = '"+apellido+"', direccion = '"+direccion+"', dni = "+dni+", fecha= '"+fecha+"' WHERE id = "+id+";";
						ConexionSQL.updateData("videoclub", "Cliente", sentencia);
						vista.refrescar();
					}	
				});
			}
		});
		vista.btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VistaInsert vistaInsert = new VistaInsert();
				vistaInsert.setVisible(true);
				vistaInsert.Guardar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						String id = vistaInsert.textID.getText();
						String nombre = vistaInsert.textNombre.getText();
						String apellido = vistaInsert.textApellido.getText();
						String direccion = vistaInsert.textDireccion.getText();
						String dni = vistaInsert.textDNI.getText();
						String fecha = vistaInsert.textFecha.getText();
						
						sentencia = "(id, nombre, apellido, direccion, dni, fecha) values ("+id+", '"+nombre+"', '"+apellido+"', '"+direccion+"', "+dni+", '"+fecha+"');";
						ConexionSQL.insertData("videoclub", "Cliente", sentencia);
						vista.refrescar();
					}
				});
			}
		});
	}

	public static ArrayList<Cliente> mostrarTablaCliente () {
		try {
			ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();	
			ConexionSQL.mySQLConnection("root", "primero", "videoclub");
			Statement st = ConexionSQL.conexion.createStatement();
			String sentencia = "SELECT * FROM Cliente;";
			ResultSet result = st.executeQuery(sentencia); //en conexion SQL es executeUpdate
			while (result.next()) {
				Cliente cliente;
				String id;
				String nombre;
				String apellido;
				String direccion;
				String dni;
				String fecha;
				id=result.getString(1);	
				nombre=result.getString(2);	
				apellido = result.getString(3);					
				direccion = result.getString(4);					
				dni = result.getString(5);					
				fecha = result.getString(6);	
				cliente = new Cliente(id, nombre, apellido, direccion, dni, fecha);
				listaClientes.add(cliente);
			}
			return listaClientes;
		}catch (SQLException ex){
			System.out.println("No se ha podido conectar con su bbdd");
			System.out.println(ex);
		}
		return null;
		}
		public void insertarDatos() {
			}
	
}

