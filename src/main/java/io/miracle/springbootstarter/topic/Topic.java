package io.miracle.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String decscription;
	
	
	
	public Topic() {
		
	}
	
	
	
	public Topic(String id, String name, String decscription) {
		super();
		this.id = id;
		this.name = name;
		this.decscription = decscription;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDecscription() {
		return decscription;
	}
	public void setDecscription(String decscription) {
		this.decscription = decscription;
	}
	
	
	
}
