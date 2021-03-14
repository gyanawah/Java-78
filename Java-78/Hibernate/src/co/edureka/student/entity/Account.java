package co.edureka.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT", schema = "java78")
public class Account {
	@Id
	@Column(name = "ACNO", length = 5, precision = 0, unique = true, nullable = false)
	private Long acno;
	
	@Column(name = "NAME", length = 30)
	private String name;
	
	@Column(name="BALANCE", length=8, precision = 2)
	private Float bal;	

	public Account(Long acno, String name, Float bal) {
		super();
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}

	public Long getAcno() {
		return acno;
	}

	public void setAcno(Long acno) {
		this.acno = acno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getBal() {
		return bal;
	}

	public void setBal(Float bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [acno=" + acno + ", name=" + name + ", bal=" + bal + "]";
	}

}
