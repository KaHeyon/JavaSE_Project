package mylab.student.entity;

import mylab.student.exception.InvalidGradeException;

public class Student {

	private int studentId;
	private String name;
	private String major;
	private int grade;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) throws InvalidGradeException {
		if (grade>=1 && grade <=4) {
			this.grade = grade;
		} else {
			throw new InvalidGradeException("학년은 1~4 사이의 값이어야 합니다.");
		}
	}
	
	
}
