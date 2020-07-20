package tejasvi_5304_SEproject;

public class order {
	int order_number;
	String order_date;
	String order_status;
	String order_shipping_address;
	
	
	
	public order(int order_number, String order_date, String order_status, String order_shipping_address) {
		super();
		this.order_number = order_number;
		this.order_date = order_date;
		this.order_status = order_status;
		this.order_shipping_address = order_shipping_address;
	}
	public int getOrder_number() {
		return order_number;
	}
	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getOrder_shipping_address() {
		return order_shipping_address;
	}
	public void setOrder_shipping_address(String order_shipping_address) {
		this.order_shipping_address = order_shipping_address;
	}
	

}
