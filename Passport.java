import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passport_tbl")
public class Passport {
	@Id
	@Column(name="passport_no")
	private int passportNum;
	
	@Column(name="passport_issue_date")
	LocalDate passportIssueDate;
	
	@Column(name="passport_expiry_date")
	LocalDate passportExpiryDate;
	
	@Column(name="passport_issued_by")
	String issuedBy;
	
	
	
	
	public int getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(int passportNum) {
		this.passportNum = passportNum;
	}
	public LocalDate getPassportIssueDate() {
		return passportIssueDate;
	}
	public void setPassportIssueDate(LocalDate passportIssueDate) {
		this.passportIssueDate = passportIssueDate;
	}
	public LocalDate getPassportExpiryDate() {
		return passportExpiryDate;
	}
	public void setPassportExpiryDate(LocalDate passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	
	

}
