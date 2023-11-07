package controllers;
import views.VistaAsignado_a;
import views.VistaCientificos;
import views.VistaDeleteAsignado_a;
import views.VistaDeleteCientificos;
import views.VistaDeleteProyecto;
import views.VistaInsertAsignado_a;
import views.VistaInsertCientificos;
import views.VistaInsertProyecto;
import views.VistaPrincipal;
import views.VistaProyecto;
import views.VistaUpdateAsignado_a;
import views.VistaUpdateCientificos;
import views.VistaUpdateProyecto;

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
						vistaAsignado_a.refrescar();
					}		
				});
			}	
		});
		vistaCientificos.btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VistaUpdateCientificos vistaUpdateCientificos = new VistaUpdateCientificos();
				vistaUpdateCientificos.setVisible(true);
				vistaUpdateCientificos.Guardar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String dni = vistaUpdateCientificos.textDNI.getText();
						String nom_apels = vistaUpdateCientificos.textNom_apels.getText();		
						
						sentencia = "SET dni = "+dni+", nom_apels = '"+nom_apels+"' WHERE dni = "+dni+";";
						ConexionSQL.updateData("estudios", "Cientificos", sentencia);
						vistaCientificos.refrescar();
					}	
				});
			}
		});
		vistaProyecto.btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VistaUpdateProyecto vistaUpdateProyecto = new VistaUpdateProyecto();
				vistaUpdateProyecto.setVisible(true);
				vistaUpdateProyecto.Guardar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String id = vistaUpdateProyecto.textID.getText();
						String nombre = vistaUpdateProyecto.textNombre.getText();
						String horas = vistaUpdateProyecto.textHoras.getText();
						
						sentencia = "SET id = "+id+", nombre = '"+nombre+"', horas = "+horas+" WHERE id = "+id+";";
						ConexionSQL.updateData("estudios", "Proyecto", sentencia);
						vistaProyecto.refrescar();
					}	
				});
			}
		});
		vistaAsignado_a.btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VistaUpdateAsignado_a vistaUpdateAsignado_a = new VistaUpdateAsignado_a();
				vistaUpdateAsignado_a.setVisible(true);
				vistaUpdateAsignado_a.Guardar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String cientifico = vistaUpdateAsignado_a.textCientifico.getText();
						String proyecto = vistaUpdateAsignado_a.textProyecto.getText();
						
						sentencia = "SET cientifico = "+cientifico+", proyecto = '"+proyecto+" WHERE cientifico = "+cientifico+";";
						ConexionSQL.updateData("estudios", "Asignado_a", sentencia);
						vistaProyecto.refrescar();
					}	
				});
			}
		});
		vistaCientificos.btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VistaInsertCientificos vistaInsertCientificos = new VistaInsertCientificos();
				vistaInsertCientificos.setVisible(true);
				vistaInsertCientificos.Guardar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						String dni = vistaInsertCientificos.textDNI.getText();
						String nom_apels = vistaInsertCientificos.textNom_apels.getText();
						
						sentencia = "(dni, nom_apels) values ('"+dni+"', '"+nom_apels+"');";
						ConexionSQL.insertData("estudios", "Cientificos", sentencia);
						vistaCientificos.refrescar();
					}
				});
			}
		});
		vistaProyecto.btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VistaInsertProyecto vistaInsertProyecto = new VistaInsertProyecto();
				vistaInsertProyecto.setVisible(true);
				vistaInsertProyecto.Guardar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						String id = vistaInsertProyecto.textId.getText();
						String nombre = vistaInsertProyecto.textNombre.getText();
						String horas = vistaInsertProyecto.textHoras.getText();
						
						sentencia = "(id, nombre, horas) values ('"+id+"', '"+nombre+"', "+horas+");";
						ConexionSQL.insertData("estudios", "Proyecto", sentencia);
						vistaProyecto.refrescar();
					}
				});
			}
		});
		vistaAsignado_a.btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				VistaInsertAsignado_a vistaInsertAsignado_a = new VistaInsertAsignado_a();
				vistaInsertAsignado_a.setVisible(true);
				vistaInsertAsignado_a.Guardar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						String cientifico = vistaInsertAsignado_a.textCientifico.getText();
						String proyecto = vistaInsertAsignado_a.textProyecto.getText();
						
						sentencia = "(cientifico, proyecto) values ('"+cientifico+"', '"+proyecto+"');";
						ConexionSQL.insertData("estudios", "Asignado_a", sentencia);
						vistaAsignado_a.refrescar();
					}
				});
			}
		});
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