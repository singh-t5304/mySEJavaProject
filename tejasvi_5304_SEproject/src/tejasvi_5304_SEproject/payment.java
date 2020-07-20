package tejasvi_5304_SEproject;

public class payment {
	int payment_number;
	int payment_total;
	String payment_date;
	String payment_mode;
	
	
	public payment(int payment_number, int payment_total, String payment_date, String payment_mode) {
		super();
		this.payment_number = payment_number;
		this.payment_total = payment_total;
		this.payment_date = payment_date;
		this.payment_mode = payment_mode;
	}
	public int getPayment_number() {
		return payment_number;
	}
	public void setPayment_number(int payment_number) {
		this.payment_number = payment_number;
	}
	public int getPayment_total() {
		return payment_total;
	}
	public void setPayment_total(int payment_total) {
		this.payment_total = payment_total;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	
	

}
