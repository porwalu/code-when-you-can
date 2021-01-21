package com.porwau.designpattern.abstractfactorydemo;

public class AbstractFactoryClient {

//	private boolean isValidMobileFactory;
//	private boolean isValidLaptopFactory;
//
//	public boolean isValidLaptopFactory() {
//		return isValidLaptopFactory;
//	}
//
//	public void setValidLaptopFactory(boolean isValidLaptopFactory) {
//		this.isValidLaptopFactory = isValidLaptopFactory;
//	}

	public static void main(String[] args) {
		boolean isValidMobileFactory = true;
		boolean isValidLaptopFactory = true;
		
		// TODO Auto-generated method stub
		DeviceFactory mobileFactory = DeviceFactoryProducer.getDeviceFactory("Mobile");
		DeviceFactory laptopFactory = DeviceFactoryProducer.getDeviceFactory("Laptop");

		if(isFactoryNull(mobileFactory)) {
				System.out.println("Invalid mobile factory requested");
				isValidMobileFactory = false;
			}
		
		if(isFactoryNull(laptopFactory)) {
		
			System.out.println("Invalid Laptop factory requested.");
			isValidLaptopFactory = false;
		}
			
		Device device1 = isValidMobileFactory ? mobileFactory.getDevice("samsung"):null;
		Device device2 = isValidLaptopFactory ? laptopFactory.getDevice("HP"):null;
		Device device3 = isValidLaptopFactory ? laptopFactory.getDevice("ASUS") : null;
		
		if(device1 != null)
			System.out.println(device1.getDetails());
		
		if(device2 != null)
			System.out.println(device2.getDetails());
		
		if(device3 != null)
			System.out.println(device3.getDetails());
		
//	System.out.println(mobileFactory.getDevice("samsung").getDetails());
//		System.out.println(laptopFactory.getDevice("HP").getDetails());
//		//mobileFactory.getDevice("apple");


	}

	private static boolean isFactoryNull(DeviceFactory factoryIdentifier) {
		return factoryIdentifier == null ? true:false;
	}
	private static boolean isDeviceNull(Device device) {
		return device == null ? true:false;
	}

}
