package com.porwau.designpattern.abstractfactorydemo;

public class Iphone implements Device {
	private String screenSize;
	private String ram;

	public Iphone(String screenSize, String ram) {
		super();
		this.screenSize = screenSize;
		this.ram = ram;
	}

	public Iphone() {
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
		return "Iphone specs: RAM is " + getRam() + ", Screen Size is " + getScreenSize();
	}

}
