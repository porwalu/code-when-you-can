package com.porwau.designpattern.abstractfactorydemo;

public class MobileFactory implements DeviceFactory {

	@Override
	public Device getDevice(String brand) {

		if(brand.equalsIgnoreCase("iphone")) {
			return new Iphone();
		} else if(brand.equalsIgnoreCase("samsung")) {
			return new Samsung();
		}
		return null;
	}

}
