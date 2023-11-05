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
		ConexionSQL.createTable("videoclub", "Videos", "("
				+ "id INT(11) primary key auto_increment,"
				+ "title VARCHAR(250) DEFAULT NULL, "
				+ "director VARCHAR(250) DEFAULT NULL, "
				+ "cli_id INT(11)"
				+ "foreign key(cli_id) REFERENCES Cliente (id)"
				+ "ON DELETE CASCADE ON UPDATE CASCADE)");
		ConexionSQL.insertData("videoclub", "Cliente", "(id, nombre, apellido, direccion, dni, fecha) values ('9565065341', 'Elna', 'Benbough', "
				+ "'95897 Veith Avenue', 69309020291, '2023-03-27'),");
		ConexionSQL.insertData("videoclub", "Videos", "(id, title, director, cli_id) values ('9000000001', 'Big', 'Penny Marshall', "
				+ "'9565065341'),");
		ConexionSQL.closeConnection();
	}
}
