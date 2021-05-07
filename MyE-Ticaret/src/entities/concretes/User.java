package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String name;
	private String lastName;
	private String ePosta;
	private String parola;

	

	public User(int id, String name, String lastName, String ePosta, String parola) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.ePosta = ePosta;
		this.parola = parola;

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEPosta() {
		return ePosta;
	}

	public void setEPosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

}
