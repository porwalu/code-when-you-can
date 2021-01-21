package com.porwau.designpattern.abstractfactorydemo;

public class DeviceFactoryProducer {
	
	public static DeviceFactory getDeviceFactory(String deviceType){
		if(deviceType.equalsIgnoreCase("mobile")) {
			return new MobileFactory();
		}else if(deviceType.equalsIgnoreCase("laptop")) {
			return new LaptopFactory();
		}
		
		return null;
	}

}
