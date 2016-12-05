package Model;

import java.util.Date;

public class Student {
	public int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getAverage_score() {
		return average_score;
	}

	public void setAverage_score(Double average_score) {
		this.average_score = average_score;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String code;
	public String address;
	public Double average_score;
	public Date birth;
	
	public Student() {
		
	}
	
	public Student(int Id, String Name, String Code, String Address, Double ave, Date Birth) {
		this.id=Id;
		this.name=Name;
		this.code=Code;
		this.address=Address;
		this.birth=Birth;
		
	}
}
