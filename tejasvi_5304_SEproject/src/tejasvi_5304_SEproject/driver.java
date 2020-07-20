package tejasvi_5304_SEproject;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System .in);
		System.out.println("Enter user name");
		String name=input.next();
		System.out.println("Enter dob");
		String dob=input.next();
		System.out.println("Enter address");
		String address=input.next();
		System.out.println("Enter phone number:");
		int num=input.nextInt();
		System.out.println("Enter ID:");
		int id=input.nextInt(); 
		customer cust1=new customer(id,name,dob,address,num);
        System.out.println("ID: "+cust1.getCustomer_id()+ " Name: "+cust1.getName()+ "  dob:"+cust1.getDob()+"   address:"+cust1.getAddress()+"   phone number:"+cust1.getPhone_number());
        
        
	}

}
