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
		ConexionSQL.insertData("videoclub", "Cliente", "(id, nombre, apellido, direccion, dni, fecha) values (10, 'Elna', 'Benbough', "
				+ "'95897 Veith Avenue', 10, '2023-03-27');");
		ConexionSQL.insertData("videoclub", "Cliente", "(id, nombre, apellido, direccion, dni, fecha) values (8, 'Ferfetch', 'Bull', "
				+ "'65432 Day Avenue', 9, '2023-01-17');");
		ConexionSQL.insertData("videoclub", "Cliente", "(id, nombre, apellido, direccion, dni, fecha) values (7, 'Charm', 'Meryl', "
				+ "'53402 Post Avenue', 6, '2023-05-07');");
		ConexionSQL.closeConnection();
	}
}
