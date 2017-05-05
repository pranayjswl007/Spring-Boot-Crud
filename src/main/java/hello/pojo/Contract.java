package hello.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contract {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int contractId;
	private String name;
	private String businessNumber;
	private Date activationDate;
	private Double amountRequested;
	private String status;
	
	
	public int getContractId() {
		return contractId;
	}


	public void setContractId(int contractId) {
		this.contractId = contractId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBusinessNumber() {
		return businessNumber;
	}


	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}


	public Date getActivationDate() {
		return activationDate;
	}


	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}


	public Double getAmountReuested() {
		return amountRequested;
	}


	public void setAmountReuested(Double amountRequested) {
		this.amountRequested = amountRequested;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Contract(){
		/*this.contractId=200;
		this.name="Pikachu";*/
	}


	@Override
	public String toString() {
		return "Contract [contractId=" + contractId + ", name=" + name + ", businessNumber=" + businessNumber
				+ ", activationDate=" + activationDate + ", amountRequested=" + amountRequested + ", status=" + status
				+ "]";
	}

	
	
}
