package bean;

import java.io.Serializable;

public class Upload implements Serializable {
	private int id;
	private String filename;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
}
