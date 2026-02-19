package in.pwskills.nitin.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="stdtab")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer stdId;
	
	@Column(name="sname")
	private String stdName;
	
	
	@Column(name="sfee")
	private Double stdFee;
	
	@Column(name="sdoj")
	private LocalDateTime stdDoj;

	
	
	public Student() {
		
	}
	

	public Student(String stdName, Double stdFee, LocalDateTime stdDoj) {
		super();
		this.stdName = stdName;
		this.stdFee = stdFee;
		this.stdDoj = stdDoj;
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Double getStdFee() {
		return stdFee;
	}

	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}

	public LocalDateTime getStdDoj() {
		return stdDoj;
	}

	public void setStdDoj(LocalDateTime stdDoj) {
		this.stdDoj = stdDoj;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + ", stdDoj=" + stdDoj + "]";
	}
	
	
	

}
