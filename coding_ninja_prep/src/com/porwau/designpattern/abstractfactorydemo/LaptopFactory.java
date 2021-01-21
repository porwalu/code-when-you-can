package com.porwau.designpattern.abstractfactorydemo;

public class LaptopFactory implements DeviceFactory {

	@Override
	public Device getDevice(String brand) {

		if(brand.equalsIgnoreCase("dell")) {
			return new Dell();
		} else if(brand.equalsIgnoreCase("hp")) {
			return new HP();
		}
		return null;
	}

}
