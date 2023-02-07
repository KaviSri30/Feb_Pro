package org.phone;

public class PhoneInfo1 {

	public void Phoneinfo() {
		System.out.println("One Plus");
	}
	
	public void Phoneinfo(int tot) {
		System.out.println("Total Manu:"+tot);
	}
	
	public void Phoneinfo(int tot,String model) {
		System.out.println("Total Manu:"+tot);
		System.out.println("Phone model:"+model);
	}
	
	public void Phoneinfo(int tot,String model,int store) {
		System.out.println("Total Manu:"+tot);
		System.out.println("Phone model:"+model);
		System.out.println("Phone storage:"+store);
	}
	
	public void Phoneinfo(int tot,String model,String store,int price) {
		System.out.println("Total Manu:"+tot);
		System.out.println("Phone model:"+model);
		System.out.println("Phone storage:"+store);
		System.out.println("Phone Price:Rs."+price);
	}
	public static void main(String[] args) {
		PhoneInfo1 p = new PhoneInfo1();
		p.Phoneinfo();
		p.Phoneinfo(400, "8T");
		p.Phoneinfo(400, "8T", "32GB", 32000);
	}
	
}
