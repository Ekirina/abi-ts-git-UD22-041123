package models;

public class Proyecto {
	String id;
	String nombre;
	String horas;
	String[] arrayProyecto;
	
	public Proyecto(String id, String nombre, String horas) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}
	public String[] devolverArray() {
		arrayProyecto = new String[3];
		arrayProyecto[0]= id;
		arrayProyecto[1]= nombre;
		arrayProyecto[2]= horas;
	
		return arrayProyecto;
	}
}
