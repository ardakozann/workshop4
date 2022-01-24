package workshop4.entitites.concretes;

import workshop4.entitites.abstracts.Entity;

public class Brand implements Entity{
	private int id;
	private String name;
	public Brand() {
		super();
	}
	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
