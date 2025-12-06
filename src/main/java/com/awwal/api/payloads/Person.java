package com.awwal.api.payloads;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int a_id;
	
	@Column(nullable = false)
	private int id;
	
	@Column(nullable = false)
	private String person_name;	
	
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getPerson_email() {
		return person_email;
	}
	public void setPerson_email(String person_email) {
		this.person_email = person_email;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getCtcInLpa() {
		return ctcInLpa;
	}
	public void setCtcInLpa(double ctcInLpa) {
		this.ctcInLpa = ctcInLpa;
	}
	public String getCrtDt() {
		return crtDt;
	}
	public void setCrtDt(String crtDt) {
		this.crtDt = crtDt;
	}
	public String getLstUpdtDt() {
		return lstUpdtDt;
	}
	public void setLstUpdtDt(String lstUpdtDt) {
		this.lstUpdtDt = lstUpdtDt;
	}
	@Column(nullable = false)
	private String person_email;
	
	@Column(nullable = false)
    private String occupation;
	
	
    private int experience;
    private double ctcInLpa;
    private String crtDt;
    private String lstUpdtDt;
}
