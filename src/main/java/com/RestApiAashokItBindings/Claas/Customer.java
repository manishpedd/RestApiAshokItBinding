package com.RestApiAashokItBindings.Claas;



public class Customer {
	
  private Integer customerId;
  
  private String customerName;
  
  private Long customerPhoneNumber;

public Integer getCustomerId() {
	return customerId;
}

public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public Long getCustomerPhoneNumber() {
	return customerPhoneNumber;
}

public void setCustomerPhoneNumber(Long customerPhoneNumber) {
	this.customerPhoneNumber = customerPhoneNumber;
}

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhoneNumber="
			+ customerPhoneNumber + "]";
}
  
  

}
