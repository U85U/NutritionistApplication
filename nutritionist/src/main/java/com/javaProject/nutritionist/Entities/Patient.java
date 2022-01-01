package com.javaProject.nutritionist.Entities;

import javax.persistence.*;

@Entity
@Table(name = "patienttbl")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "Nationalidentity")
	private String NationalIdentity;
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "Surname")
	private String Surname;
	
	@Column(name = "Disease")
	private String Disease;
	
	@Column(name = "Diet")
	private String Diet;
	
	@Column(name = "Dietstartdate")
	private String DietStartDate;
	
	@Column(name = "Nutritionistnationalidentity")
	private String NutritionistNationalIdentity;
	
	@Column(name = "Password")
	private String Password;
	
	public Patient(int id, String nationalIdentity, String name, String surname, String disease, String diet, String dietStartDate, String nutritionistNationalIdentity, String password) {
		this.id = id;
		NationalIdentity = nationalIdentity;
		Name = name;
		Surname = surname;
		Disease = disease;
		Diet = diet;
		DietStartDate = dietStartDate;
		NutritionistNationalIdentity = nutritionistNationalIdentity;
		Password = password;
	}
	
	public Patient() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getDisease() {
		return Disease;
	}

	public void setDisease(String disease) {
		Disease = disease;
	}

	public String getDiet() {
		return Diet;
	}

	public void setDiet(String diet) {
		Diet = diet;
	}

	public String getDietStartDate() {
		return DietStartDate;
	}

	public void setDietStartDate(String dietStartDate) {
		DietStartDate = dietStartDate;
	}

	public String getNutritionistNationalIdentity() {
		return NutritionistNationalIdentity;
	}

	public void setNutritionistNationalIdentity(String nutritionistNationalIdentity) {
		NutritionistNationalIdentity = nutritionistNationalIdentity;
	}
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
	

}
