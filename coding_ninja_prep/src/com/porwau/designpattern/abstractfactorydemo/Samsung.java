package com.porwau.designpattern.abstractfactorydemo;

public class Samsung implements Device {

	private String screenSize;
	private String ram;

	public Samsung(String screenSize, String ram) {
		super();
		this.screenSize = screenSize;
		this.ram = ram;
	}

	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}



	@Override
	public String getDetails() {
		return "Samsung mobile specs: RAM is " + getRam() + ", Screen Size is " + getScreenSize();
	}

}
