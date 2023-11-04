package controllers;

public class Tablas extends ConexionSQL{
	public static void main(String[] args) {
		ConexionSQL.mySQLConnection("root", "primero", "");
		ConexionSQL.createDB("videoclub");
		ConexionSQL.createTable("videoclub", "Cliente", "("
				+ "id INT(11) primary key auto_increment,"
				+ "nombre VARCHAR(250) DEFAULT NULL, "
				+ "apellido VARCHAR(250) DEFAULT NULL, "
				+ "direccion VARCHAR(250) DEFAULT NULL, "
				+ "dni INT(11) DEFAULT NULL, "
				+ "fecha date DEFAULT NULL)");
		ConexionSQL.insertData("videoclub", "Cliente", "(id, nombre, apellido, direccion, dni, fecha) values ('9565065341', 'Elna', 'Benbough', "
				+ "'95897 Veith Avenue', 69309020291, '2023-03-27'),");
		ConexionSQL.closeConnection();
	}
}
