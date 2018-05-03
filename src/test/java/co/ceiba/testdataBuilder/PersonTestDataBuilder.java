package co.ceiba.testdataBuilder;

import co.ceiba.domain.Person;

public class PersonTestDataBuilder {
	
	private String name;
	private String lastName;
	
	
	public PersonTestDataBuilder(String name, String lastName) {
		
		this.name = "Ceiba";
		this.lastName = "Software House";
	};
	
	public PersonTestDataBuilder withName(String name) {
		
		this.name = name;
		return this;
	}
	
	
	public PersonTestDataBuilder withLastName(String lastName) {
		
		this.lastName = lastName;
		return this;
	}
	
	public Person build() {
		return new Person(this.name, this.lastName);
	}
	

}
