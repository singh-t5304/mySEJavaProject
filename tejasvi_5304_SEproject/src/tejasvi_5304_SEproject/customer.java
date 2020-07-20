package tejasvi_5304_SEproject;

public class customer {
	int customer_id;
	 String name;
	 String dob;
	 String address;
	 int phone_number;
	 
	 
	 
	 public customer(int customer_id, String name, String dob, String address, int phone_number) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.phone_number = phone_number;
	}

	public void Login() {
		 
	 }
	 
	 public void ChangePassword() {
		 
	 }
	 
	 public void PlaceOrder() {
		 
	 }
	 
	 public void MakePayment() {
		 
	 }
	 
	 public void CancelOrder() {
		 
	 }

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

}
