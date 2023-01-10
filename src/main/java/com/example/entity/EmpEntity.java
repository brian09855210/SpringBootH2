package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import net.bytebuddy.implementation.auxiliary.AuxiliaryType.SignatureRelevant;

@Entity
@Table(name="EMPLOYEE")
public class EmpEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private String id ;
	
	@NotBlank(message="名字不能為空")
//	@Size(max = 10, message="名字長度最長10位")
	@Length(max=10, message="名字長度最長10位")
	private String name ;
	
	private String sex ;
	
	private Date hiredate ;
	
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
}
