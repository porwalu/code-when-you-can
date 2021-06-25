package com.porwau.designpatterns;


interface Device{
	void getDetails();
}

class HP implements Device{

	@Override
	public void getDetails() {
		System.out.println("I am HP Laptop.");		
		
	}
	
}

class Compaq implements Device{

	@Override
	public void getDetails() {
		System.out.println("I am Compaq Laptop.");		
		
	}
	
}

class Samsung implements Device{

	@Override
	public void getDetails() {
		System.out.println("I am Samsung Phone");		
	}
	
}

class Iphone implements Device{

	@Override
	public void getDetails() {
		System.out.println("I am iPhone Phone");		
		
	}
	
}

class FactoryGenerator{
	
	DeviceFactory getFactory(String type) {
		
		if(type.equalsIgnoreCase("mobile")){
			return new MobileFactory();
		}else if(type.equalsIgnoreCase("laptop")){
			return new LaptopFactory();
		}
		
		System.out.println("invalid factory requested - " + type);
		return null;
	}
	
}
interface DeviceFactory{
	
	Device getDevice(String desc);
	
}

class LaptopFactory implements DeviceFactory{

	@Override
	public Device getDevice(String desc) {
		if(desc.equalsIgnoreCase("hp")) {
			return new HP();
		}else if(desc.equalsIgnoreCase("compaq")) {
			return new Compaq();
		}
		System.out.println("Invalid laptop requested - " + desc);
		return null;		
	}
	
}

class MobileFactory implements DeviceFactory{

	@Override
	public Device getDevice(String desc) {
		if(desc.equalsIgnoreCase("iphone")) {
			return new Iphone();
		}else if(desc.equalsIgnoreCase("samsung")) {
			return new Samsung();
		}
		System.out.println("Invalid mobile requested - " + desc);
		return null;		
	}
	
}
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		FactoryGenerator fof = new FactoryGenerator();
		
		DeviceFactory mobileFactory = fof.getFactory("mobile");
		DeviceFactory laptopFactory = fof.getFactory("laptop");
		DeviceFactory anotherFactory = fof.getFactory("consoles");

		
		Device hp = laptopFactory.getDevice("HP");
		hp.getDetails();
		Device dell = laptopFactory.getDevice("Dell");
		if(dell != null) dell.getDetails();
		
		mobileFactory.getDevice("samsung").getDetails();;
		Device oppo = mobileFactory.getDevice("Oppo");
		if(oppo != null) oppo.getDetails();
		
	}

}
