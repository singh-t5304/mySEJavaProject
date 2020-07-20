package tejasvi_5304_SEproject;

public class product {
	int product_number;
	String product_name;
	String product_manufacturing_date;
	String product_expiry_date;
	String product_supplier;
	String product_brand;
	
	
	public product(int product_number, String product_name, String product_manufacturing_date,
			String product_expiry_date, String product_supplier, String product_brand) {
		super();
		this.product_number = product_number;
		this.product_name = product_name;
		this.product_manufacturing_date = product_manufacturing_date;
		this.product_expiry_date = product_expiry_date;
		this.product_supplier = product_supplier;
		this.product_brand = product_brand;
	}
	public int getProduct_number() {
		return product_number;
	}
	public void setProduct_number(int product_number) {
		this.product_number = product_number;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_manufacturing_date() {
		return product_manufacturing_date;
	}
	public void setProduct_manufacturing_date(String product_manufacturing_date) {
		this.product_manufacturing_date = product_manufacturing_date;
	}
	public String getProduct_expiry_date() {
		return product_expiry_date;
	}
	public void setProduct_expiry_date(String product_expiry_date) {
		this.product_expiry_date = product_expiry_date;
	}
	public String getProduct_supplier() {
		return product_supplier;
	}
	public void setProduct_supplier(String product_supplier) {
		this.product_supplier = product_supplier;
	}
	public String getProduct_brand() {
		return product_brand;
	}
	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}
	

}
