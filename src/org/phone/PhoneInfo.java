package org.phone;

public class PhoneInfo {
	public void phoneName() {
		System.out.println("iphone");
	}
	public void phoneMieiNum() {
		System.out.println("02347 5458 2039");
	}
	public void Camera() {
		System.out.println("12 MP");
	}
	public void Storage() {
		System.out.println("256GB");
	}
	public void OsName() {
		System.out.println("iOS 16.1.1");
	}
	public static void main(String[] args) {
		PhoneInfo c=new PhoneInfo();
		c.phoneName();
		c.phoneMieiNum();
		c.Camera();
		c.Storage();
		c.OsName();
	}
}