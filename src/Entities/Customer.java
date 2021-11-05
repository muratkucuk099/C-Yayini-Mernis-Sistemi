package Entities;

import java.sql.Date;

import Abstract.IEntity;


public class Customer implements IEntity {
	
	int id;
	String name;
	String lastName;
	int dateOfBirth;
	long nationalityId;
	
	
	
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	

}
