package controllers;
import views.VistaAsignado_a;
import views.VistaCientificos;
import views.VistaDeleteAsignado_a;
import views.VistaDeleteCientificos;
import views.VistaDeleteProyecto;
import views.VistaPrincipal;
import views.VistaProyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.Asignado_a;
import models.Cientificos;
import models.Proyecto;
public class Controlador {
	String db = "";
	String name = "";
	String sentencia = "";
	Connection conexion;
	VistaPrincipal vistaPrincipal;
	VistaCientificos vistaCientificos;
	VistaProyecto vistaProyecto;
	VistaAsignado_a vistaAsignado_a;
	
	public Controlador(VistaPrincipal vista, VistaCientificos vistaCientificos, VistaProyecto vistaProyecto, VistaAsignado_a vistaAsignado_a) {
		this.vistaPrincipal = vista;
		this.vistaPrincipal.setVisible(true);
		this.vistaCientificos = vistaCientificos;
		this.vistaProyecto= vistaProyecto;
		this.vistaAsignado_a = vistaAsignado_a;
		vista.btnCientificos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				vistaPrincipal.setVisible(false);
				vistaCientificos.setVisible(true);
				vistaCientificos.btnVolver.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						vistaCientificos.setVisible(false);
						vista.setVisible(true);
					}			
				});
			}		
		});
		vista.btnProyectos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				vistaPrincipal.setVisible(false);
				vistaProyecto.setVisible(true);
				vistaProyecto.btnVolver.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						vistaProyecto.setVisible(false);
						vista.setVisible(true);
					}			
				});
			}		
		});
		vista.btnAsignaciones.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				vistaPrincipal.setVisible(false);
				vistaAsignado_a.setVisible(true);
				vistaAsignado_a.btnVolver.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						vistaAsignado_a.setVisible(false);
						vista.setVisible(true);
					}			
				});
			}		
		});
		vistaCientificos.btnEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VistaDeleteCientificos vistaDeleteCientificos = new VistaDeleteCientificos();
				vistaDeleteCientificos.setVisible(true);
				vistaDeleteCientificos.eliminar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String dni = vistaDeleteCientificos.textDNI.getText();
						sentencia = "WHERE dni = "+dni+";";
						ConexionSQL.deleteData("estudios", "Cientificos", sentencia);
						vistaCientificos.refrescar();
					}		
				});
			}	
		});
		vistaProyecto.btnEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VistaDeleteProyecto vistaDeleteProyecto = new VistaDeleteProyecto();
				vistaDeleteProyecto.setVisible(true);
				vistaDeleteProyecto.eliminar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String id = vistaDeleteProyecto.textID.getText();
						sentencia = "WHERE id = "+id+";";
						ConexionSQL.deleteData("estudios", "Proyecto", sentencia);
						vistaProyecto.refrescar();
					}		
				});
			}	
		});
		vistaAsignado_a.btnEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VistaDeleteAsignado_a vistaDeleteAsignado_a = new VistaDeleteAsignado_a();
				vistaDeleteAsignado_a.setVisible(true);
				vistaDeleteAsignado_a.eliminar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String cientifico = vistaDeleteAsignado_a.textCientifico.getText();
						sentencia = "WHERE cientifico = "+cientifico+";";
						ConexionSQL.deleteData("estudios", "Asignado_a", sentencia);
						vistaProyecto.refrescar();
					}		
				});
			}	
		});
		/*vista.btnUpdate.addActionListener(new ActionListener() {

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
		});*/
	}

	public static ArrayList<Cientificos> mostrarTablaCientificos () {
		try {
			ArrayList<Cientificos> listaCientificos = new ArrayList<Cientificos>();	
			ConexionSQL.mySQLConnection("root", "primero", "estudios");
			Statement st = ConexionSQL.conexion.createStatement();
			String sentencia = "SELECT * FROM Cientificos;";
			ResultSet result = st.executeQuery(sentencia); //en conexion SQL es executeUpdate
			while (result.next()) {
				Cientificos cientificos;
				String dni;
				String nom_apels;
				dni=result.getString(1);	
				nom_apels=result.getString(2);	
				cientificos = new Cientificos(dni, nom_apels);
				listaCientificos.add(cientificos);
			}
			return listaCientificos;
		}catch (SQLException ex){
			System.out.println("No se ha podido conectar con su bbdd");
			System.out.println(ex);
		}
		return null;
		}
	public static ArrayList<Proyecto> mostrarTablaProyecto () {
		try {
			ArrayList<Proyecto> listaProyecto = new ArrayList<Proyecto>();	
			ConexionSQL.mySQLConnection("root", "primero", "estudios");
			Statement st = ConexionSQL.conexion.createStatement();
			String sentencia = "SELECT * FROM Proyecto;";
			ResultSet result = st.executeQuery(sentencia); //en conexion SQL es executeUpdate
			while (result.next()) {
				Proyecto proyecto;
				String id;
				String nombre;
				String horas;
				id=result.getString(1);	
				nombre=result.getString(2);
				horas=result.getString(3);
				proyecto = new Proyecto(id, nombre, horas);
				listaProyecto.add(proyecto);
			}
			return listaProyecto;
		}catch (SQLException ex){
			System.out.println("No se ha podido conectar con su bbdd");
			System.out.println(ex);
		}
		return null;
		}
public static ArrayList<Asignado_a> mostrarTablaAsignado_a () {
		try {
			ArrayList<Asignado_a> listaAsignado_a = new ArrayList<Asignado_a>();	
			ConexionSQL.mySQLConnection("root", "primero", "estudios");
			Statement st = ConexionSQL.conexion.createStatement();
			String sentencia = "SELECT * FROM Asignado_a;";
			ResultSet result = st.executeQuery(sentencia); //en conexion SQL es executeUpdate
			while (result.next()) {
				Asignado_a asignado_a;
				String cientifico;
				String proyecto;
				cientifico=result.getString(1);	
				proyecto=result.getString(2);
				asignado_a = new Asignado_a(cientifico, proyecto);
				listaAsignado_a.add(asignado_a);
			}
			return listaAsignado_a;
		}catch (SQLException ex){
			System.out.println("No se ha podido conectar con su bbdd");
			System.out.println(ex);
		}
		return null;
		}
		public void insertarDatos() {
			}
	
}