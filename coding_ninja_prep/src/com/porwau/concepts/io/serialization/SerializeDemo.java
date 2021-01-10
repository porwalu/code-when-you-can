package com.porwau.concepts.io.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	String name;
	int age;
	int employeeID;
	String designation;

	Employee(String name, int age, int employeeID, String designation) {
		this.name = name;
		this.age = age;
		this.employeeID = employeeID;
		this.designation = designation;
	}

	public String toString() {
				return "Name is " + name + ", Age is " + age + ", Employee # " + employeeID + ", Designation is " + designation;
	}
}

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String str = "Hello World!";
		String objectLoc = "C:\\\\Users\\\\porwau\\\\Desktop\\\\object";
		Employee e = new Employee("Utkarsh", 25, 101726, "PE");
		
		//System.out.println(e);
		//serialize(str);
		 serialize(e);
		System.out.println(deserialize(objectLoc));
	}

	private static void serialize(Object obj) throws IOException {
		ObjectOutputStream o = null;
		try {
			o = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream("C:\\\\Users\\\\porwau\\\\Desktop\\\\object")));
			o.writeObject(obj);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			o.close();
		}
	}

	private static Object deserialize(String objectLoc) throws IOException, ClassNotFoundException {
		System.out.println("Inside Deserialization");
		ObjectInputStream o = null;
		Object ret = null;
		try {
			o = new ObjectInputStream(new BufferedInputStream(new FileInputStream(objectLoc)));
			ret = o.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			o.close();
		}
		return ret;
	}
}
