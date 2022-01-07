package com.porwau.prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Address{
	private String apartmentDetails;
	private String streetDetails;
	private String city;
	private String state;
	private String postcode;
	public String getApartmentDetails() {
		return apartmentDetails;
	}
	public void setApartmentDetails(String apartmentDetails) {
		this.apartmentDetails = apartmentDetails;
	}
	public String getStreetDetails() {
		return streetDetails;
	}
	public void setStreetDetails(String streetDetails) {
		this.streetDetails = streetDetails;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public Address(String apartmentDetails, String streetDetails, String city, String state, String postcode) {
		super();
		this.apartmentDetails = apartmentDetails;
		this.streetDetails = streetDetails;
		this.city = city;
		this.state = state;
		this.postcode = postcode;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
}

class Person{
	String fName;
	String lname;
	String phone;
	Address address;
	Account account  = new Account();
	Role role;
	public Person(String fName, String lname, String phone, Address address, Account account, Role role) {
		super();
		this.fName = fName;
		this.lname = lname;
		this.phone = phone;
		this.address = address;
	//	this.account = account;
		this.role=role;
	}
	
}

enum AccountStatus{
	ACTIVE,
	CLOSED,
	INACTIVE,
	SUSPENDED;
}

enum Role{
	FRONTDESK,
	USER,
	ADMIN;
}

class Account{
	AccountStatus accountStatus = AccountStatus.ACTIVE;

}
class Admin extends Person{

	public Admin(String fName, String lname, String phone, Address address, Account account) {
		super(fName, lname, phone, address, account, Role.ADMIN);
		// TODO Auto-generated constructor stub
	}
	
	void addMovie() {
		System.out.println("Only Admin can add movie");
	}
	
}
class Guest{
	void register() {
		
	}
}
class UserDao{
	static Map<String,Person> usermap= new HashMap<>();
	static {
		
		usermap.put("1", new Admin("Utkarsh", "Porwal", "9742203564", new Address(), new Account()));
	}
	
	Person getUser(String id) {
		if(usermap.containsKey(id))return usermap.get(id);
		return null;
	}
}
class AccountValidator{
	UserDao userDB = new UserDao();
	static Map<String,String> usercreds = new HashMap<>();;

	static {
		usercreds.put("1", "1");
		usercreds.put("2", "2");
	}
	public Person validate(String id, String password) {
		
		if(usercreds.containsKey(id) && usercreds.get(id).equals(password)) {
			return userDB.getUser(id);
		}
			System.out.println("User Not valid ");
			return null;
	}
	
}

class AccFacade{
	AccountValidator av = new AccountValidator();
}
public class UserAccountDemo {
	public static void main(String[] args) {
		AccFacade af = new AccFacade();
		Person person = af.av.validate("1", "1");
		System.out.println("check person");
		if(person instanceof Admin) {
			System.out.println("I am admin");
			((Admin) person).addMovie();
			
		}
		String s = "hello";
	List<StringBuilder> list = new ArrayList<>(3);
	list.add(new StringBuilder());
	

	
	
	ExecutorService tp = Executors.newFixedThreadPool(12);
	Future<?> fut = tp.submit(()-> {System.out.println("hello");});
String s1 = "  Hello";
String s2 = s1.replaceAll("^\\s*", "V");
System.out.println(s2);

	
	Thread t = new Thread(() ->{System.out.println("hi");});
	
list.get(0).append(s.charAt(0));
	}

}
