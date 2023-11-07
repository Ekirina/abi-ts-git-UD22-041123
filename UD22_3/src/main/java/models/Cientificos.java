package models;

public class Cientificos {
	String dni;
	String nom_apels;
	String[] arrayCientificos;
	
	public Cientificos(String dni, String nom_apels) {
		
		this.dni = dni;
		this.nom_apels = nom_apels;
	}
	public String[] devolverArray() {
		arrayCientificos = new String[2];
		arrayCientificos[0]= dni;
		arrayCientificos[1]= nom_apels;
	
		return arrayCientificos;

	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the nom_apels
	 */
	public String getNom_apels() {
		return nom_apels;
	}
	/**
	 * @param nom_apels the nom_apels to set
	 */
	public void setNom_apels(String nom_apels) {
		this.nom_apels = nom_apels;
	}
}
