package com.mindtree.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Patient_details")
public class Patient implements Serializable {
	@Id
	@SequenceGenerator(name="Patient_SEQ",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "Patient_SEQ",strategy = GenerationType.AUTO)
	@Column(name = "Pat_ID")
	private int id;

	@Column(name="PNAME",length = 25,nullable = false)
	private String name;
	
	@Column(name="visDoc",length = 25,nullable = false)
	private String visitedDoc;
	
	@Column(name="Dvisit")
	private Date dtOfVisit;
	
	@Column(name="Pres",length = 150,nullable = false)
	private String Prescription;

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

	public String getVisitedDoc() {
		return visitedDoc;
	}

	public void setVisitedDoc(String visitedDoc) {
		this.visitedDoc = visitedDoc;
	}

	public Date getDtOfVisit() {
		return dtOfVisit;
	}

	public void setDtOfVisit(Date dtOfVisit) {
		this.dtOfVisit = dtOfVisit;
	}

	public String getPrescription() {
		return Prescription;
	}

	public void setPrescription(String prescription) {
		Prescription = prescription;
	}

	public Patient(int id, String name, String visitedDoc, Date dtOfVisit, String prescription) {
		super();
		this.id = id;
		this.name = name;
		this.visitedDoc = visitedDoc;
		this.dtOfVisit = dtOfVisit;
		Prescription = prescription;
	}

	public Patient() {
		super();
	}
	
	
}
