package com.hibernate.practice.hibernatePractice;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	
	private String course;
	private String duration;
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration + ", getCourse()=" + getCourse()
				+ ", getDuration()=" + getDuration() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
