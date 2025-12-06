package com.awwal.api.payloads;

import lombok.NoArgsConstructor;

@NoArgsConstructor	
public class PersonDto {
	private int a_id;
	private int id;
	private String person_name;	
	private String person_email;
    private String occupation;
    private int experience;
    private double ctcInLpa;
    private String crtDt;
    private String lstUpdtDt;

    
    
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
	@Override
	public String toString() {
		return "PersonDto [a_id=" + a_id + ", id=" + id + ", person_name=" + person_name + ", person_email="
				+ person_email + ", occupation=" + occupation + ", experience=" + experience + ", ctcInLpa=" + ctcInLpa
				+ ", crtDt=" + crtDt + ", lstUpdtDt=" + lstUpdtDt + "]";
	}
	

	
    
}
