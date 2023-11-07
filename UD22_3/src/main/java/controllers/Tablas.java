package controllers;

public class Tablas extends ConexionSQL {
	public static void main(String[] args) {
		ConexionSQL.mySQLConnection("root", "primero", "");
		ConexionSQL.createDB("estudios");
		ConexionSQL.createTable("estudios", "Cientificos", "("
				+ "dni VARCHAR(8) primary key,"
				+ "nom_apels VARCHAR(255));");
		ConexionSQL.createTable("estudios", "Proyecto", "("
				+ "id VARCHAR(4) primary key,"
				+ "nombre VARCHAR(255), "
				+ "horas INT);");
		ConexionSQL.createTable("estudios", "Asignado_a", "("
				+ "cientifico VARCHAR(8),"
				+ "proyecto VARCHAR(4), "
				+ "foreign key(cientifico) REFERENCES Cientificos (dni)"
				+ "ON DELETE CASCADE ON UPDATE CASCADE,"
				+ "foreign key(proyecto) REFERENCES Proyecto (id)"
				+ "ON DELETE CASCADE ON UPDATE CASCADE,"
				+ "primary key(cientifico, proyecto));");
		ConexionSQL.insertData("estudios", "Cientificos", "(dni, nom_apels) values ('15465388', 'Thelma Bilbourg');");
		ConexionSQL.insertData("estudios", "Proyecto", "(id, nombre, horas) values ('9001', 'Canis Bilis', 150);");
		ConexionSQL.insertData("estudios", "Asignado_a", "(cientifico, proyecto) values ('15465388', '9001');");
		ConexionSQL.closeConnection();
	}
}
