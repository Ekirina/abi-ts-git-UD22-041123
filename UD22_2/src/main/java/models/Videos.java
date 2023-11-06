package models;

public class Videos {
	String id;
	String title;
	String director;
	String cli_id;
	String [] arrayVideos;

	public Videos (String id, String title, String director, String cli_id) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.cli_id = cli_id;
	}	
	public String[] devolverArray() {
		arrayVideos = new String[4];
		arrayVideos[0]= id;
		arrayVideos[1]= title;
		arrayVideos[2]= director;
		arrayVideos[3]= cli_id;

		return arrayVideos;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @return the cli_id
	 */
	public String getCli_id() {
		return cli_id;
	}
	/**
	 * @param cli_id the cli_id to set
	 */
	public void setCli_id(String cli_id) {
		this.cli_id = cli_id;
	}
	/**
	 * @return the arrayVideos
	 */
}
