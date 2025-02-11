package com.tka.eci.candidate.entity;

public class Candidate {
	
    private String name;
    private String assembly;
    private String stateName;
    private String partyName;
    private int age;
    private String gender;
    
    
	public Candidate( String name, String assembly, String stateName, String partyName, int age,
			String gender) {
		super();
		this.name = name;
		this.assembly = assembly;
		this.stateName = stateName;
		this.partyName = partyName;
		this.age = age;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAssembly() {
		return assembly;
	}


	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getPartyName() {
		return partyName;
	}


	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Candidate [ name=" + name + ", assembly=" + assembly + ", stateName=" + stateName
				+ ", partyName=" + partyName + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

    

}
