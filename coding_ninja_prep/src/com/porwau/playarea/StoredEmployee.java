package com.porwau.playarea;

public class StoredEmployee {
	public String key;
	public Emp emp;
	public StoredEmployee(String key, Emp emp) {
		super();
		this.key = key;
		this.emp = emp;
	}
	@Override
	public String toString() {
		 return key + "->Emp [id=" + emp.getId() + ", firstName=" + emp.getFirstName() + ", lastName=" + emp.getLastName() + "]";
	}
}
