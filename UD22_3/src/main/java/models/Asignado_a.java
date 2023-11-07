package models;

public class Asignado_a {
	String cientifico;
	String proyecto;
	String[] arrayAsignado_a;

	public Asignado_a(String cientifico, String proyecto) {
		
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}
	public String[] devolverArray() {
		arrayAsignado_a = new String[2];
		arrayAsignado_a[0]= cientifico;
		arrayAsignado_a[1]= proyecto;
	
		return arrayAsignado_a;

	}
	/**
	 * @return the cientifico
	 */
	public String getCientifico() {
		return cientifico;
	}
	/**
	 * @param cientifico the cientifico to set
	 */
	public void setCientifico(String cientifico) {
		this.cientifico = cientifico;
	}
	/**
	 * @return the proyecto
	 */
	public String getProyecto() {
		return proyecto;
	}
	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	} 

}

