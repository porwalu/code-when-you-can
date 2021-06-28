package com.porwau.lambda;

import java.util.Arrays;
import java.util.List;

class Pers {

	@Override
	public String toString() {
		return "Pers [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	private int age;
	private String firstName;
	private String lastName;

	public Pers(int age, String firstName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}

public class LambdaDemo {

	public static void main(String[] args) {

		List<Pers> pList = Arrays.asList(new Pers(22, "Utkarsh", "Porwal"),
								new Pers(22, "Aru", "Porwal"));
		
	//	pList.forEach(p->System.out.println(p));
		
	//	pList.forEach(System.out::println);
		
		
		MyAdd addFunction = (int a, int b) -> a + b;

		Greeting myGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = () -> System.out.println("Hello World-1!!");

		// lambdas for runnable

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("task");

			}
		});
		// t.start();

		Thread myLambdaThread = new Thread(() -> System.out.println("using lambda inside Runnable"));
		Thread myLambdaThread1 = new Thread(LambdaDemo::test);

	//	myLambdaThread.start();
		//myLambdaThread1.start();
		// myGreeting.greet();
		// lambdaGreeting.greet();
		// throw new ArithmeticException();
		System.out.println("Stream foreach");
		pList.stream().forEach(p->System.out.println(p.getFirstName()));
		pList.stream().filter(p->p.getFirstName().contains("Utk")).forEach(System.out::println);

	}

	public void run() {
		System.out.println("task run ");
	}

	public static void test() {
		System.out.println("test from task");
	}

}

interface MyLambda {
	void print();
}

interface MyAdd {
	int add(int a, int b);
}
